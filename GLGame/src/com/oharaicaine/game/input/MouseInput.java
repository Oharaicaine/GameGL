package com.oharaicaine.game.input;

import org.lwjgl.glfw.GLFWCursorPosCallback;

import com.oharaicaine.game.Main;

public class MouseInput extends GLFWCursorPosCallback {

	public static double mouseX = 0;
	public static double mouseY = 0;

	public MouseInput() {
	}

	@Override
	public void invoke(long window, double xpos, double ypos) {
		this.mouseX = xpos;
		this.mouseY = Main.height -ypos;

	}

}
