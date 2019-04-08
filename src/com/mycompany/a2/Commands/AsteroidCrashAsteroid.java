package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class AsteroidCrashAsteroid extends Command {
	private GameWorld world; 
	public AsteroidCrashAsteroid(GameWorld w) {
		super("Asteroid hits Asteroid  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.crashAstoAs();
			System.out.println("Command executed: Asteroid hits Asteroid : "); 
		}
	}
}
