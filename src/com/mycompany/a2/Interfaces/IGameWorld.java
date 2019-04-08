package com.mycompany.a2.Interfaces;

public interface IGameWorld {
	
	public int getlives(); 
	public int getScore(); 
	public int getTime(); 
	public void setWidth(int width); 
	public void setHeight(int height); 
	public void printMap(); 
	public boolean getSound(); 
	public int getNumberOfMissiles(); 
}
