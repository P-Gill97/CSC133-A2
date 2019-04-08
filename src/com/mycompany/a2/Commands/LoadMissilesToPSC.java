package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class LoadMissilesToPSC extends Command {
	private GameWorld world; 
	public LoadMissilesToPSC(GameWorld w) {
		super("Load Missiles to PS: ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.loadNewMisslesPS();
			System.out.println("Command executed: Load Missiles to PS "); 
		}
	}
}
