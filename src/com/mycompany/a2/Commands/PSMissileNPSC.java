package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class PSMissileNPSC extends Command {
	private GameWorld world; 
	public PSMissileNPSC(GameWorld w) {
		super("Player ship missile hits NPS  ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.missleStrikePStoNPS();
			System.out.println("Command executed: Player ship missile hits NPS: "); 
		}
	}
}
