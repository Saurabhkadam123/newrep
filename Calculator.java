package pack1;

import java.util.Scanner;

public class Calculator {
	Scanner s=new Scanner (System.in);
	
	public void mult ()
	{
		System.out.println("enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("multiplication is=>"+(a*b));
		
	}
	void add()
	{
		System.out.println("enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("addition is=>"+(a+b));
		
	}
	void substraction()
	{
		System.out.println("enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("substraction is=>"+(a-b));
	}
	void division()
	{
		System.out.println("enter the two number");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("division is=>"+(a/b));
	}
	
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add();
		c.substraction();
		c.mult();
		c.division();
	}

}
