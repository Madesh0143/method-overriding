package com.jsp.practice;


//Method Override Concepts
class Father
{
	public void bike() 
	{
		System.out.println("Splender Plus");
	}
}

class Son extends Father
{
	@Override          //  Modifie The Methods With The Help of " Method Override "
	public void bike() 
	{
		System.out.println("Modified Splender Plus");
	}
}

public class Demo 
{
	public static void main(String[] args) 
	{
		Son son = new Son();
		    son.bike();
	}
}
