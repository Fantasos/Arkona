package com.arkona.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.arkona.ArkonaGame;

public class DesktopLauncher {

	public static void main (String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = 1280;
		config.height = 720;

		config.resizable = false;
		config.samples = 4;

		config.title = String.format("Arkona %s", ArkonaGame.GAME_VERSION);

		new LwjglApplication(new ArkonaGame(), config);
	}
}
