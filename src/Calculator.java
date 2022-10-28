public class Calculator {
	private double num1;
	private double num2;
	
	public Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double add() {
		return num1 + num2;
	}

	public double sub() {
		return num1 - num2;
	}

	public double mul() {
		return num1 * num2;
	}

	public double div() {
		return num1 / num2;
	}

	public double mod() {
		return num1 % num2;
	}

	public double pow() {
		return Math.pow(num1, num2);
	}

	public double eval(String op) {
		if (op.equals("+")) return add();
		if (op.equals("-")) return sub();
		if (op.equals("*")) return mul();
		if (op.equals("/")) return div();
		if (op.equals("%")) return mod();
		if (op.equals("^")) return pow();
		return Double.NaN;
	}
}
