package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class TurnPSRIghtC extends Command {
	private GameWorld world; 
	public TurnPSRIghtC(GameWorld w) {
		super("Turn PS Right");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.turnPSRight();
			System.out.println("Command executed: Turn PS Right"); 
		}
	}
}
