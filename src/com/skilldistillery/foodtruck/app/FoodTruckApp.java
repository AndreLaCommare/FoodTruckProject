package com.skilldistillery.foodtruck.app;

import java.util.Scanner;
import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {
	// This main food truck app does NOT pass in the
	// id value for any foodtruck
	private Foodtruck[] fleet = new Foodtruck[5];
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodTruckApp app = new FoodTruckApp();
		app.getFoodTruck();
		app.callMenu();

	}

	public void getFoodTruck() {

		for (int i = 0; i < fleet.length; i++) {
			System.out.println("Enter the name of a food truck:");

			String name = kb.nextLine();

			if (name.equalsIgnoreCase("quit")) {
				break;
			} else if (fleet[i] == null) {

				System.out.println("What type of food do they serve?");
				String type = kb.nextLine();
				System.out.println("What rating will you give?");
				int rating = kb.nextInt();
				kb.nextLine();
				Foodtruck truck = new Foodtruck(name, type, rating);
				fleet[i] = truck;
			}

		}
		

	}

	public void callMenu() {

		String userInput = "";
		while (!(userInput.equals("4"))) {
			System.out.println("======= Welcome =======");
			System.out.println("Please choose an option");
			System.out.println("1.) List Trucks");
			System.out.println("2.) See Average Truck Score");
			System.out.println("3.) Show Highest Rated Truck");
			System.out.println("4.) Quit");
			userInput = kb.nextLine();
			switch (userInput) {
			case "1":
				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i] != null) {
						System.out.println(fleet[i]);
					}
				}
				break;
			case "2":
				double sum = 0.0;
				int counter = 0;
				for (int i = 0; i < fleet.length; i++) {
					// if the spot is not null then access the rating
					if (fleet[i] != null) {
						sum += (double) fleet[i].getRating();
						counter++;
					} else {

						break;
					}
				}
				double average = sum / counter;
				System.out.println("The average score of the trucks is " + average);
				break;

			case "3":
				int highestScore = fleet[0].getRating();
				Foodtruck bestTruck = fleet[0];

				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i] != null) {
						if (fleet[i].getRating() > highestScore) {
							highestScore = fleet[i].getRating();
							bestTruck = fleet[i];
						}
					} else {
						break;
					}
				}
				System.out.println("The highest rated truck is " + bestTruck);
				break;

			case "4":
				System.out.println("======= Goodbye =======");
				return;

			default:
				System.out.println("Invalid Input");
				break;
			}

		}

	}

	public int getNumTrucks(Foodtruck[] food) {
		int carCounter = 0;
		for (int i = 0; i < food.length; i++) {
			if (food[i] != null) {
				carCounter++;
			}
		}
		return carCounter;
	}

}
