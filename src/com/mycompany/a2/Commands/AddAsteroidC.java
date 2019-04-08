package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class AddAsteroidC extends Command{
	private GameWorld world; 
	public AddAsteroidC(GameWorld w) {
		super("Add asteroid");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.addNewAsteroid();
			System.out.println("Command executed: Add Asteroid"); 
		}
	}
}
