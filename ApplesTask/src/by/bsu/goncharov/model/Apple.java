package by.bsu.goncharov.model;

import java.util.Random;

public class Apple {
	
	private static final int MAX_SEEDS = 20;
	
	private int numberOfSeeds;

	public Apple() {
		Random rand = new Random();
		numberOfSeeds = rand.nextInt() % MAX_SEEDS;
	}

	public int getNumberOfSeeds() {
		return numberOfSeeds;
	}

	public void setNumberOfSeeds(int numberOfSeeds) {
		this.numberOfSeeds = numberOfSeeds;
	}	
}
