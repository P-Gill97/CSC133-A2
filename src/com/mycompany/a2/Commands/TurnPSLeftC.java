package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class TurnPSLeftC extends Command {
	private GameWorld world; 
	public TurnPSLeftC(GameWorld w) {
		super("Turn PS left");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.turnPSLeft();
			System.out.println("Command executed: Turn PS left"); 
		}
	}
}
