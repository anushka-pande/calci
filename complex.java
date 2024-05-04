class Complex {
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
	public static void main(String[] args) {
		Complex num1 = new Complex(7,5);
		Complex num2 = new Complex(5,3);
		
		Complex sum = num1.add(num2);
		Complex diff = num1.subtract(num2);
		Complex product = num1.mul(num2);
		Complex division = num1.div(num2);
		
		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + diff);
		System.out.println("Product = " + product);
		System.out.println("Division = " + division);
	}
}
