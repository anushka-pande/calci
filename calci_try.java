class Calci_try {
	public long squareroot(long num) {      //square root method to find a square root of any number greater than zero
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
    	public double Cube(double num){     //To find a cube of a number
        	double cube = num * num * num;
        	return cube;
    	}
    	public double exponential(double base,long exponent){    //exponential method that takes the base and exponent as arguments and return power as result
        	double result = 1;
        	for (int i = 1; i <= exponent; i++) {
        		result *= base;
        	}
        	return result;
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
    	public String Reciprocal(int num){    //Method to find the reciprocal of any non-zero number
        	if(num!=0){
           		return 1 + "/" + num;
        	}
        	else{
          		return "Undefined";     //Return -1 if number is 0, reciprocal of 0 is not defined
        	}
    	}
    	/*
    	public double NaturalLog(double num){       //To find natural log of a non-negative number 
        	double result = 1;
        	double e =  2.71828;
        	if(num>0){
           		for(int i = 1; i <= num; i++) {
           			result *= e;
           			if(num == result) {
           				return i;
           			}
           		}
        	}
        	return -1;
    	}
    	*/
    	public double calculateSquare(double num){       //square method to find the square of any number
        	double result = num * num;
        	return result;
    	}
    	public String convertMixedtoImproper(int whole, int numerator, int denominator) {
    		if(denominator == 0) {
    			return "Undefined";
    		}
    		int improperNumerator = whole * denominator + numerator;
    		return improperNumerator + "/" + denominator;
    	}
    	public String convertImpropertoMixed(int numerator, int denominator) {
    		if(denominator == 0) {
    			return "Undefined";
    		}
    		int whole = numerator / denominator;
    		int mixedNumerator = numerator % denominator;
    		return whole + " " + mixedNumerator + "/" + denominator;
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
    	public double powerOFe(double num) {
    		double e = 2.718281828;
    		double result = 1;
    		if(num == 0) {
    			return result; //0th power of any number is 1
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
		int terms = 10;
		
		for (int i = 0; i < terms; i++) { 
			result += exponential(-1, i) * exponential(angleInRadians, 2 * i + 1) / factorial(2 * i + 1);
		}
		return result;
    	}
    	public double cos(double angleInRadians) {
    		double result = 0;
    		int terms = 10;
    		
    		for(int i = 0; i < terms; i++) {
    			result += exponential(-1,i) * exponential(angleInRadians, 2 * i) / factorial(2 * i);
    		}
    		return result;
    	}
    	public double tan(double angleInRadians) {
    		double sin_value = sin(angleInRadians);
    		double cos_value = cos(angleInRadians);
    		
    		return sin_value / cos_value;
    	}
    	public double cot(double angleInRadians) {
    		double tan_value = tan(angleInRadians);
    		
    		return (1 / tan_value);
    	}
    	public double cosec(double angleInRadians) {
    		double sin_value = sin(angleInRadians);
    		
    		return (1 / sin_value);
    	}
    	public double sec(double angleInRadians) {
    		double cos_value = cos(angleInRadians);
    		
    		return (1 / cos_value);
    	}
    	/* 
    	public String Combination(int n,int r) {
    		long factOFn = factorial(n);
    		long factOFr = factorial(r);
    		long factOFdiff = factorial(n-r);
    		return factOFn + "/" + (factOFr * factOFdiff);
    	}
    	*/
    	public static void main(String[] args) {
    		Calci calci = new Calci();
    		//System.out.println(calci.squareroot(100));
    		//System.out.println(calci.CubeRoot(1000));
    		//System.out.println(calci.Cube(10.4839));
    		//System.out.println(calci.exponential(5.78,4));
    		//System.out.println(calci.logarithm(512,2));
    		//System.out.println(calci.Reciprocal(5));
    		//System.out.println(calci.NaturalLog());
    		//System.out.println(calci.calculateSquare(5));
    		System.out.println(calci.convertMixedtoImproper(2,1,3));
    		System.out.println(calci.convertImpropertoMixed(7,3));
    		//System.out.println(calci.powerOF10(-5));
    		//System.out.println(calci.Combination(5,2));
    		//System.out.println(calci.powerOFe(-5));
    		//System.out.println(calci.summation(25,0,5));
    		//System.out.println(calci.convertDegreeToRadian(180));
    		//System.out.println(calci.convertRadianToDegree(3.14159));
    		//System.out.println(calci.sin(3.14159/4));
    		//System.out.println(calci.cos(3.14159/4));
    		//System.out.println(calci.tan(3.14159/4));
    		//System.out.println(calci.cot(3.14159/4));
    		//System.out.println(calci.cosec(3.14159/4));
    		//System.out.println(calci.sec(3.14159/4));
    	}
}
