package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class PSMissileAsteroidC extends Command {
	private GameWorld world; 
	public PSMissileAsteroidC(GameWorld w) {
		super("Player ship missile hits Asteroid  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.missleStrikePStoAs();
			System.out.println("Command executed: Player ship missile hits Asteroid: "); 
		}
	}
}
