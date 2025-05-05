import java.util.Scanner;

public class Calci{
	public double add(double num1, double num2) {     //addition method to add two numbers
	        double sum = num1 + num2;
        	return sum;
    	}
    	public double sub(double num1, double num2) {     //substraction mrthod to subtract a number from another
        	double difference = num1 - num2;
        	return difference;
    	}
    	public double multiply(double num1, double num2) {   //multiplication method to multiply two numbers
        	double mul = num1 * num2;
        	return mul;
    	}
    	public double divide(double dividend, double divisor) {   //division method that takes two numbers and return their quotient
    		try {
    			if(divisor == 0) {
           			throw new ArithmeticException("Division by zero is not allowed");
        		}
        		return dividend / divisor;
    		}
    		catch (ArithmeticException e) {
    			e.printStackTrace();
    			return Double.NaN;
    		}
    		finally {
    			System.out.println("Division operation completed");
    		}
    	}
    	public int modulus(int num1, int num2) {    //modulus method that takes two integers and return their remainder
        	if(num2 != 0) {
           		int remainder = num1 % num2;
           		return remainder;
        	} 
        	else {
           		return -1;                        //Return -1 to indicate an error
        	}
    	}
    	public double calculateSquare(double num){       //square method to find the square of any number
        	double result = num * num;
        	return result;
    	}
    	public double Cube(double num){                           //To find a cube of a number
        	double cube = num * num * num;
        	return cube;
    	}
    	public double exponential(double base, long exponent){    //exponential method that takes the base and exponent as arguments and return power as result
        	double result = 1;
        	for (int i = 1; i <= exponent; i++) {
        		result *= base;
        	}
        	return result;
    	}
    	public long squareroot(long num) {                       //square root method to find a square root of any number greater than zero
        	for (int i = 0; i <= num; i++) {
        		if(i * i == num) {
        			return i;
        		} 
        	}
        	return -1;
    	}
    	public long CubeRoot(long num){   //To find the cube root of a number
        	for (int i = 0; i <= num; i++) {
        		if(i * i * i == num) {
        			return i;
        		} 
        	}
        	return -1;
    	}
    	public String Reciprocal(long num){    //Method to find the reciprocal of any non-zero number
        	if(num!=0){
           		return 1 + "/" + num;
        	}
        	else{
          		return "Undefined";     //Return -1 if number is 0, reciprocal of 0 is not defined
        	}
    	}
    	public long factorial(long num){      //To find a factorial of a number
        	if(num<0){
           		return -1;    //return -1 to indicate error
        	} 
        	else if(num==0){
           		return 1;     //return 1 if number is 0,factorial of 0 is 1
        	} 
        	else{
           		return num*factorial(num-1);   //Recursive case to calculate factorial of a valid number
        	}
    	}
    	public String nPr(long n, long r) {                             // to find permutation using factorial method
    		Calci calci = new Calci();
    		n = calci.factorial(n);
    		r = calci.factorial(r);
    		return n + "/" + r;                                    // returns a String (n / r)
    	}
    	public String nCr(long n, long r) {                             // to find combination using factorial method
    		Calci calci = new Calci();
    		long a = n - r;
    		n = calci.factorial(n);
    		r = calci.factorial(r);
    		a = calci.factorial(a);
    		return n + "/" + (r + "*" + a);                        // returns a String (n / r * a)
    	}
    	public String convertMixedtoImproper(long whole, long numerator, long denominator) {                      // to conert a mixed fraction into improper fraction
    		if(denominator == 0) {
    			return "Undefined";
    		}
    		long improperNumerator = whole * denominator + numerator;
    		return improperNumerator + "/" + denominator;
    	}
    	public String convertImpropertoMixed(long numerator, long denominator) {                     // to convert improper fraction into mixed fraction
    		if(denominator == 0) {
    			return "Undefined";
    		}
    		long whole = numerator / denominator;
    		long mixedNumerator = numerator % denominator;
    		return whole + " " + mixedNumerator + "/" + denominator;
    	}
    	public double summation(double num,int startIndex,int endIndex) {             //to find summation of a number (endIndex - startIndex + 1) number of times
    		double result = 0;
    		if(startIndex > endIndex || startIndex < 0) {
    			return -1;
    		}
    		else if(startIndex == endIndex) {
    			return num;
    		}
    		else {
    			for(int i = startIndex; i <= endIndex;i++) {
    				result += num;
    			}
    		}
    		return result;
    	}
    	public double logarithm(double num,double base){     //lagarithmic method to find the log of any number to any base
        	if (num <= 0 || base <= 0 || base == 1) {
				return -1; // Return -1 for invalid inputs
			}
		
			// Approximate natural logarithm (log_e) using series expansion
			double logNum = approximateLogE(num);
			double logBase = approximateLogE(base);
		
			// Return log_base(num) = log_e(num) / log_e(base)
			return logNum / logBase;
    	}
		private double approximateLogE(double x) { // Helper method to approximate natural log (ln)
			if (x <= 0) {
				return -1; // Logarithm of non-positive numbers is undefined
			}
		
			double result = 0;
			double term = (x - 1) / (x + 1); // Use the log series expansion
			double termSquared = term * term;
			double numerator = term;
			int n = 1;
		
			// Use 10 terms for approximation
			for (int i = 0; i < 10; i++) {
				result += numerator / n;
				numerator *= termSquared;
				n += 2;
			}
		
			return 2 * result; // Multiply by 2 as per the series formula
		}
    	public double powerOF10(double num){                 //to find nth power of 10
    		double result = 1;
    		if(num == 0) {
    			return result;                      //0th power of any number is 1
    		}
    		if(num > 0) {
    			for(int i = 0; i <= num; i++) {
    				result *= 10;
    			}
    		} else {
    			for(int i = 1; i<= -num; i++) {
    				result /= 10;
    			}
    		}
    		return result;
    	}
    	public double powerOFe(double num) {                        //to find nth power of e
    		double e = 2.718281828;
    		double result = 1;
    		if(num == 0) {
    			return result;                             //0th power of any number is 1
    		}
    		if(num > 0) {
    			for(double i = 0; i < num; i++) {
    				result *= e;
    			}
    		} else {
    			for(double i = num; i< 0; i++) {
    				result /= e;
    			}
    		}
    		return result;
    	}
    	public double convertDegreeToRadian(double degrees) {          // to conevrt degrees to radians
    		double piApprox = 3.14159;
    		
    		return degrees * piApprox / 180.0;
    	}
    	public double convertRadianToDegree(double radians) {           // to convert radians to degree
    		double piApprox = 3.14159;
    		
    		return radians * 180.0 / piApprox;
    	}
    	public double sin(double angleInRadians) {                       // to find sin value of any angle in radians
		double result = 0;
		int terms = 10;
		
		for (int i = 0; i < terms; i++) { 
			result += exponential(-1, i) * exponential(angleInRadians, 2 * i + 1) / factorial(2 * i + 1);
		}
		return result;
    	}
    	public double cos(double angleInRadians) {                       // to find cos value of any angle in radians
    		double result = 0;
    		int terms = 10;
    		
    		for(int i = 0; i < terms; i++) {
    			result += exponential(-1, i) * exponential(angleInRadians, 2 * i) / factorial(2 * i);
    		}
    		return result;
    	}
    	public double tan(double angleInRadians) {                        // to find tan value of any angle in radians
    		double sin_value = sin(angleInRadians);
    		double cos_value = cos(angleInRadians);
    		
    		return (sin_value / cos_value);
    	}
    	public double cot(double angleInRadians) {                          // to find cot value of any angle in radians
    		double tan_value = tan(angleInRadians);
    		
    		return (1 / tan_value);
    	}
    	public double cosec(double angleInRadians) {                       // to find cosec value of any angle in radians
    		double sin_value = sin(angleInRadians);
    		
    		return (1 / sin_value);
    	}
    	public double sec(double angleInRadians) {                           // to find sec value of any angle in radians
    		double cos_value = cos(angleInRadians);
    		
    		return (1 / cos_value);
    	}
    	static class Complex {                                              // Complex class to perform add, sub, mul, div operations on complex numbers
		double real;
		double imaginary;
		Complex(double real, double imaginary) {
			this.real = real;
			this.imaginary = imaginary;
		}
		public Complex add(Complex C) {
			double realPart = this.real + C.real;
			double imaginaryPart = this.imaginary + C.imaginary;
			return new Complex(realPart, imaginaryPart);
		}
		public Complex subtract(Complex C) {
			double realPart = this.real - C.real;
			double imaginaryPart = this.imaginary - C.imaginary;
			return new Complex(realPart, imaginaryPart);
		}
		public Complex mul(Complex C) {
			double realPart = this.real * C.real - this.imaginary * C.imaginary;
			double imaginaryPart = this.real * C.imaginary + this.imaginary * C.real;
			return new Complex(realPart, imaginaryPart);
		}
		public Complex div(Complex C) {
			double denominator = C.real * C.real + C.imaginary * C.imaginary;
			double realPart = (this.real * C.real + this.imaginary * C.imaginary) / denominator;
			double imaginaryPart = (this.imaginary * C.real - this.real * C.imaginary) / denominator;
			return new Complex(realPart, imaginaryPart);
		}
		public String toString() {
			return "(" + real + "+" + imaginary + "i)";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calci calci = new Calci();
		boolean exit = false;
		
		System.out.println("Welcome to Calculator !!");
		
		while (!exit) {
			System.out.println("Select an operation:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Square");
			System.out.println("7. Cube");
			System.out.println("8. Exponential");
			System.out.println("9. Square Root");
			System.out.println("10. Cube Root");
			System.out.println("11. Reciprocal");
			System.out.println("12. Factorial");
			System.out.println("13. Permutation (nPr)");
			System.out.println("14. Combination (nCr)");
			System.out.println("15. Convert Mixed to Improper Fraction");
			System.out.println("16. Convert Improper to Mixed Fraction");
			System.out.println("17. Summation of a number n times (startIndex, endIndex)");
			System.out.println("18. Logarithm (base, num)");
			System.out.println("19. Power of 10 (num)");
			System.out.println("20. Power of e (num)");
			System.out.println("21. Convert Degree to Radian (degrees)");
			System.out.println("22. Convert Radian to Degree (radians)");
			System.out.println("23. Sine (angleInRadians)");
			System.out.println("24. Cosine (angleInRadians)");
			System.out.println("25. Tangent (angleInRadians)");
			System.out.println("26. Cotangent (angleInRadians)");
			System.out.println("27. Cosecant (angleInRadians)");
			System.out.println("28. Secant (angleInRadians)");
			System.out.println("29. Complex Number Operations (add, sub, mul, div)");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch(choice) {
				case 1:
					System.out.print("Enter two numbers: ");
					double num1 = sc.nextDouble();
					double num2 = sc.nextDouble();
					System.out.println("Result: " + calci.add(num1, num2));
					break;
				case 2:
					System.out.print("Enter two numbers: ");
					num1 = sc.nextDouble();
					num2 = sc.nextDouble();
					System.out.println("Result: " + calci.sub(num1, num2));
					break;
				case 3:
					System.out.print("Enter two numbers: ");
					num1 = sc.nextDouble();
					num2 = sc.nextDouble();
					System.out.println("Result: " + calci.multiply(num1, num2));
					break;
				case 4:
					System.out.print("Enter two numbers: ");
					num1 = sc.nextDouble();
					num2 = sc.nextDouble();
					System.out.println("Result: " + calci.divide(num1, num2));
					break;
				case 5:
					System.out.print("Enter two integers: ");
					int intNum1 = sc.nextInt();
					int intNum2 = sc.nextInt();
					int result = calci.modulus(intNum1, intNum2);
					if(result == -1) {
						System.out.println("Error: Division by zero is not allowed.");
					} else {
						System.out.println("Result: " + result);
					}
					break;
				case 6:
					System.out.print("Enter a number: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.calculateSquare(num1));
					break;
				case 7:
					System.out.print("Enter a number: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.Cube(num1));
					break;
				case 8:
					System.out.print("Enter base and exponent: ");
					num1 = sc.nextDouble();
					long exponent = sc.nextLong();
					System.out.println("Result: " + calci.exponential(num1, exponent));
					break;
				case 9:
					System.out.print("Enter a number to find its square root: ");
					long squareRootNum = sc.nextLong();
					long squareRootResult = calci.squareroot(squareRootNum);
					if (squareRootResult == -1) {
						System.out.println("Error: Square root of negative number is not defined.");
					} else {
						System.out.println("Result: " + squareRootResult);
					}
					break;
				case 10:
					System.out.print("Enter a number to find its cube root: ");
					long cubeRootNum = sc.nextLong();
					long cubeRootResult = calci.CubeRoot(cubeRootNum);
					if (cubeRootResult == -1) {
						System.out.println("Error: Cube root of negative number is not defined.");
					} else {
						System.out.println("Result: " + cubeRootResult);
					}
					break;
				case 11:
					System.out.print("Enter a number to find its reciprocal: ");
					long reciprocalNum = sc.nextLong();
					String reciprocalResult = calci.Reciprocal(reciprocalNum);
					System.out.println("Result: " + reciprocalResult);
					break;
				case 12:
					System.out.print("Enter a number to find its factorial: ");
					long factorialNum = sc.nextLong();
					long factorialResult = calci.factorial(factorialNum);
					if (factorialResult == -1) {
						System.out.println("Error: Factorial of negative number is not defined.");
					} else {
						System.out.println("Result: " + factorialResult);
					}
					break;
				case 13:
					System.out.print("Enter n and r for permutation (nPr): ");
					long n = sc.nextLong();
					long r = sc.nextLong();
					String nPrResult = calci.nPr(n, r);
					System.out.println("Result: " + nPrResult);
					break;
				case 14:
					System.out.print("Enter n and r for combination (nCr): ");
					n = sc.nextLong();
					r = sc.nextLong();
					String nCrResult = calci.nCr(n, r);
					System.out.println("Result: " + nCrResult);
					break;
				case 15:
					System.out.print("Enter whole number, numerator and denominator: ");
					long whole = sc.nextLong();
					long numerator = sc.nextLong();
					long denominator = sc.nextLong();
					String improperFractionResult = calci.convertMixedtoImproper(whole, numerator, denominator);
					System.out.println("Result: " + improperFractionResult);
					break;
				case 16:
					System.out.print("Enter numerator and denominator: ");
					numerator = sc.nextLong();
					denominator = sc.nextLong();
					String mixedFractionResult = calci.convertImpropertoMixed(numerator, denominator);
					System.out.println("Result: " + mixedFractionResult);
					break;
				case 17:
					System.out.print("Enter a number, startIndex and endIndex: ");
					num1 = sc.nextDouble();
					int startIndex = sc.nextInt();
					int endIndex = sc.nextInt();
					double summationResult = calci.summation(num1, startIndex, endIndex);
					if (summationResult == -1) {
						System.out.println("Error: Invalid range for summation.");
					} else {
						System.out.println("Result: " + summationResult);
					}
					break;
				case 18:
					System.out.print("Enter base and number for logarithm: ");
					num1 = sc.nextDouble(); // Use the existing variable
					double base = sc.nextDouble();
					double logResult = calci.logarithm(num1, base);
					if (logResult == -1) {
						System.out.println("Error: Logarithm is undefined for non-positive numbers or invalid base (base <= 0 or base == 1).");
					} else {
						System.out.println("Result: " + logResult);
					}
					break;
				case 19:
					System.out.print("Enter a number to find its power of 10: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.powerOF10(num1));
					break;
				case 20:
					System.out.print("Enter a number to find its power of e: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.powerOFe(num1));
					break;
				case 21:
					System.out.print("Enter degrees to convert to radians: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.convertDegreeToRadian(num1));
					break;
				case 22:
					System.out.print("Enter radians to convert to degrees: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.convertRadianToDegree(num1));
					break;
				case 23:
					System.out.print("Enter angle in radians to find sine: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.sin(num1));
					break;
				case 24:
					System.out.print("Enter angle in radians to find cosine: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.cos(num1));
					break;
				case 25:
					System.out.print("Enter angle in radians to find tangent: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.tan(num1));
					break;
				case 26:
					System.out.print("Enter angle in radians to find cotangent: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.cot(num1));
					break;
				case 27:
					System.out.print("Enter angle in radians to find cosecant: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.cosec(num1));
					break;
				case 28:
					System.out.print("Enter angle in radians to find secant: ");
					num1 = sc.nextDouble();
					System.out.println("Result: " + calci.sec(num1));
					break;
				case 29:
					System.out.print("Enter real and imaginary parts of two complex numbers: ");
					double real1 = sc.nextDouble();
					double imaginary1 = sc.nextDouble();
					double real2 = sc.nextDouble();
					double imaginary2 = sc.nextDouble();
					
					Complex num1C = new Complex(real1, imaginary1);
					Complex num2C = new Complex(real2, imaginary2);
					
					System.out.println("Addition: " + num1C.add(num2C));
					System.out.println("Subtraction: " + num1C.subtract(num2C));
					System.out.println("Multiplication: " + num1C.mul(num2C));
					System.out.println("Division: " + num1C.div(num2C));
					break;
				case 0:
					exit = true;
					System.out.println("Exiting the calculator. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					break;
			}
		}
		sc.close();
	}
}
