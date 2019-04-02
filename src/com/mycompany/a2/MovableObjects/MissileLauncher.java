package com.mycompany.a2.MovableObjects;

import com.codename1.charts.util.ColorUtil;
import com.mycompany.a2.GameWorldObjects.MovableObject;

public class MissileLauncher extends MovableObject{
	
	public MissileLauncher(float x, float y, int heading, int speed) {
		super.setColor(ColorUtil.YELLOW);
		super.setX(x);
		super.setY(y);
		this.setHeading(heading);
		this.setspeed(speed);
		
	}
	
	public String toString() {
		String s = "";
		s += super.toString();
		s += "Launcher: ";
		return s;
	}
}
