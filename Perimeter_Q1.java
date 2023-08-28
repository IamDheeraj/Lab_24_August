package lab_24_august;  // creating package 

import java.util.Scanner;  // importing scanner class 

public class Perimeter_Q1 {   // creating class 

	static Scanner sc =new Scanner(System.in); // object of scanner class 
	double a,l,b,r;                             // declaration of variables 
	static Perimeter_Q1 obj=new Perimeter_Q1();        // creating object of the class
	public static void main(String[] args) 
	{
		// header of the class 
		System.out.println("This is for perimeter of Square, Rectangle and Circle only \n");
		obj.switch_case();   // calling switch_case method 
	}
	public double square( double s)   // method for perimeter of square 
	{
		return(4*s);
	}
	public double rectangle( double l,double b)  // method for perimeter of rectangle 
	{
		return(2*(l+b));
	}
	public double circle(double r)  // method for perimeter of circle 
	{
		return(2*(22/7)*r);
	}
	public void switch_case()   // implementing switch case 
	{
		// showing option for all method 
		System.out.println("1: For perimetr of square \n2: For perimeter of rectangle \n3: For perimeter of circle ");
		System.out.println("Chosse option ");
		int choose=sc.nextInt();
		switch(choose)
		{
		// here's all cases for all condition
		case 1:
			System.out.print("Enter length of the square = ");
			a=sc.nextDouble();
			System.out.println("Perimeter of square is = "+obj.square(a));
			break;
			
		case 2:
			System.out.println("\nEnter length and width of perimeter ");
			System.out.print("length = ");
			l=sc.nextDouble();
			System.out.print("\nwidth = ");
			b=sc.nextDouble();
			System.out.println("\nPerimeter of rectangle is = "+obj.rectangle(l,b));
			break;
			
		case 3:
			System.out.print("\nEnter radius of circle = ");
			r=sc.nextDouble();
			System.out.println("\nPerimeter of circle is = "+obj.circle(r));
			break;
		default : 
			System.out.println("You choosed wrong option ");
		}
	}

}
