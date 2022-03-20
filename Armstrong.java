//WAP to check if given number is armstrong or not 
package ass_additional;

import java.util.Scanner;

public class Armstrong {
	Scanner s=new Scanner(System.in);
	
	int num,sum,n,rem;
	
	
	void inputnum()
	{
		System.out.println("enter the number...");
		num=s.nextInt();
	}
	void checknum()
	{
		n=num;
		while(n!=0)
		{
		rem=n%10;
		sum+=(rem*rem*rem);
		n=n/10;
		}
		if(num==sum)
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is non-armstrong number");
	}
	

	public static void main(String[] args) {
		Armstrong a=new Armstrong();
		a.inputnum();
		a.checknum();
		
	}

}
