
public class Assignment21 {

	public String str;
	public double val;

	public Assignment21(String str, double val) {
		this.str = str;
		this.val = val;
	}

	public Assignment21() {
		this.str = "JAVA";
		this.val = 0.0;
	}

	public Assignment21(String str) {
		this.str = str;
		this.val = 0.0;
	}

	public Assignment21(double val) {
		this.val = val;
		this.str = "JAVA";
	}

	public void print() {
		System.out.println("str: " + str + " val:" + val);
	}
}
