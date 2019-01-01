
public class SubClass extends SuperClass{

	public SubClass(int age) {
		super(age);
		
	}
	
	@Override
	public void getAge() {
		super.getAge();
		System.out.println("The value of age in SubClass is = " + age);
	}
	
	public static void main(String[] args) {
		
		SubClass s = new SubClass(24);
		s.getAge();
		
	}
	
	
	

}
