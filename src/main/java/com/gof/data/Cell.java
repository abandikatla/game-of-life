package com.gof.data;

/**
 * @author abandik
 * Each cell has a state - ALIVE or DEAD
 */

public class Cell {

	private State state;
	
	public Cell(State state){
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public boolean isAlive(){
		if(this.state.equals(State.ALIVE)){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return state.getKey();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cell){
			Cell cell = (Cell)obj;
			if(state.equals(cell.getState()))
				return true;
		}
		return false;
	}
}
