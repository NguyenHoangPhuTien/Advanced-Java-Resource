package Calculate;

public class Forumula2no implements iCalculate {

	double a;
	double b;

	public Forumula2no() {
		super();
	}

	public Forumula2no(double a, double b) {
		
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	// Get result plus of 2 numbers
	// Return result as double type
	@Override
	public double plus() {
		
		double result = a + b;
		return result;
	}

	// Get result minus of 2 numbers
	// Return result as double type
	@Override
	public double minus() {
		
		double result = a - b;
		return result;
	}

	// Get result divide of 2 numbers
	// Return result as double type
	@Override
	public double divide() {
		
		if(b == 0)
			throw new ArithmeticException("Number 2th is not 0");
		double result = a / b;
		return result;
	}

	// Get result product of 2 numbers
	// Return result as double type
	@Override
	public double product() {
		
		double result = a * b;
		return result;
	}

}
