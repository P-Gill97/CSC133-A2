package com.mycompany.a2;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.mycompany.a2.Commands.*;
import com.codename1.ui.*;


public class Game extends Form {

	private GameWorld gameworld;
	private MapView mapView;
	private PointsView pointsView; 
	
	private AddAsteroidC addAsteroidCommand;
	private AddNonPlayerShipC addNPSCommand;
	private AddPlayerShipC addPSCommand; 
	private AddSpaceStationC addSpaceStationCommand; 
	private AsteroidCrashAsteroid asCrashasCommand;
	private AsteroidCrashNPS asCrashNPSCommand;
	private DecreasePSSpeedC decreasePSSpeedCommand; 
	private IncreasePSSpeedC increasePSSpeedCommand;
	private JumpC jumpCommand;
	private LoadMissilesToPSC loadMissileToPSCommand; 
	private NonPlayerShipFireC npsFireMissileCommand; 
	private NPSMissilePS npsMissilePSCommand; 
	private PlayerShipFireC PSFireMissileCommand ; 
	private PrintMapC printMapCommand; 
	private PSCrashAsteroid PSCrashAsteroidCommand; 
	private PScrashNPS PSCrashNPSCommand; 
	private PSMissileAsteroidC PSMissileAsteroidCommand; 
	private PSMissileNPSC PSMissileNPSCommand; 
	private quitGameC quitGameCommand; 
	private tickC tickCommand; 
	private TurnLeftLauncherC turnLeftLauncherCommand; 
	private TurnRightLauncherC turnRightLauncherCommand; 
	private TurnPSLeftC turnPSLeftCommand; 
	private TurnPSRIghtC turnPSRightCommand;
	
	public Game() {
	
		gameworld = new GameWorld();
		gameworld.init(4,4);
		
		
	}
	
	
	/*
	public void play() { 
	// code to accept commands and execute
	Label myLabel = new Label("Enter a Command: ");
	this.addComponent(myLabel);
	final TextField myTextField= new TextField(); 
	this.addComponent(myTextField);
	this.show();
	// added UI components now add a listener
	myTextField.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			String sCommand = myTextField.getText().toString();
			myTextField.clear();
			switch(sCommand.charAt(0)) {
			
			case 'a':
				gameworld.addNewAsteroid();
				break;
			case 'y':
				gameworld.addNewNps();
				break;
			case 'b':
				gameworld.addNewBlinkingStation();
			case 's':
				gameworld.addPlayerShip();
				break;
			case 'i':
				gameworld.increaseSpeedPS();
				break;
			case 'd':
				gameworld.decreaseSpeedPS();
				break;
			case 'l':
				gameworld.turnPSLeft();
				break;
			case 'r':
				gameworld.turnPSRight();
				break;
			case '>':
				gameworld.turnMissleLauncher();
				break;
			case 'f':
				gameworld.fireMisslePS();
				break;
			case 'L':
				gameworld.fireMissleNPS();
				break;
			case 'j':
				gameworld.jumpHyperspace();
				break;
			case 'n':
				gameworld.loadNewMisslesPS();
				break;
			case 'k':
				gameworld.missleStrikePStoAs();
				break;
			case 'e':
				gameworld.missleStrikePStoNPS();
				break;
			case 'E':
				gameworld.missleStrikeNPStoPS();
				break;
			case 'c':
				gameworld.crashPStoAs();
				break;
			case 'h':
				gameworld.crashPStoNPS();
				break;
			case 'x':
				gameworld.crashAstoAs();
				break;
			case 'I':
				gameworld.crashAstoNPS();
				break;
			case 't':
				gameworld.clockTicked();
				break;
			case 'p':
				gameworld.printState();
				break;
			case 'm':
				gameworld.printMap();
				break;
			case 'q':
				gameworld.quitGame();
				break;
			case ' ':
				System.out.println("No valid input ");
				break;
			default: 
				System.out.println("No valid input "); 
			}// switch
		}// end action performed 
		
	}//new action listener
	);// add action listener
		
	}// end of play 
	*/
}
