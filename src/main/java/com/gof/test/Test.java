package com.gof.test;

import com.gof.biz.Evolution;
import com.gof.data.Generation;

public class Test {
	
	private static void runTest1(){
		Evolution evolution = new Evolution();
		Generation generation = new Generation(2,2);
		String[][] input = { {"X", "X"}, {"X", "X"}};
		generation.setCells(input);
		System.out.println(evolution.getNextGeneration(generation));
	}

	private static void runTest2(){
		Evolution evolution = new Evolution();
		Generation generation = new Generation(3,3);
		String[][] input = { {"-", "X", "-"}, {"-", "X", "-"}, {"-", "X", "-"}};
		generation.setCells(input);
		System.out.println(evolution.getNextGeneration(generation));
	}

	private static void runTest3(){
		Evolution evolution = new Evolution();
		Generation generation = new Generation(3,3);
		String[][] input = { {"-", "X", "-"}, {"-", "-", "X"}, {"X", "X", "X"}};
		generation.setCells(input);
		System.out.println(evolution.getNextGeneration(generation));
	}

	private static void runTest4(){
		Evolution evolution = new Evolution();
		Generation generation = new Generation(4,3);
		String[][] input = { {"-", "X", "-"}, {"X", "X", "X"}, {"X", "-", "X"}, {"-", "X", "-"}};
		generation.setCells(input);
		System.out.println(evolution.getNextGeneration(generation));
	}

	public static void main(String[] args) {
		runTest1();
		runTest2();
		runTest3();
		runTest4();
	}

}
