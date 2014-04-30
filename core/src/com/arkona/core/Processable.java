package com.arkona.core;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Deseteral
 */
public interface Processable {

	/**
	 * Use for logic calculation
	 * @param delta Delta time
	 */
	public abstract void update(float delta);

	/**
	 * Use for rendering
	 * @param gl SpriteBatch used for rendering
	 * @see SpriteBatch
	 */
	public abstract void render(SpriteBatch gl);
}
