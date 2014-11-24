package com.spaceavenger.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.spaceavenger.SpaceAvenger;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Space Avenger";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new SpaceAvenger(), config);
	}
}
