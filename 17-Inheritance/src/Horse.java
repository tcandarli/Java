
public class Horse extends Animal{
	
	

	private int ears;
	private	String mane;
	
	public void neigh() {
		System.out.println("Horse is neighing");
	}
	
	public Horse(String name, int brain, int body, int size, int weight, int ears, String mane) {
		super(name, brain, body, size, weight);
		this.ears = ears;
		this.mane = mane;
		
		
	}

	/**
	 * @return the ears
	 */
	public int getEars() {
		return ears;
	}

	/**
	 * @return the mane
	 */
	public String getMane() {
		return mane;
	}
	
	

}
