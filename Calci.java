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
           		for(int i = 0; i <= num; i++) {
           			result = result * base;
           			if(i = result) {
           				return i;
           			}
           		}
        	}
        	return -1;
    	}
    	public double calculateSquare(double num){       //square method to find the square of any number
        	double result=Math.pow(num,2);
        	return result;
    	}
    	public double NaturalLog(double num){       //To find natural log of a non-negative number 
        	double result=1;
        	if(num>0){
           		for(int i = 0; i <= num; i++) {
           			result = result * e;
           			if(i = result) {
           				return i;
           			}
           		}
        	}
        	return -1;
    	}
    	public double Reciprocal(double num){    //Method to find the reciprocal of any non-zero number
        	if(num!=0){
           		double result=1/num;
           		return result;
        	}
        	else{
          		return -1;     //Return -1 if number is 0, reciprocal of 0 is not defined
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
    	public double powerOF10(double n){    //to find nth power of 10
    		if(n==0){
    			return 1;     //0th power of any number is 1
    		} else{
    			double result=Math.pow(10,n);
    			return result;
    		}
    	}
    	public double powerOFe(double n){     //to find nth power of e
     		if(n==0){
    			return 1;     //0th power of any number is 1
    		} else{
    			double result=Math.exp(n);
    			return result;
    		}
    	}
}
