package com.mycompany.a2;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.Border;
import com.mycompany.a2.Commands.*;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.*;


public class Game extends Form {

	private GameWorld world;
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
	private SaveC saveCommand; 
	private UndoC undoCommand;
	private aboutC  aboutCommand; 
	private newC newCommand; 
	private soundCheckBoxC soundCommand; 
	
	@SuppressWarnings("deprecation")
	public Game() {
	
		world = new GameWorld();
		setLayout(new BorderLayout());
		mapView = new MapView();
		pointsView = new PointsView(world);
		
		
		Toolbar toolbar = new Toolbar(); 
		this.setToolBar(toolbar);
		toolbar.setTitle("ROCKS IN SPACE");
		
		// north
		Container northContainer = new Container(); 
		
		northContainer.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
		
		
		// middle
		Container middleContainer = new Container(); 
		middleContainer.setLayout(new FlowLayout(Component.CENTER));
		
		Container southContainer = new Container(); 
		southContainer.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		southContainer.add(pointsView); 
		
		northContainer.add(middleContainer);
		northContainer.add(southContainer);
		
		
		Container buttonContainer = new Container(); 
		buttonContainer.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
		buttonContainer.add(new Label("Commands: "));
		buttonContainer.getAllStyles().setBgTransparency(1);
		buttonContainer.getAllStyles().setBgColor(ColorUtil.BLACK);
		buttonContainer.getAllStyles().setFgColor(ColorUtil.BLACK);
		buttonContainer.getAllStyles().setBorder(Border.createLineBorder(5, ColorUtil.CYAN ));
		buttonContainer.setScrollableY(true);
		
		// asteroid
		addAsteroidCommand = new AddAsteroidC(world); 
		Button addAsteroidButton = new Button("Add Asteroid");
		addAsteroidButton.getAllStyles().setBgTransparency(80);
		addAsteroidButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		addAsteroidButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		addAsteroidButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		addAsteroidButton.setCommand(addAsteroidCommand);
		buttonContainer.add(addAsteroidButton);
		// add NPS 
		
		addNPSCommand = new AddNonPlayerShipC(world); 
		Button addNPSButton = new Button("Add Non Player Ship");
		addNPSButton.getAllStyles().setBgTransparency(80);
		addNPSButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		addNPSButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		addNPSButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		addNPSButton.setCommand(addNPSCommand);
		buttonContainer.add(addNPSButton);
		
		// add player ship
		
		addPSCommand = new AddPlayerShipC(world); 
		Button addPSButton = new Button("Add Player Ship");
		addPSButton.getAllStyles().setBgTransparency(80);
		addPSButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		addPSButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		addPSButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		addPSButton.setCommand(addPSCommand);
		buttonContainer.add(addPSButton);
		
		// add space station SpaceStation
		
		addSpaceStationCommand = new AddSpaceStationC(world); 
		Button addSpaceStationButton = new Button("Add Space Station");
		addSpaceStationButton.getAllStyles().setBgTransparency(80);
		addSpaceStationButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		addSpaceStationButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		addSpaceStationButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		addSpaceStationButton.setCommand(addSpaceStationCommand);
		buttonContainer.add(addSpaceStationButton);
		
		
		// Decrease PS speed 
		decreasePSSpeedCommand = new DecreasePSSpeedC(world); 
		Button decreasePSSpeedButton = new Button("Decrease Player Ship Speed ");
		decreasePSSpeedButton.getAllStyles().setBgTransparency(80);
		decreasePSSpeedButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		decreasePSSpeedButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		decreasePSSpeedButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		decreasePSSpeedButton.setCommand(decreasePSSpeedCommand);
		buttonContainer.add(decreasePSSpeedButton);
		addKeyListener('D', decreasePSSpeedCommand);
		// Increase PS speed 
		increasePSSpeedCommand = new IncreasePSSpeedC(world); 
		Button increasePSSpeedButton = new Button("Increase Player Ship Speed ");
		increasePSSpeedButton.getAllStyles().setBgTransparency(80);
		increasePSSpeedButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		increasePSSpeedButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		increasePSSpeedButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		increasePSSpeedButton.setCommand(increasePSSpeedCommand);
		buttonContainer.add(increasePSSpeedButton);
		addKeyListener('I', increasePSSpeedCommand);
		
		// add up arrow addKeyListener(, increasePSSpeedCommand);
		
		// turn player ship left
		turnPSLeftCommand = new TurnPSLeftC(world); 
		Button turnPSLeftButton = new Button("Turn player ship left ");
		turnPSLeftButton.getAllStyles().setBgTransparency(80);
		turnPSLeftButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		turnPSLeftButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		turnPSLeftButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		turnPSLeftButton.setCommand(turnPSLeftCommand);
		buttonContainer.add(turnPSLeftButton);
		addKeyListener('L', turnPSLeftCommand);
		// turn player ship right. 
		
		turnPSRightCommand = new TurnPSRIghtC(world); 
		Button turnPSRightButton = new Button("Increase Player Ship Speed ");
		turnPSRightButton.getAllStyles().setBgTransparency(80);
		turnPSRightButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		turnPSRightButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		turnPSRightButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		turnPSRightButton.setCommand(turnPSRightCommand);
		buttonContainer.add(turnPSRightButton);
		addKeyListener('R', turnPSRightCommand);
		
		// turn missile launcher left. 
		
		turnLeftLauncherCommand = new TurnLeftLauncherC(world); 
		Button turnMLSLefttButton = new Button("Turn Left Missile Launcher ");
		turnMLSLefttButton.getAllStyles().setBgTransparency(80);
		turnMLSLefttButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		turnMLSLefttButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		turnMLSLefttButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		turnMLSLefttButton.setCommand(turnLeftLauncherCommand);
		buttonContainer.add(turnMLSLefttButton);
		addKeyListener('<', turnLeftLauncherCommand);
		// turn MLS right
		
		turnRightLauncherCommand = new TurnRightLauncherC(world); 
		Button turnMLSRightButton = new Button("Turn Right Missile Launcher ");
		turnMLSRightButton.getAllStyles().setBgTransparency(80);
		turnMLSRightButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		turnMLSRightButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		turnMLSRightButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		turnMLSRightButton.setCommand(turnRightLauncherCommand);
		buttonContainer.add(turnMLSRightButton);
		addKeyListener('>', turnRightLauncherCommand);
		// Player ship fire 
		
		PSFireMissileCommand = new PlayerShipFireC(world); 
		Button PlayerShipFireCommand = new Button("Player Ship firing ");
		PlayerShipFireCommand.getAllStyles().setBgTransparency(80);
		PlayerShipFireCommand.getAllStyles().setBgColor(ColorUtil.BLACK);
		PlayerShipFireCommand.getAllStyles().setFgColor(ColorUtil.WHITE);
		PlayerShipFireCommand.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		PlayerShipFireCommand.setCommand(PSFireMissileCommand);
		
		buttonContainer.add(PlayerShipFireCommand);
		addKeyListener(-90, PSFireMissileCommand);
		
		// NPS fire 
		npsFireMissileCommand = new NonPlayerShipFireC(world); 
		Button NonPlayerShipFireCommand = new Button("Non Player Ship firing ");
		NonPlayerShipFireCommand.getAllStyles().setBgTransparency(80);
		NonPlayerShipFireCommand.getAllStyles().setBgColor(ColorUtil.BLACK);
		NonPlayerShipFireCommand.getAllStyles().setFgColor(ColorUtil.WHITE);
		NonPlayerShipFireCommand.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		NonPlayerShipFireCommand.setCommand(npsFireMissileCommand);
		buttonContainer.add(NonPlayerShipFireCommand);
		
		// Jump
		jumpCommand = new JumpC(world); 
		Button jumpCommandButton = new Button("Jump ");
		jumpCommandButton.getAllStyles().setBgTransparency(80);
		jumpCommandButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		jumpCommandButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		jumpCommandButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		jumpCommandButton.setCommand(jumpCommand);
		
		buttonContainer.add(jumpCommandButton);
		addKeyListener(' ', jumpCommand);
		
		// Load missiles to Player ship
		loadMissileToPSCommand = new LoadMissilesToPSC(world); 
		Button loadMissilesPSButton = new Button("Load Missiles to Player Ship ");
		loadMissilesPSButton.getAllStyles().setBgTransparency(80);
		loadMissilesPSButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		loadMissilesPSButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		loadMissilesPSButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		loadMissilesPSButton.setCommand(loadMissileToPSCommand);
		buttonContainer.add(loadMissilesPSButton);
		//
		// ps missile hits  asteroid
		PSMissileAsteroidCommand = new PSMissileAsteroidC(world); 
		Button psMissileAsteroidButton = new Button("Player Ship missile hits Asteroid ");
		psMissileAsteroidButton.getAllStyles().setBgTransparency(80);
		psMissileAsteroidButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		psMissileAsteroidButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		psMissileAsteroidButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		psMissileAsteroidButton.setCommand(PSMissileAsteroidCommand);
		buttonContainer.add(psMissileAsteroidButton);
		
		// PS missile hits NPS
		PSMissileNPSCommand = new PSMissileNPSC(world); 
		Button psMissileNPSButton = new Button("Player Ship missile hits Non Player Ship ");
		psMissileNPSButton.getAllStyles().setBgTransparency(80);
		psMissileNPSButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		psMissileNPSButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		psMissileNPSButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		psMissileNPSButton.setCommand(PSMissileNPSCommand);
		buttonContainer.add(psMissileNPSButton);
		
		// NPS missile hits PS
		npsMissilePSCommand = new NPSMissilePS(world); 
		Button npsMissilePSButton = new Button("Player Ship missile hits Non Player Ship ");
		npsMissilePSButton.getAllStyles().setBgTransparency(80);
		npsMissilePSButton.getAllStyles().setBgColor(ColorUtil.BLACK);
		npsMissilePSButton.getAllStyles().setFgColor(ColorUtil.WHITE);
		npsMissilePSButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
		npsMissilePSButton.setCommand(npsMissilePSCommand);
		buttonContainer.add(npsMissilePSButton);
		
		// Asteroid crash Asteroid 
		
				asCrashasCommand = new AsteroidCrashAsteroid(world); 
				Button addAsCrashASButton = new Button("Asteroid hits another Asteroid ");
				addAsCrashASButton.getAllStyles().setBgTransparency(80);
				addAsCrashASButton.getAllStyles().setBgColor(ColorUtil.BLACK);
				addAsCrashASButton.getAllStyles().setFgColor(ColorUtil.WHITE);
				addAsCrashASButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
				addAsCrashASButton.setCommand(asCrashasCommand);
				buttonContainer.add(addAsCrashASButton);
				// Asteroid crashes NPS 
				
				asCrashNPSCommand = new AsteroidCrashNPS(world); 
				Button addAsCrashNPSButton = new Button("Asteroid hits NPS ");
				addAsCrashNPSButton.getAllStyles().setBgTransparency(80);
				addAsCrashNPSButton.getAllStyles().setBgColor(ColorUtil.BLACK);
				addAsCrashNPSButton.getAllStyles().setFgColor(ColorUtil.WHITE);
				addAsCrashNPSButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
				addAsCrashNPSButton.setCommand(asCrashNPSCommand);
				buttonContainer.add(addAsCrashNPSButton);
		// Asteroid crashes PS 
				PSCrashAsteroidCommand = new PSCrashAsteroid(world); 
				Button PSCrashAsteroidButton = new Button("Player ship hits Asteroid ");
				PSCrashAsteroidButton.getAllStyles().setBgTransparency(80);
				PSCrashAsteroidButton.getAllStyles().setBgColor(ColorUtil.BLACK);
				PSCrashAsteroidButton.getAllStyles().setFgColor(ColorUtil.WHITE);
				PSCrashAsteroidButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
				PSCrashAsteroidButton.setCommand(PSCrashAsteroidCommand);
				buttonContainer.add(PSCrashAsteroidButton);	
				
				
				// tick command
				tickCommand = new tickC(world); 
				Button tickCommandButton = new Button("Player Ship missile hits Non Player Ship ");
				tickCommandButton.getAllStyles().setBgTransparency(80);
				tickCommandButton.getAllStyles().setBgColor(ColorUtil.BLACK);
				tickCommandButton.getAllStyles().setFgColor(ColorUtil.WHITE);
				tickCommandButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
				tickCommandButton.setCommand(tickCommand);
				buttonContainer.add(tickCommandButton);
				// quit command 
				
				
				quitGameCommand = new quitGameC(world); 
				Button quitGameButton = new Button("Player Ship missile hits Non Player Ship ");
				quitGameButton.getAllStyles().setBgTransparency(80);
				quitGameButton.getAllStyles().setBgColor(ColorUtil.BLACK);
				quitGameButton.getAllStyles().setFgColor(ColorUtil.WHITE);
				quitGameButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
				quitGameButton.setCommand(quitGameCommand);
				buttonContainer.add(quitGameButton);
				
				
				printMapCommand = new PrintMapC(world); 
				
				Button printMapButton = new Button("Print Map command ");
				printMapButton.getAllStyles().setBgTransparency(80);
				printMapButton.getAllStyles().setBgColor(ColorUtil.BLACK);
				printMapButton.getAllStyles().setFgColor(ColorUtil.WHITE);
				printMapButton.getAllStyles().setBorder(Border.createLineBorder(2,ColorUtil.CYAN));
				printMapButton.setCommand(printMapCommand);
				buttonContainer.add(printMapButton);
				addKeyListener('p', printMapCommand);
		// -------------------
		// hamberger menu
		CheckBox soundCheckBOx = new CheckBox("Sound");
		aboutCommand = new aboutC(); 
		toolbar.addCommandToSideMenu(aboutCommand);
		newCommand = new newC(); 
		toolbar.addCommandToSideMenu(newCommand);
		
		soundCommand = new soundCheckBoxC(world); 
		soundCheckBOx.setCommand(soundCommand);
		toolbar.addComponentToSideMenu(soundCheckBOx);
		saveCommand = new SaveC(); 
		toolbar.addCommandToSideMenu(saveCommand);
		undoCommand = new UndoC(); 
		toolbar.addCommandToSideMenu(undoCommand);
		
		world.addObserver(mapView);
		world.addObserver(pointsView);
		
		add(BorderLayout.NORTH,northContainer);
		add(BorderLayout.CENTER, mapView);
		add(BorderLayout.WEST, buttonContainer);
		this.show();
		world.init(mapView.getWidth(), mapView.getHeight());
		
		
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
