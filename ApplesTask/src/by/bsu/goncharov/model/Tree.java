package by.bsu.goncharov.model;

import java.util.ArrayList;
import java.util.Random;

public class Tree {
	
	private static final int MAX_APPLES = 500;
	
	private ArrayList<Apple> apples = new ArrayList<Apple>();

	public Tree() {}

	public ArrayList<Apple> getApples() {
		return apples;
	}

	public void setApples(ArrayList<Apple> apples) {
		this.apples = apples;
	}
	
	public int grow() {
		Random rand = new Random();
		int count = rand.nextInt(MAX_APPLES);
		if (count != 0) {
			for (int i = 0; i < count; i++) {
				Apple apple = new Apple();
				apples.add(apple);
			}
		}
		return count;
	}

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
}
