
public class Main {
	
	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.name = "Bubbly";
		dog1.age = 5;
		dog1.breed = "Poodle";
		dog1.color = "White";

		System.out.println(dog1.name + ": " + dog1.age + ": " + dog1.breed + ": " + dog1.color);

		dog1.bark();
		dog1.eat();
		dog1.wagTail();
		
		System.out.println("-----------------------------------");
		

		Dog2 dog = new Dog2();
				
		System.out.println(dog.name + ": " + dog.age + ": " + dog.breed + ": " + dog.color);
		
		System.out.println("-----------------------------------");
		
		Dog2 dog3 = new Dog2("Rusty", 20, "Bulldog", "Brown");
		System.out.println(dog3.name + ": " + dog3.age + ": " + dog3.breed + ": " + dog3.color);
		
		

	}

}
