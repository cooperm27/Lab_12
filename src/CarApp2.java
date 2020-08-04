import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> allCars = new ArrayList<>();
		boolean getYesNo = true;
		int quit = 7;
		int userChoice;
		
		Car carOne = new Car("Ford", "Ranger", 2020, 25999);
		Car carTwo = new Car("Honda", "Civic", 2020, 28750);
		Car carThree = new Car("Toyota", "Prius", 2020, 39999);
		UsedCar carFour = new UsedCar ("Ford", "Pinto", 1975, 300, 275263);
		UsedCar carFive = new UsedCar ("Jeep", "Wrangler", 2006, 8000, 106400);
		UsedCar carSix = new UsedCar ("Chevy", "Silverado", 2013, 10500, 110000);
		
		allCars.add(carOne);
		allCars.add(carTwo);
		allCars.add(carThree);
		allCars.add(carFour);
		allCars.add(carFive);
		allCars.add(carSix);
		
		System.out.println("Welcome to Coder Mike's Lemon Shop, please check out our inventory of cars");
	do {	
		System.out.println("Current Inventory:");
		System.out.println();
		for(int i = 0; i <= allCars.size()-1; i++){

		  System.out.println((i+1) + ". " + allCars.get(i));
		}
			quit = allCars.size()+1;
			System.out.println(quit + ". Quit");
			userChoice = Validator.getInt(scnr, "which car would you like?");
			if (userChoice >= 1 && userChoice <= allCars.size()) {	
				System.out.println(allCars.get(userChoice - 1));
				scnr.nextLine();
				getYesNo = Validator.getYesNo(scnr, "would you like to buy this car?");
				}else getYesNo = false;
				if (getYesNo == true) {
				allCars.remove(userChoice - 1);
				System.out.println("Excellent! Our finance department will be in touch shortly");
				} 
			}while (getYesNo == true);
	System.out.println("Have a great day!");
	}	
}



