package com.inheritance.herachical;


class WhatsAppMsg1
{
	public void dispaly() 
	{
		System.out.println("Single Tick");
	}
}
class WhatsAppMsg2 extends WhatsAppMsg1
{
	@Override
	public void dispaly() 
	{
		super.dispaly();
		System.out.println("Double Tick");
	}
}
class WhatsAppMsg3 extends WhatsAppMsg2
{
	@Override
	public void dispaly() 
	{
		super.dispaly();
		System.out.println("Blue Tick");
	}
}

public class Overriding 
{
	public static void main(String[] args) 
	{
	   WhatsAppMsg3 w = new WhatsAppMsg3();
	                w.dispaly();
	}
}
