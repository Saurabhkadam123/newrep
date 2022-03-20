//check alphabet is in lower case (a-z)(65-90) or upper case (A-Z)(97-122)
package ass_additional;

import java.util.Scanner;

public class Alphabet {
	Scanner s=new Scanner(System.in);
	
	char ch;
	void input()
	{
		System.out.println("enter the alphabet...");
		ch=s.next().charAt(0);
		
	}
	void check()
	{
		if(ch>=65&&ch<=90)
			System.out.println("UPPER CASE");
		else if(ch>=97&&ch<=122)
			System.out.println("LOWER CASE");
	}

	public static void main(String[] args) {
		Alphabet a=new Alphabet();
		a.input();
		a.check();
		
	}

}
