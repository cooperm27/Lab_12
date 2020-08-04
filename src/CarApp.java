import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CarApp {
	
	public static void main(String[] args) {
		
		ArrayList<String> carMake = new ArrayList<>();
		ArrayList<String> carModel = new ArrayList<>();
		ArrayList<Integer> carYear = new ArrayList<>();
		ArrayList<Double> carPrice = new ArrayList<>();
		
		
		Car carList = new Car();
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		
		Scanner scnr = new Scanner(System.in);
		
		int carCount = Validator.getIntCars(scnr, "How many cars are you entering?");
		
		for (int i = 1; i <= carCount; i++) {
			System.out.println("Enter Car# " + i +" Make:");
			carMake.add(scnr.next());
			System.out.println("Enter Car# " + i +" Model:");
			carModel.add(scnr.next());
			System.out.println("Enter Car#" + i +" Year:");
			carYear.add(scnr.nextInt());
			System.out.println("Enter Car# " + i +" Price:");
			carPrice.add(scnr.nextDouble());
		}
		System.out.println("Current Inventory:");
		for (int y = 0; y < carCount; y++) {
		carList = new Car (carMake.get(y), carModel.get(y), carYear.get(y), carPrice.get(y));
		System.out.println(carList);
		}
		
	}

}


