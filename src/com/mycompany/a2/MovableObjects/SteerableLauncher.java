package com.mycompany.a2.MovableObjects;
import com.codename1.charts.util.ColorUtil;
import com.mycompany.a2.Interfaces.ISteerable;;
public class SteerableLauncher  extends MissileLauncher implements ISteerable{

	public SteerableLauncher(float x, float y, int heading, int speed) {
		super(x, y, heading, speed);
		// TODO Auto-generated constructor stub
		super.setColor(ColorUtil.BLUE);
	}
	public void changeHeading(int heading) {
		 
		this.setHeading(this.getHeading()+ heading);
		
	}
	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		int heading = super.getHeading();
		if (heading-10<=0) {
			super.setHeading(heading-10+360);
		}else {
			super.setHeading(heading-10);
		}
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		int heading = super.getHeading();
		if (heading+10<=0) {
			super.setHeading(heading+10);
		}else {
			super.setHeading(heading+10-360);
		}// test to see if it works correctly. 
	}
	public String toString() {
		String s = "";
		s += " Steerable Launcher"; 
		s += super.toString();
		return s;
	}

}
