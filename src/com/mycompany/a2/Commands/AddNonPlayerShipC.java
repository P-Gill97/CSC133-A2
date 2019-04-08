package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class AddNonPlayerShipC extends Command {
	private GameWorld world; 
	public AddNonPlayerShipC(GameWorld w) {
		super("Add Non Player Ship");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.addNewNps();
			System.out.println("Command executed: Add Non Player Ship"); 
		}
	}
}
