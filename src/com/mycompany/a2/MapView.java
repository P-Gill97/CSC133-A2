package com.mycompany.a2;

import java.util.Observable;
import java.util.Observer;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.Border;
import com.mycompany.a2.Interfaces.IGameWorld;

public class MapView extends Container implements Observer {
	
	public MapView() {
		Container mc = new Container();
		
		mc.setLayout(new FlowLayout());
		mc.getAllStyles().setBgColor(ColorUtil.WHITE);
		mc.getAllStyles().setBgTransparency(0);
		Label text = new Label("Map View");
		mc.add(text); 
		this.add(mc);
	
	
	
	
	}
	
	
	
	
	
	
	
	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		IGameWorld world = (IGameWorld) data; 
		world.setHeight(this.getHeight());
		world.setWidth(this.getWidth());
		world.printMap();
		this.repaint();
		
	}

}
