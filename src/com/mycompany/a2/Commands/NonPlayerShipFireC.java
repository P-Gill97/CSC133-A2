package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class NonPlayerShipFireC extends Command {
	private GameWorld world; 
	public NonPlayerShipFireC(GameWorld w) {
		super("Non Player Ship Firing: ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.fireMissleNPS();
			System.out.println("Command executed: Non Player Ship Firing: "); 
		}
	}
}
