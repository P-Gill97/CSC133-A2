package com.mycompany.a2.Commands;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.*;
public class JumpC extends Command {
	private GameWorld world; 
	public JumpC(GameWorld w) {
		super("Jump ");
		this.world = w; 
	}
	
	@Override 
	public void actionPerformed(ActionEvent evt) {
		if(evt.getKeyEvent()!= -1) {
			world.jumpHyperspace();
			System.out.println("Command executed: Jump: "); 
		}
	}
}
