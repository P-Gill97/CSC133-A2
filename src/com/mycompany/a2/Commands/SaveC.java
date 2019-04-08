package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class SaveC extends Command {
	private GameWorld world; 
	public SaveC(GameWorld w) {
		super("Save:  ");
		System.out.println("Save command executed: ");
		this.world = w; 
	}
	
}
