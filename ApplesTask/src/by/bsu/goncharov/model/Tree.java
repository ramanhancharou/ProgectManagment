package by.bsu.goncharov.model;

import java.util.ArrayList;
import java.util.Random;

import by.bsu.goncharov.exceptions.LogicalException;
import by.bsu.goncharov.service.TreeService;

public class Tree implements TreeService {
	
	private static final int MAX_FLOWERS = 500;
	
	private ArrayList<Apple> apples = new ArrayList<Apple>();
	private int numberOfFlowers;

	public Tree() {}

	public ArrayList<Apple> getApples() {
		return apples;
	}

	public void setApples(ArrayList<Apple> apples) {
		this.apples = apples;
	}
	
	public int getNumberOfFlowers() {
		return numberOfFlowers;
	}

	public void setNumberOfFlowers(int numberOfFlowers) {
		this.numberOfFlowers = numberOfFlowers;
	}

	@Override
	public int grow() throws LogicalException {
		if(numberOfFlowers == 0) {
			throw new LogicalException("There are no flowers on the tree.");
		}
		for (int i = 0; i < numberOfFlowers; i++) {
			Apple apple = new Apple();
			apples.add(apple);
		}
		numberOfFlowers = 0;
		return apples.size();
	}

	@Override
	public int shake() {
		Random rand = new Random();
		int size = apples.size();
		if (size != 0) {
			int count = rand.nextInt(size) % size;
			if (count != 0) {
				for (int i = 0; i < count; i++)  {
					size--;
					int index = rand.nextInt(size);
					apples.remove(index);
				}
			}
			return count;
		} else {
			return 0;
		}
	}
	
	@Override
	public int flower() {
		Random rand = new Random();
		numberOfFlowers += rand.nextInt(MAX_FLOWERS);
		return numberOfFlowers;
	}
}
