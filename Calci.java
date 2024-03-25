public class Calci{
	public double add(double num1,double num2) {     //addition method to add two numbers
	        double sum=num1+num2;
        	return sum;
    	}
    	public double sub(double num1,double num2) {     //substraction mrthod to subtract a number from another
        	double difference=num1-num2;
        	return difference;
    	}
    	public double multiply(double num1,double num2) {   //multiplication method to multiply two numbers
        	double mul=num1*num2;
        	return mul;
    	}
    	public double divide(double dividend,double divisor) {   //division method that takes two numbers and return their quotient
        	if(divisor!=0) {
           		int quotient=dividend/divisor;
           		return quotient;
        	} else{
           		return -1; //Return -1 to indicate an error
        	}
    	}
    	public int modulus(int num1,int num2) {    //modulus method that takes two integers and return their remainder
        	if(num2!=0) {
           		int remainder=num1%num2;
           		return remainder;
        	} else {
           		return -1;  //Return -1 to indicate an error
        	}
    	}
    	public long squareroot(long num) {      //square root method to find a square root of any number greater than zero
        	for (int i = 0; i <= num; i++) {
        		if(i * i == num) {
        			return i;
        		} 
        	}
        	return -1;
    	}
    	public double exponential(double base,long exponent){    //exponential method that takes the base and exponent as arguments and return power as result
        	double result = 1;
        	for (int i = 1; i <= exponent; i++) {
        		result *= base;
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
    	public double calculateSquare(double num){       //square method to find the square of any number
        	double result = num * num;
        	return result;
    	}
    	public String Reciprocal(int num){    //Method to find the reciprocal of any non-zero number
        	if(num!=0){
           		return 1 + "/" + num;
        	}
        	else{
          		return "Undefined";     //Return -1 if number is 0, reciprocal of 0 is not defined
        	}
    	}
    	public double Cube(double num){     //To find a cube of a number
        	double cube = num * num * num;
        	return cube;
    	}
    	public long CubeRoot(long num){   //To find the cube root of a number
        	for (int i = 0; i <= num; i++) {
        		if(i * i * i == num) {
        			return i;
        		} 
        	}
        	return -1;
    	}
    	public long factorial(int num){      //To find a factorial of a number
        	if(num<0){
           		return -1;    //return -1 to indicate error
        	} else if(num==0){
           		return 1;     //return 1 if number is 0,factorial of 0 is 1
        	} else{
           		return num*factorial(num-1);   //Recursive case to calculate factorial of a valid number
        	}
    	}
    	public double powerOF10(double num){    //to find nth power of 10
    		double result = 1;
    		if(num == 0) {
    			return result; //0th power of any number is 1
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
    	public String convertMixedtoImproper(int whole, int numerator, int denominator) {
    		if(denominator == 0) {
    			return "Undefined";
    		}
    		int improperNumerator = whole * denominator + numerator;
    		return improperNumerator + "/" + denominator;
    	}
    	public double summation(double num,int startIndex,int endIndex) {
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
    	public double convertDegreeToRadian(double degrees) {
    		double piApprox = 3.14159;
    		
    		return degrees * piApprox / 180.0;
    	}
    	public double convertRadianToDegree(double radians) {
    		double piApprox = 3.14159;
    		
    		return radians * 180.0 / piApprox;
    	}
    	public double sin(double angleInRadians) {
		double result = 0;
		for (int i = 0; i < 10; i++) { // Adjust the number of iterations for accuracy
		    result += exponential(-1, i) * exponential(angleInRadians, 2 * i + 1) / factorial(2 * i + 1);
		}
		return result;
    	}
    	public double cos(double angleInRadians) {
    		double sin_value = sin(angleInRadians);
    		double sin_square = sin_value * sin_value;
    		double cos_square = (1 - sin_square);
    		
    		return Math.sqrt(cos_square);
    	}
    	public static void main(String[] args) {
    		Calci calci = new Calci();
    		
    	}
    	
}
