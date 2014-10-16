package com.gof.services;

import com.gof.data.Generation;
import com.gof.data.State;
/**
 * @author abandik
 * As part of evolution, next generation evolves from current generation 
 */
public class Evolution {
	
	/**
	 * @param generation
	 * @param x
	 * @param y
	 * @return The number of alive neighbors for a given cell[x][y] in generation.
	 */
	protected int getNumberOfLiveNeighbors(Generation generation, int x, int y) {
		
		int liveNeighborsCount = 0;
		if(x >= generation.getM() || y >= generation.getN())
			return -1;

		if(x-1 >= 0 ) {
			if(y-1 >= 0 && generation.getCell(x-1, y-1).isAlive())
				liveNeighborsCount ++;
			if(generation.getCell(x-1, y).isAlive())
				liveNeighborsCount ++;
			if(y+1 < generation.getN() && generation.getCell(x-1, y+1).isAlive())
				liveNeighborsCount ++;
		}
		
		if(y-1 >= 0 && generation.getCell(x, y-1).isAlive())
			liveNeighborsCount ++;
		if(y+1 < generation.getN() && generation.getCell(x, y+1).isAlive())
			liveNeighborsCount ++;
		
		if(x+1 < generation.getM()) {
			if(y-1 >= 0 && generation.getCell(x+1, y-1).isAlive())
				liveNeighborsCount ++;
			if(generation.getCell(x+1, y).isAlive())
				liveNeighborsCount ++;
			if(y+1 < generation.getN() && generation.getCell(x+1, y+1).isAlive())
				liveNeighborsCount ++;
		}
		
		return liveNeighborsCount;
	}

	/**
	 * @param currentGeneration
	 * @return The next generation after evaluating based on the rules of the game
	 */
	public Generation getNextGeneration(Generation currentGeneration){
		if(currentGeneration == null)
			return null;
		
		Generation nextGeneration = new Generation(currentGeneration.getM(), currentGeneration.getN());
		
		//Iterate over each row in currentGeneration
		for(int i=0; i < currentGeneration.getM(); i++){
			//Iterate over each column in currentGeneration[i]
			for(int j=0; j < currentGeneration.getN(); j++) {
				
				int liveNeighborsCount = getNumberOfLiveNeighbors(currentGeneration, i, j);
				nextGeneration.setCellDead(i, j);

				if(currentGeneration.getCell(i, j).isAlive()){
					if (liveNeighborsCount >= 2 && liveNeighborsCount <= 3){
						nextGeneration.setCellAlive(i, j);
					}
				} else {
					if(liveNeighborsCount == 3) {
						nextGeneration.setCellAlive(i, j);
					}
				}
				
			}
		}
		return nextGeneration;
	}
}
