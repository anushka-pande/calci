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
    public static double sqauareroot(double num){
        if(num>=0){
           double SquareRoot=Math.sqrt(num);
           return SquareRoot;
        }
        else{
           return -1;  //Return -1 to indicate an error
        }
    }
}
