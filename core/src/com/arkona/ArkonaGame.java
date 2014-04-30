package com.arkona;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class ArkonaGame extends Game {

	public static AssetManager assets;

	public static final String GAME_VERSION = "prototype";

	@Override
	public void create () {

		assets = new AssetManager();

		assets.load("arkona_logo.png", Texture.class);

		while (!assets.update()) {
			Gdx.app.log("Assets", assets.getProgress() * 100 + "%");
		}
		Gdx.app.log("Assets", "100.0%");

		setScreen(new GameScreen());
	}
}
