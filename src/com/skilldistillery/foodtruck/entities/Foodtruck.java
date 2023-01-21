package com.skilldistillery.foodtruck.entities;

public class Foodtruck {
	private static int NEXT_TRUCK_ID = 1001;
	private int id;
	private String name;
	private String foodtype;
	private int rating;

	public Foodtruck() {
		
	}
	
	public Foodtruck(String name, String foodtype, int rating) {
		id = NEXT_TRUCK_ID;
		NEXT_TRUCK_ID++;
		this.name = name;
		this.foodtype = foodtype;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}

	@Override
	public String toString() {
		return "Truck ID: " + id + ", " + (name != null ? "Truck Name: " + name + ", " : "")
				+ (foodtype != null ? "Type of Food Served: " + foodtype + ", " : "") + "Rating: " + rating;
	}

	public static int getNextTruckID() {
		return NEXT_TRUCK_ID;
	}
	
	

	
	

}
