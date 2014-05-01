package com.arkona;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

public class ArkonaGame extends Game {

	public static AssetManager assets;

	public static final String GAME_VERSION = "prototype";

	@Override
	public void create () {

		assets = new AssetManager();
		assets.setLoader(TiledMap.class, new TmxMapLoader(new InternalFileHandleResolver()));

		assets.load("arkona_logo.png", Texture.class);
		assets.load("testmap1.tmx", TiledMap.class);

		while (!assets.update()) {
			Gdx.app.log("Assets", assets.getProgress() * 100 + "%");
		}
		Gdx.app.log("Assets", "100.0%");

		setScreen(new GameScreen());
	}
}
