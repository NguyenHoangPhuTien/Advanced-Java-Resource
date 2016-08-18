package Equation;

public abstract class Equation {

	double a;
	double b;

	public Equation() {
		super();
	}

	public Equation(double a, double b) {
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
	
	// Find root for equation
	// Output result for a double variable type
	public abstract double findRoot();
}
