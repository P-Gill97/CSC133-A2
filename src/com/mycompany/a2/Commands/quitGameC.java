package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class quitGameC extends Command {
	private GameWorld world; 
	public quitGameC(GameWorld w) {
		super("Quit game:  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.quitGame();
			System.out.println("Command executed: Quit game : "); 
		}
	}
}
