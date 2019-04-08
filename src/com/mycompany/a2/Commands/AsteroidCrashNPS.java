package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class AsteroidCrashNPS extends Command {
	private GameWorld world; 
	public AsteroidCrashNPS(GameWorld w) {
		super("Asteroid hits NPS  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.crashAstoNPS();
			System.out.println("Command executed: Asteroid hits NPS : "); 
		}
	}
}
