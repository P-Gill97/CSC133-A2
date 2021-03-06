package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class PrintMapC extends Command {
	private GameWorld world; 
	public PrintMapC(GameWorld w) {
		super("Print map:  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.printMap();
			System.out.println("Command executed: Print map: "); 
		}
	}
}
