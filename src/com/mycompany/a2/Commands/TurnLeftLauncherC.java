package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class TurnLeftLauncherC extends Command {
	private GameWorld world; 
	public TurnLeftLauncherC(GameWorld w) {
		super("Turn Left Missile Launcher ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.turnMissleLauncherLeft();
			System.out.println("Command executed: Turn Left Missile Launcher: "); 
		}
	}
}
