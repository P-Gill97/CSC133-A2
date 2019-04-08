package com.mycompany.a2.MovableObjects;

import java.util.*;

import com.codename1.charts.util.ColorUtil;

public class NPShip extends Ship{
	private int size; 
	private MissileLauncher NPML;
	
	public NPShip() {
		
		NPML = new MissileLauncher(super.getX(), super.getY(), super.getHeading(),super.getspeed());
		super.setRandomXY();
		super.setRandomSpeed();
		super.setColor(ColorUtil.MAGENTA);
		super.setRandomHeading();
		super.setMissleCount(2);
		this.NPrandomSize();
		
		
	}
public NPShip(int x, int y) {
		
		NPML = new MissileLauncher(super.getX(), super.getY(), super.getHeading(),super.getspeed());
		super.setX(x);
		super.setY(y);
		super.setRandomSpeed();
		super.setColor(ColorUtil.MAGENTA);
		super.setRandomHeading();
		super.setMissleCount(2);
		this.NPrandomSize();
		
		
	}
	public MissileLauncher getNPML() {
		return NPML; 
	}
	public void NPrandomSize() {
		if(rand.nextInt(10)<= 5) {
			size = 10;
		}else {
			size = 20;
		}
		
	}
	
	public String toString() {
		String s = "";
		s+= "NonPlayerShip: ";
		s+= super.toString();
		s+= "Size="+this.size;
		return s; 
		
	}
	
	
}
