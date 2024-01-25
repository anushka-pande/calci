public class Calci{
    public static double add(double num1,double num2){     //addition method to add two numbers
        double sum=num1+num2;
        return sum;
    }
    public static double sub(double num1,double num2){     //substraction mrthod to subtract a number from another
        double difference=num1-num2;
        return difference;
    }
    public static double multiply(double num1,double num2){   //multiplication method to multiply two numbers
        double mul=num1*num2;
        return mul;
    }
    public static double divide(double dividend,double divisor){   //division method that takes two numbers and return their quotient
        if(divisor!=0){
           int quotient=dividend/divisor;
           return quotient;
        }
        else{
           return -1; //Return -1 to indicate an error
        }
    }
    public static int modulus(int num1,int num2){    //modulus method that takes two integers and return their remainder
        if(num2!=0){
           int remainder=num1%num2;
           return remainder;
        }
        else{
           return -1;  //Return -1 to indicate an error
        }
    }
    public static double sqauareroot(double num){      //square root method to find a square root of any number greater than zero
        if(num>=0){
           double SquareRoot=Math.sqrt(num);
           return SquareRoot;
        }
        else{
           return -1;  //Return -1 to indicate an error
        }
    }
    public static double exponential(double base,double exponent){    //exponential method that takes the base and exponent as arguments and return power as result
        double result=Math.pow(base,exponent);
        return result;
    }
    public static double logarithm(double num,double base){     //lagarithmic method to find the log of any number to any base
        if(num>0 && base>1){
           double result=Math.log(num)/Math.log(base);
           return result;
        }
        else{
           return -1;    //Return -1 to indicate error
        }
    }
    public static double calculateSquare(double num){       //square method to find the square of any number
        double result=Math.pow(num,2);
        return result;
    }
    public static double NaturalLog(double num){       //To find natural log of a non-negative number 
        if(num>0){
           double result=Math.log(num);
           return result;
        }
        else{
           return -1;
        }
    }
    public static double Logbase10(double num){    //To find the log to the base 10 of a number
        if(num>0){
           double result=Math.log10(num);
           return result;
        }
        else{
           return -1;       //Return -1 if number is invalid
        }
    }
    public static double Reciprocal(double num){    //Method to find the reciprocal of any non-zero number
        if(num!=0){
           double result=1/num;
           return result;
        }
        else{
          return -1;     //Return -1 if number is 0, reciprocal of 0 is not defined
        }
    }
    public static double Cube(double num){     //To find a cube of a number
        double result=Math.pow(num,3);
        return result;
    }
    public static double CubeRoot(double num){   //To find the cube root of a number
        double result=Math.cbrt(num);
        return result;
    }
    public static long factorial(int num){      //To find a factorial of a number
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
}
