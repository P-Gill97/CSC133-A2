package com.mycompany.a2;

import java.util.Vector;

import com.mycompany.a2.Interfaces.IItterator;

public class VectorIterator implements IItterator{
	private int index; 
	private Vector collection; 
	
	public VectorIterator(Vector collection) {
		this.collection = collection; 
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
		if(!(index == collection.size()-1)&& (collection.size()<=0)) {
			return true; 
		}else {
			return false;
		}
	}

}
