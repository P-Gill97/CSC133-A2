package com.mycompany.a2;

import java.util.Observable;
import java.util.Observer;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.plaf.Border;
import com.mycompany.a2.Interfaces.IGameWorld;

public class MapView extends Container implements Observer {
	
	public MapView() {
		this.getStyle().setBorder(Border.createLineBorder(5, ColorUtil.BLACK));
	}
	
	
	
	
	
	
	
	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		((IGameWorld)observable).printMap();
	}

}
