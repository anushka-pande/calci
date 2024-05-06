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
        	double result=1;
        	if(num>0){
           		for(int i = 1; i <= num; i++) {
           			result *= base;
           			if(num == result) {
           				return i;
           			}
           		}
        	}
        	return -1;
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
    		
    		Calci calci = new Calci();
    		
    		System.out.println("Welcome to Calculator !!");
    		
    	}
    	
}
