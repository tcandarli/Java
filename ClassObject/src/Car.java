
public class Car {

	public String make;
	public String model;
	public int year;

	public Car(String make) {
		System.out.println(make + " is a car");
	}
	
	
	public Car(String make, String model, int year) {
		this("Honda");
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void start() {
		System.out.println(model + " Starting");
	}

	public void stop() {
		System.out.println("Stopping");
	}

}
