package com.arkona.core;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Custom screen class. Override methods when necessary.
 * @author Deseteral
 */
public abstract class Stage implements Screen {

	protected SpriteBatch gl;
	protected OrthographicCamera camera;

	@Override
	public void hide() { }

	@Override
	public void resize(int width, int height) {	}

	@Override
	public void show() { }

	@Override
	public void pause() { }

	@Override
	public void resume() { }

	@Override
	public void dispose() { }
}
