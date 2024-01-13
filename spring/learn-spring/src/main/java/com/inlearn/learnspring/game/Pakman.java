package com.inlearn.learnspring.game;

public class Pakman implements GamingConsole {
	public void up()
	{
		System.out.println("Pakman jump up");
	}
	public void down()
	{
		System.out.println("Pakman jump down");
	}
	public void left()
	{
		System.out.println("Pakman move back");
	}
	public void right()
	{
		System.out.println("Pakman Accelerate");
	}
}
