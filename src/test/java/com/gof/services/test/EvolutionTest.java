package com.gof.services.test;

import org.junit.Test;

import com.gof.data.Generation;
import com.gof.services.Evolution;

import static org.junit.Assert.*;

public class EvolutionTest {

	@Test
	public void runTest1(){
		Evolution evolution = new Evolution();
		Generation generation = new Generation(2,2);
		String[][] input = { {"X", "X"}, {"X", "X"}};
		generation.setCells(input);
		
		Generation nextGeneration = new Generation(2, 2);
		String[][] output = {{"X", "X"},{"X", "X"}};
		nextGeneration.setCells(output);
		assertEquals(nextGeneration, evolution.getNextGeneration(generation));
		System.out.println(evolution.getNextGeneration(generation));

	}

	@Test
	public void runTest2(){
		Evolution evolution = new Evolution();
		Generation generation = new Generation(3,3);
		String[][] input = { {"-", "X", "-"}, {"-", "X", "-"}, {"-", "X", "-"}};
		generation.setCells(input);
		
		Generation nextGeneration = new Generation(3, 3);
		String[][] output = {{"-", "-", "-"},{"X", "X", "X"}, {"-", "-", "-"}};
		nextGeneration.setCells(output);
		assertEquals(nextGeneration, evolution.getNextGeneration(generation));
		System.out.println(evolution.getNextGeneration(generation));

	}

	@Test
	public void runTest3(){
		Evolution evolution = new Evolution();
		Generation generation = new Generation(3,3);
		String[][] input = { {"-", "X", "-"}, {"-", "-", "X"}, {"X", "X", "X"}};
		generation.setCells(input);
		
		Generation nextGeneration = new Generation(3, 3);
		String[][] output = {{"-", "-", "-"},{"X", "-", "X"}, {"-", "X", "X"}};
		nextGeneration.setCells(output);
		assertEquals(nextGeneration, evolution.getNextGeneration(generation));
		System.out.println(evolution.getNextGeneration(generation));

	}

	@Test
	public void runTest4(){
		Evolution evolution = new Evolution();
		Generation generation = new Generation(4,3);
		String[][] input = { {"-", "X", "-"}, {"X", "X", "X"}, {"X", "-", "X"}, {"-", "X", "-"}};
		generation.setCells(input);
		
		Generation nextGeneration = new Generation(4, 3);
		String[][] output = {{"X", "X", "X"},{"X", "-", "X"}, {"X", "-", "X"}, {"-", "X", "-"}};
		nextGeneration.setCells(output);
		assertEquals(nextGeneration, evolution.getNextGeneration(generation));
		System.out.println(evolution.getNextGeneration(generation));
	}
}
