package com.goby56.chatmath.mixin;

import com.goby56.chatmath.ExpressionHandler;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatScreen.class)
public class ChatFieldListener {
	@Shadow
	protected TextFieldWidget chatField;

	@Inject(at = @At("HEAD"), method = "Lnet/minecraft/client/gui/screen/ChatScreen;keyPressed" + "(III)Z")
	private void init(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable callbackInfo) {

		if (keyCode == 258) {
			// The player pressed tab and wants to calculate the expression
			System.out.println(ExpressionHandler.isValidExpression(this.chatField.getText()));
			//ExpressionHandler.replaceExpression(this.chatField);
		} else if (keyCode == 257) {
			// The player pressed enter and any present expression should be evaluated
			//ExpressionHandler.evaluateAllExpressions(this.chatField);
		}
	};
};