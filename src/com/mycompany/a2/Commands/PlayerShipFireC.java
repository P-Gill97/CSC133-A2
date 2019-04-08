package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class PlayerShipFireC extends Command {
	private GameWorld world; 
	public PlayerShipFireC(GameWorld w) {
		super("Player Ship Firing: ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.fireMisslePS();
			System.out.println("Command executed: Player Ship Firing: "); 
		}
	}
}
