package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class aboutC extends Command {
	
	private String aboutStr =""; 
	public aboutC() {
		super("About: ");
		
		aboutStr = "Perry Gill CSC133. Project 3 Asteroid Game.  ";
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			Dialog.show("About ", aboutStr, "", "Close"); 
			
			
		}
	}
}
