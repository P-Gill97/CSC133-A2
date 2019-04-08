package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class soundCheckBoxC extends Command {
	private GameWorld world; 
	public soundCheckBoxC(GameWorld w) {
		super("Sound Check box:  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.sound();
			System.out.println("Command executed: Sound Check box: "); 
		}
	}
}
