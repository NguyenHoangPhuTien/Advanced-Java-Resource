package Equation;

public class LinearEquation {

	public double a;
	public double b;

	public LinearEquation() {
		super();
	}

	public LinearEquation(double a, double b) {
		super();
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

	// Find root for Linear Equation
	// Output result as double variable type
	public double findRoot() {

		double root = 0;
		if (a == 0) {
			if (b == 0)
				root = 999999;
			else
				root = -999999;
		} else
			root = -b / a;
		return root;
	}

}
