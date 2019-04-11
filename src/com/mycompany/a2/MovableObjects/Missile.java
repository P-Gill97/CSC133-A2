package com.mycompany.a2.MovableObjects;

import com.codename1.charts.util.ColorUtil;
import com.mycompany.a2.GameWorldObjects.MovableObject;

public class Missile extends MovableObject{
	private int fuel; 
	
	public Missile(float x, float y, int heading, int speed) {
		super.setColor(ColorUtil.LTGRAY );
		super.setX(x);
		super.setY(y);
		super.setHeading(heading);
		super.setspeed(speed+5);
		this.setFuel(10); 

	}
	
	public int getFuel() {
		return fuel;
	}
	
	public void setFuel(int fuel ) {
		this.fuel = fuel;
	}
	public String toString() {
		String s =""; 
		s+= " Missle : ";
		s+= "Fuel=" + this.fuel;
		s+= super.toString();
		
		return s; 
	}
}
