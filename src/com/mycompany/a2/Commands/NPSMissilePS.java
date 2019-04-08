package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class NPSMissilePS extends Command {
	private GameWorld world; 
	public NPSMissilePS(GameWorld w) {
		super("NPS  missile hits PS  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.missleStrikeNPStoPS();
			System.out.println("Command executed: NPS  missile hits PS  : "); 
		}
	}
}
