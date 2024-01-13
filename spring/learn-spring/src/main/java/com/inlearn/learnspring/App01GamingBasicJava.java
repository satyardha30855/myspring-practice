package com.inlearn.learnspring;

import com.inlearn.learnspring.game.GameRunner;
import com.inlearn.learnspring.game.MarioGame;
import com.inlearn.learnspring.game.Pakman;
import com.inlearn.learnspring.game.SuperCortana;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var superCortna = new SuperCortana();
		var packman = new Pakman();
		//var gameRunner = new GameRunner(marioGame);
		var gameRunner = new GameRunner(superCortna);
		//var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		
	}

}
