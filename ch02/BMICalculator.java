package ch02;

public class BMICalculator {

	// declare variables
	static double weight;
	static double height;
	static double BMI;

	// This is our main method.
	public static void main(String[] args) {
		weight = 60;
		height = 1.70;

		 /* Here we call the method calculateBMI which will calculate and update
		 * the variable BMI
		 */
		calculateBMI();

		// print BMI value to screen
		System.out.println("Your BMI is " + BMI + ".");
	}

	// Method calculating the BMI
	public static void calculateBMI() {
		BMI = weight / (height * height);
	}
}
