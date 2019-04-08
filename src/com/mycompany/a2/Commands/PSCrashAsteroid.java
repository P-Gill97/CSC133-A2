package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class PSCrashAsteroid extends Command {
	private GameWorld world; 
	public PSCrashAsteroid(GameWorld w) {
		super("Player Ship hits Asteroid  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.crashPStoAs();
			System.out.println("Command executed: Player Ship hits Asteroid : "); 
		}
	}
}
