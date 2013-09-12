package by.bsu.goncharov.runner;

import java.util.Scanner;

import by.bsu.goncharov.model.Tree;

public class Runner {

	public static void main(String[] args) {
		Tree tree = new Tree();
		printMenu();
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (true) {
				try {
					String str =  sc.nextLine();
					int command = Integer.parseInt(str);
					int numberOfApples;
					switch (command) {
					case 1:
						numberOfApples = tree.grow();
						System.out.println("Method grow: " + numberOfApples + " apples grew on the tree.");
						break;
					case 2:
						numberOfApples = tree.shake();
						System.out.println("Method shake: " + numberOfApples + " apples fallen from the tree.");
						break;
					case 3:
						System.exit(0);
					default:
						System.out.println("No such command.");
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("No such command.");
				}
			}
		} finally {
			sc.close();
		}
	}
	
	private static void printMenu() {
		System.out.println("Select command:");
		System.out.println("1.Grow");
		System.out.println("2.Shake");
		System.out.println("3.Exit");
	}
}
