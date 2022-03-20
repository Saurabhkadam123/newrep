//Java Program to Check Whether the Character is Vowel or Consonant
package ass_additional;
import java.util.Scanner;
public class Vowelconsonant {
	Scanner sc=new Scanner(System.in);
	char ch;
			
	void inchar()
	{
		System.out.println("enter the character...");
		ch=sc.next().charAt(0);
	}
	void check()
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println(ch+" is vowel");
		else
			System.out.println(ch+" is consonant");
			
	}

	public static void main(String[] args) {
		Vowelconsonant v=new Vowelconsonant();
		v.inchar();
		v.check();

	}

}
