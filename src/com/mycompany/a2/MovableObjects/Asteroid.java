package com.mycompany.a2.MovableObjects;
import com.mycompany.a2.GameWorldObjects.GameObject;
import com.codename1.charts.util.ColorUtil;
import com.mycompany.a2.GameWorldObjects.MovableObject;

public class Asteroid extends MovableObject{
	private int size; 
	
	public Asteroid() {
		super.setColor(ColorUtil.CYAN); 
		super.setRandomHeading();
		super.setRandomSpeed();
		super.setRandomXY();
		this.size = randomSize();
		
	}
	public Asteroid(int x, int y) {
		super.setColor(ColorUtil.CYAN); 
		super.setRandomHeading();
		super.setRandomSpeed();
		super.setX(x);
		super.setY(y);
		this.size = randomSize();
		
	}
	public int randomSize() {
		return rand.nextInt(24+1)+6;
	}
	public String toString() {
		String s = "";
		s += "Asteroid: ";
		s += super.toString();
		s += "Size: " + this.size;
		
		return s;
	}
}
