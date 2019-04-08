package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class UndoC extends Command {
	private GameWorld world; 
	public UndoC(GameWorld w) {
		super("Undo:  ");
		System.out.println("Undo command executed: ");
		this.world = w; 
	}
	
}
