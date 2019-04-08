package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class PScrashNPS extends Command {
	private GameWorld world; 
	public PScrashNPS(GameWorld w) {
		super("Player Ship hits Non Player Ship  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.crashPStoNPS();
			System.out.println("Command executed: Player Ship hits Non Player Ship : "); 
		}
	}
}
