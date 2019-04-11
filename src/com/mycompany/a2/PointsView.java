package com.mycompany.a2;

import java.util.Observable;
import java.util.Observer;

import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.mycompany.a2.Interfaces.IGameWorld;

public class PointsView extends Container implements Observer{
	private GameWorld world; 
	private Label numberOfMissileL;
	private Label pointsL;
	private Label soundL;
	private Label timeL;
	private Label numOfLivesL;
	
	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		IGameWorld world = (IGameWorld) observable;
		int points = world.getScore();
		pointsL.setText(""+points+"");
		int missileCount = world.getNumberOfMissiles();
		numberOfMissileL.setText(""+missileCount+"");
		int time = world.getTime();
		timeL.setText(String.valueOf(time));
		boolean soundU = world.getSound();
		if(soundU==true) {
			soundL.setText(String.valueOf("ON"));
		}else {
			soundL.setText(String.valueOf("OFF"));
		}
		int lifes = world.getlives();
		numOfLivesL.setText(String.valueOf(lifes));
		
		this.repaint();
	}
	public PointsView(GameWorld world) {
		this.world= world;
		Container c = new Container();
		c.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		c.getAllStyles().setBgTransparency(0);
		
		Label pointText = new Label(" Points: ");
		Label numberOfMissileText = new Label(" Number of Missiles: ");
		Label soundText = new Label("Sound:");
		Label  timeText= new Label(" time: ");
		Label  numOfLivesText= new Label(" Number of lives: ");
		
		 numberOfMissileL =new Label("-");
		 pointsL = new Label("-");
		 soundL = new Label("-");
		 timeL = new Label("-");
		 numOfLivesL = new Label("-");
		 
		 
		pointText.getAllStyles().setBgTransparency(50);
		numberOfMissileText.getAllStyles().setBgTransparency(50);
		soundText.getAllStyles().setBgTransparency(50);
		timeText.getAllStyles().setBgTransparency(50);
		numOfLivesText.getAllStyles().setBgTransparency(50);
		
		pointText.getAllStyles().setPadding(LEFT,1);
		numberOfMissileText.getAllStyles().setPadding(LEFT,1);
		soundText.getAllStyles().setPadding(LEFT,1);
		timeText.getAllStyles().setPadding(LEFT,1);
		numOfLivesText.getAllStyles().setPadding(LEFT,1);
		
		
		
		pointText.getAllStyles().setPadding(RIGHT,1);
		numberOfMissileText.getAllStyles().setPadding(RIGHT,1);
		soundText.getAllStyles().setPadding(RIGHT,1);
		timeText.getAllStyles().setPadding(RIGHT,1);
		numOfLivesText.getAllStyles().setPadding(RIGHT,1);
		/*
		numberOfMissileL
		pointsL
		soundL
		numOfLivesL
		timeL
		*/
		c.add(pointText);
		c.add(pointsL);
		c.add(timeText);
		c.add(timeL);
		c.add(numOfLivesText);
		c.add(numOfLivesL);
		c.add(numberOfMissileText);
		c.add(numberOfMissileL);
		c.add(soundText);
		c.add(soundL);
		
		this.add(c);
	}// end constrctor

	
}
