package com.mycompany.a2.FixedObjects;

import com.codename1.charts.util.ColorUtil;
import com.mycompany.a2.GameWorldObjects.fixedGameObject;

public class SpaceStation extends fixedGameObject {
	private int blinkRate; 
	private int blinker ; 
	
	public SpaceStation() {
		super.setId();
		setRate(); 

		super.setColor(ColorUtil.YELLOW);
		super.setRandomXY();
	}
	public SpaceStation(int x, int y) {
		super.setId();
		setRate(); 

		super.setColor(ColorUtil.YELLOW);
		super.setX(x);
		super.setY(y);
	}
	public void blinkLight() {
		blinker++;
		if((blinker % this.getrate())==0) {
			super.setColor(ColorUtil.WHITE);
		}
	}
	
	private void setRate () {
		this.blinkRate = rand.nextInt(3)+1; 
		
	}
	private int getrate() {
		return this.blinkRate; 
	}
	public String toString() {
		String s = "";
		s+= "Space Station: ";
		s+= super.toString();
		s+= "Blink rate: "+ this.blinkRate; 
		return s; 
	}
}
