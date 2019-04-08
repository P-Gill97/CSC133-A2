package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class DecreasePSSpeedC extends Command {
	private GameWorld world; 
	public DecreasePSSpeedC(GameWorld w) {
		super("decrease Player Ship Speed");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.decreaseSpeedPS();
			System.out.println("Command executed: decrease Player Ship Speed"); 
		}
	}
}
