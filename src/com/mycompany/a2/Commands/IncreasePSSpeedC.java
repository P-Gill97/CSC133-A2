package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class IncreasePSSpeedC extends Command {
	private GameWorld world; 
	public IncreasePSSpeedC(GameWorld w) {
		super("Increase Player Ship Speed");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.increaseSpeedPS();
			System.out.println("Command executed: Increase Player Ship Speed"); 
		}
	}
}
