package com.mycompany.a2;

import java.util.Vector;

import com.mycompany.a2.Interfaces.ICollection;
import com.mycompany.a2.Interfaces.IItterator;

public class GameObjectCollection implements ICollection {
	private Vector collection;
	
	public GameObjectCollection() {
		this.collection = new Vector(); 
	}
	
	
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		collection.addElement(obj);
	}
	public void delete(Object obj) {
		collection.remove(obj);
	}
	public void delete(int index) {
		collection.remove(index);
	}
	
	@Override
	public IItterator getIterator() {
		
		return new VectorIterator(collection);
	}
	

}
