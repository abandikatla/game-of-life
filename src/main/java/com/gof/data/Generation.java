package com.gof.data;

import java.util.Arrays;

/**
 * @author abandik
 * Generation contains a matrix of cells.
 */

public class Generation {
	
	private Cell[][] cells;
	private int m;
	private int n;

	public Generation(int m, int n) {
		this.setM(m);
		this.setN(n);
		cells = new Cell[m][n];
	}
	
	public Cell[][] getCells() {
		return cells;
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}
	
	public void setCells(String[][] cellsAsStrings) {
		Cell[][] cells = new Cell[cellsAsStrings.length][];
		for(int i=0; i < cellsAsStrings.length; i++){
			cells[i] = new Cell[cellsAsStrings[i].length];
			for(int j=0; j < cellsAsStrings[i].length; j++){
				cells[i][j] = new Cell(State.fromKey(cellsAsStrings[i][j]));
			}
		}
		this.cells = cells;
	}


	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public Cell getCell(int i, int j){
		return this.cells[i][j];
	}

	public void setCellAlive(int i, int j){
		if(cells != null
				&& i < m
				&& j < n){
			cells[i][j] = new Cell(State.ALIVE);
		}
	}
	
	public void setCellDead(int i, int j){
		if(cells != null
				&& i < m
				&& j < n){
			cells[i][j] = new Cell(State.DEAD);
		}
	}
	
	@Override
	public String toString() {
		String s = "Generation["
				+ "cells = [" ;
		for(int i=0; i < m; i++) {
			s += Arrays.toString(cells[i]);
			if( i < m-1 ){
				s += ",";
			}
		}
		s += "]]";
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Generation){
			Generation generation = (Generation) obj;
			return Arrays.deepEquals(cells, generation.getCells());
		}
		return false;
	}
	
}
