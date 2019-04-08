package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class TurnRightLauncherC extends Command {
	private GameWorld world; 
	public TurnRightLauncherC(GameWorld w) {
		super("Turn right Missile Launcher ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.turnMissleLauncherRight();
			System.out.println("Command executed: Turn right Missile Launcher: "); 
		}
	}
}
