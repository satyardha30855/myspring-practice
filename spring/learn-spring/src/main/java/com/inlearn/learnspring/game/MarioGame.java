package com.inlearn.learnspring.game;

public class MarioGame implements GamingConsole {
	
	public void up()
	{
		System.out.println("MarioGame jump up");
	}
	public void down()
	{
		System.out.println("MarioGame jump down");
	}
	public void left()
	{
		System.out.println("MarioGame move back");
	}
	public void right()
	{
		System.out.println("MarioGame Accelerate");
	}
}
