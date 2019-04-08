package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class tickC extends Command {
	private GameWorld world; 
	public tickC(GameWorld w) {
		super("Tick command  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.clockTicked();
			System.out.println("Command executed: Tick command : "); 
		}
	}
}
