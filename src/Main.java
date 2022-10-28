import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// get expression
		System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
		String expr = scanner.nextLine();

		// parse expression (assume proper input)
		int opIdx = expr.indexOf("+");
		if (opIdx == -1)
			opIdx = expr.indexOf("-");
		if (opIdx == -1)
			opIdx = expr.indexOf("*");
		if (opIdx == -1)
			opIdx = expr.indexOf("/");
		if (opIdx == -1)
			opIdx = expr.indexOf("%");
		if (opIdx == -1)
			opIdx = expr.indexOf("^");

		String op = expr.substring(opIdx, opIdx + 1);
		double num1 = Double.parseDouble(expr.substring(0, opIdx));
		double num2 = Double.parseDouble(expr.substring(opIdx + 1));

		// create calculator and print results
		Calculator calc = new Calculator(num1, num2);

		System.out.println();
		System.out.println(String.format("%s %s %s = %s",
			num1, op, num2,
			calc.eval(op)));
	}
}
