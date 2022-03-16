package pack1;
//import java.lang.*;
import java.util.Scanner;

public class Evenorodd {
	
	void evenodd()
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number...");
		int a=s.nextInt();
		
		if(a%2==0)
			System.out.println("number:"+a+" is EVEN");
		else
			System.out.println("number:"+a+"is ODD");
	}
	
	public static void main(String[] args)
	{
		Evenorodd e=new Evenorodd ();
		e.evenodd();
	}

}
