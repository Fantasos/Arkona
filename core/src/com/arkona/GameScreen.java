package com.arkona;

import com.arkona.core.Stage;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Deseteral
 */
public class GameScreen extends Stage {

	public GameScreen() {

		int w = Gdx.graphics.getWidth();
		int h = Gdx.graphics.getHeight();

		gl = new SpriteBatch();
		camera = new OrthographicCamera(w, h);

		InputMultiplexer input = new InputMultiplexer();
		{
			// add input processors here
		}
		Gdx.input.setInputProcessor(input);
	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		gl.setProjectionMatrix(camera.combined);

		gl.begin();
		{
			
		}
		gl.end();
	}
}
