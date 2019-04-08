package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class AddSpaceStationC extends Command {
	private GameWorld world; 
	public AddSpaceStationC(GameWorld w) {
		super("Add Space Station");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.addNewBlinkingStation();
			System.out.println("Command executed: Add Space Station"); 
		}
	}
}
