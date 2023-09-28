package com.inheritance.herachical;

// HIERACHICAL INHERITANCE 

class Acount
{
	long   Acc_no;
	String Owner_name;
	double Balance;
	
	// Constructor Initilize With Iheritance Concepts
	public Acount(long Acc_no,String Owner_name)
	{
		this.Acc_no     = Acc_no;
		this.Owner_name = Owner_name;	
	}
	
	public void deposit(double Amt) 
	{
		Balance = Balance + Amt;
		System.out.println("Deposited Amount : "+Amt+" Current Amount : "+Balance);
	}
	
	// copied this method using child class
	public void withdraw(double Amt) 
	{
		Balance = Balance - Amt;
		System.out.println("Withdraw Amount : "+Amt+" Current Amount : "+Balance);
	}
	public void displayDetails() 
	{
		System.out.println("Name :"+Owner_name);
		System.out.println("Account No : "+Acc_no);
	}
}

class Savings extends Acount  
{
	double rateOfintrest; 
	
	
	public Savings(double rateOfintrest,long Acc_no,String Owner_name)
	{
		super(Acc_no,Owner_name); //--> Initilize parent class data members using " Super(); " keywords to achive object class
		this.rateOfintrest=rateOfintrest;
	}
	
	public void calculate_roi() 
	{
		Balance = Balance + Balance * rateOfintrest;
		System.out.println("Savings Amount : "+Balance+" With Rs/- "+rateOfintrest+" % Intrest ");
	}
}

class Current extends Acount 
{
	final  double minbal = 500.0; // minbal = minimum balance should be constant
	
	// Constructor Initilize With Iheritance Concepts
	public Current(long Acc_no,String Owner_name)
	{
		super(Acc_no,Owner_name);  //--> Initilize parent class data members using " Super(); " keywords to achive object class
	}
	
	@Override             // --> Modified the methods from parent class is known as "Method Overriding"
	public void withdraw(double Amt) 
	{
		if(Amt>=0 && Balance-minbal >= Amt)
		{
			Balance = Balance - Amt;
			System.out.println("Withdraw Amount : "+Amt+" Current Amount : "+Balance);
		}else {System.out.println("Insufficient Amount");}
	}	
}

public class Main_Method 
{
	public static void main(String...args) 
	{      
		// Current Account class object
		Current c = new Current(7339110990l, "Madesh");
		        c.displayDetails();
		        c.deposit(600.0);
		        c.withdraw(150.0);              
	}
}
