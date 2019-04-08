package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class AddPlayerShipC extends Command {
	private GameWorld world; 
	public AddPlayerShipC(GameWorld w) {
		super("Add Player Ship");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.addPlayerShip();
			System.out.println("Command executed: Add player ship"); 
		}
	}
}
