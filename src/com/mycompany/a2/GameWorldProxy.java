package com.mycompany.a2;

import java.util.Observable;

import com.mycompany.a2.Interfaces.IGameWorld;

public class GameWorldProxy extends Observable implements IGameWorld {
	private GameWorld world;
	public GameWorldProxy(GameWorld world) {
		this.world = world; 
	}
	@Override
	public int getlives() {
		// TODO Auto-generated method stub
		return world.getlives();
	}
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return world.getScore();
	}
	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return world.getTime();
	}
	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		world.setWidth(width);
	}
	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		world.setHeight(height);
		
	}
	@Override
	public void printMap() {
		// TODO Auto-generated method stub
		world.printMap();
	}
	@Override
	public boolean getSound() {
		// TODO Auto-generated method stub
		return world.getSound();
	}
	@Override
	public int getNumberOfMissiles() {
		// TODO Auto-generated method stub
		return world.getNumberOfMissiles();
	}
	
	
	
	
	
	
}
