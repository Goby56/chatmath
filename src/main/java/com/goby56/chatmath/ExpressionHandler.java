package com.goby56.chatmath;

import com.goby56.chatmath.antlr.ChatMathLexer;
import com.goby56.chatmath.antlr.ChatMathParser;
import com.goby56.chatmath.util.StringMethods;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.entity.Entity;

import java.text.DecimalFormat;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import static com.goby56.chatmath.util.MathImplementation.evaluateExpression;

public class ExpressionHandler {
    public static boolean replaceExpression(TextFieldWidget field) {
        // The player pressed tab and the expression should be replaced with the result

        String currentExpression = StringMethods.getWordAtCursor(field.getText(), field.getCursor());

        Entity player = MinecraftClient.getInstance().player;

        if (!isValidExpression(currentExpression)) return false;

        currentExpression = currentExpression.replaceAll("x", String.valueOf(player.getX()));
        currentExpression = currentExpression.replaceAll("y", String.valueOf(player.getY()));
        currentExpression = currentExpression.replaceAll("z", String.valueOf(player.getZ()));

        try {
            String result = new DecimalFormat("#.#").format(evaluateExpression(currentExpression));
            insertResult(field, result);
            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean evaluateAllExpressions(TextFieldWidget field) {
        // Go through the whole field and replace any expression with a result

        String[] expressions = field.getText().split(" ");

        int cursor = 0;
        for (int i = 0; i<expressions.length; i++) {
            cursor += expressions[i].length();

            field.setCursor(cursor);
            replaceExpression(field);
        }
        return true;
    }

    public static void insertResult(TextFieldWidget field, String result) {

        String text = field.getText();
        int cursor = field.getCursor();

        int start = StringMethods.firstIndex(text, cursor);
        int end = StringMethods.lastIndex(text, cursor);

        String replacement = text.substring(0, start) + result + text.substring(end);

        field.setText(replacement);
    }

    public static boolean isValidExpression(String expr) {
        ChatMathLexer lexer = new ChatMathLexer(new ANTLRInputStream(expr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ChatMathParser parser = new ChatMathParser(tokens);

        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());

        try {
            parser.expression();
        }  catch (ParseCancellationException e) {
            return false;
        } finally {
            String[] validCharacters = {"+", "-", "*", "/", "^"};
            for (String character: validCharacters) {
                if (expr.contains(character)) return true;
            }
            return false;
        }
    }
}
