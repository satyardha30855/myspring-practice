package com.inlearn.learnspring.game;

public class GameRunner {
	//MarioGame game;
	//SuperCortana game;
	GamingConsole game;
	public GameRunner(GamingConsole game)
	{
		this.game = game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running game"+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	
}
