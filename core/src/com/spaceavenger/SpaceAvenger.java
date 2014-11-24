package com.spaceavenger;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

class MyInputAdapter extends InputAdapter {
	@Override
	public boolean keyUp(int keyCode) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		if (button == Buttons.LEFT) {
		}

		return false;
	}
}

public class SpaceAvenger extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture avengerImage;
	private OrthographicCamera camera;
	private Rectangle avenger;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		avengerImage = new Texture("badlogic.jpg");
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);

		avenger = new Rectangle(800 / 2 - 64 / 2, 20, 64, 64);

		Gdx.input.setInputProcessor(new MyInputAdapter());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();

		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(avengerImage, avenger.x, avenger.y);
		batch.end();
	}

	@Override
	public void dispose() {
		avengerImage.dispose();
		batch.dispose();
	}
}
