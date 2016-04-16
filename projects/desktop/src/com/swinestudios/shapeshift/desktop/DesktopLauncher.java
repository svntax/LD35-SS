package com.swinestudios.shapeshift.desktop;

import org.mini2Dx.desktop.DesktopMini2DxConfig;

import com.badlogic.gdx.backends.lwjgl.DesktopMini2DxGame;

import com.swinestudios.shapeshift.ShapeShift;

public class DesktopLauncher {
	public static void main (String[] arg) {
		DesktopMini2DxConfig config = new DesktopMini2DxConfig(ShapeShift.GAME_IDENTIFIER);
		config.vSyncEnabled = true;
		config.width = 640;
		config.height = 480;
		config.resizable = true; 
		config.foregroundFPS = 30;
		config.backgroundFPS = 30;
		config.title = "TO BE NAMED LATER";
		new DesktopMini2DxGame(new ShapeShift(), config);
	}
}
