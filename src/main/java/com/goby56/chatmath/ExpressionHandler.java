package com.goby56.chatmath;

import com.goby56.chatmath.util.MathImplementation;
import com.goby56.chatmath.util.StringMethods;
import net.minecraft.client.gui.widget.TextFieldWidget;

public class ExpressionHandler {
    public static void handleExpression(TextFieldWidget field) {
        String chatFieldText = field.getText();
        int cursor = field.getCursor();

        String currentExpression = StringMethods.getWordAtCursor(chatFieldText, cursor);

        System.out.println(currentExpression);

        float result = (float) MathImplementation.evaluateExpression(currentExpression);

        //System.out.println(result);
    }
}
