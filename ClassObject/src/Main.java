
public class Main {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.make = "Honda";
		c1.model = "Civic";
		
		Car c2 = new Car();
		c2.make = "Toyota";
		c2.model = "Corolla";
		
		c1.start();
		c2.start();

	}

}
