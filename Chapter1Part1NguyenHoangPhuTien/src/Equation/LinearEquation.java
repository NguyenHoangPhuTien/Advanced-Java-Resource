package Equation;

public class LinearEquation extends Equation{

	
	// Find root for Linear Equation
	// Output result as double variable type
	@Override
	public double findRoot() {
		
		double root = 0;
		if(a == 0){
			if(b == 0)
				root = 999999;
			else
				root = -999999;
		}
		else
			root = -b / a;
		return root;
	}

}
