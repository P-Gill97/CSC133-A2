package com.mycompany.a2;

import java.util.Vector;

import com.mycompany.a2.Interfaces.ICollection;
import com.mycompany.a2.Interfaces.IItterator;

public class GameObjectCollection implements ICollection {
	private Vector collection;
	
	public GameObjectCollection() {
		collection = new Vector(); 
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
		
		return new VectorIterator();
	}
	 class VectorIterator implements IItterator{
		private int index; 
		
		
		public VectorIterator( ) {
			index = -1;
		}
		@Override
		public Object getNext() {
			// TODO Auto-generated method stub
			index++;
			return collection.elementAt(index); 

		}

		@Override
		public Object checkNext() {
			// TODO Auto-generated method stub
			return collection.elementAt(index);
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index == collection.size() -1) {
				return false;
			}
			if(collection.size() <=0) {
				return false;
			}
			return true;
		}

	}

}
