
public class UsedCar extends Car {
	
	private Double mileage;

	public Double getMileage() {
		return mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public UsedCar(Double mileage) {
		super();
		this.mileage = mileage;
	}

	public UsedCar() {
		super();
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return String.format("%-5s\t%-8s\t%-8s", getMake(),getModel(),getYear())+ ("$" + getPrice() + "(Used)" + mileage + " miles");

}
}


