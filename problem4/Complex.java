package problem4;

import java.util.Scanner;

public class Complex {
	float x1,x2,y1,y2,real,imag;
	Scanner scanner=new Scanner(System.in);
	Complex()
	{
	    System.out.println("enter the real part of the first number");
        x1=scanner.nextFloat();
        System.out.println("enter the imaginary part of the first number");
	    y1=scanner.nextFloat();
	    System.out.println("enter the real part of the second number");
        x2=scanner.nextFloat();
        System.out.println("enter the imaginary part of the second number");
	    y2=scanner.nextFloat();
	}
	void add(){
	real=x1+x2;
	imag=y1+y2;
	System.out.println("The sum is:\t"+real+"+i("+imag+")");
	}
	void sub(){
	real=x1-x2;
	imag=y1-y2;
	System.out.println("The difference is:\t"+real+"+i("+imag+")");
	}
	void mul(){
	real=x1*x2-y1*y2;
	imag=x1*y2+x2*y1;
	System.out.println("The product is:\t"+real+"+i("+imag+")");
    }
    

    /* Define a class Complex with data members as two real numbers, constructors for
*  initialization these numbers, methods to add, subtract and multiply 2 complex numbers.*/


	public static void main(String[] args) {
        int i=0;
		Complex complex= new Complex();
		Scanner scan=new Scanner(System.in);
		while (i!=4) {
		System.out.println("Enter one of four options\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Exit");
		i=scan.nextInt();
	
            switch(i){
                case 1:
                    complex.add();
                    break;
                case 2:
                    complex.sub();
                    break;

                case 3:
                    complex.mul();
                    break;
                case 4:
                    System.out.println("Exitting");
                    break;
                default:
                    System.out.println("Invalid option");
            }
		    
        }
        scan.close();
		
    }
}
 
