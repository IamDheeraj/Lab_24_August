package lab_24_august;   // creating package 

import java.util.Scanner;    // importing scanner class 

public class ShowRoom_Q2 {       // creating class ShowRoom
    // declaration of variables 
	static String name;
    static 	long mobNo;
	static double cost,amount,discount;
	static Scanner sc=new Scanner (System.in);   // creating object of the scanner class 
	public static void main(String[] args) {   // main method of the class 
		ShowRoom_Q2 obj=new ShowRoom_Q2();            // creating object of the class 
		obj.input();                                      // calling input method 
		obj.calculate();                  // calling calculate method 
		obj.display();                   // calling display method 
	}
	
	public ShowRoom_Q2() {    // creating constructor of class 
		name = "";
        mobNo = 0;
        cost = 0;
        discount = 0;
        amount = 0;
	}

	public void input()          // input method for user input 
	{
		System.out.print("Enter Your Name : ");
		name=sc.nextLine();
		System.out.print("Enter Mobile Number : ");
		mobNo=sc.nextLong();
		System.out.print("Enter Cost Of Product : ");
		cost=sc.nextDouble();
		
	}
	
	public void calculate()      // creating calculate method and implementing logics using if-else
	{
		if(cost<=10000)
		{
			discount=cost*0.05;
		}
		else if(cost<=20000)
		{
			discount=cost*0.10;
		}
		else if(cost<=35000)
		{
			discount=cost*0.15;
		}
		else
		{
			discount=cost*0.20;
		}
		amount=cost-discount;
	}
	public void display()        /// creating display method for output of user details 
	{
		System.out.println("\n<--------------------------------------------->\n");
		System.out.println("After Discount \n");
		System.out.println("Customer Name : "+name);
		System.out.println("Customer Mobile No : "+mobNo);
		System.out.println("Amount To Be Paid : "+amount);
	}

}
