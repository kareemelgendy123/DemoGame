package com.kareem.demogame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DemoGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
        private float x;
        private float y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
                x = 0;
                y = 0;
	}

	@Override
	public void render () {
            
                // If statements for keys pressed
                // Right key pressed
                if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
                    x ++;   
                //Left key pressed
                }else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
                    x --;        
                // Up key pressed
                }else if (Gdx.input.isKeyPressed(Input.Keys.UP)){
                    y ++; 
                // Down key pressed
                }else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)){
                    y --;
                }
                
                // Mouse/Touch stuff
                if (Gdx.input.isTouched()){
                    // Getting X and Y coordinates of the mouse
                    int mouseX = Gdx.input.getX();
                    int mouseY = Gdx.input.getY();
                    
                    // If statements for if the left or right side of the screen is pressed
                    // Left and Right
                    if (mouseX > Gdx.app.getGraphics().getWidth()/2){
                        x ++;
                    }else if (mouseX < Gdx.app.getGraphics().getWidth()/2){
                        x --;
                    }
                }
                
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
