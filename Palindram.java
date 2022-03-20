package ass_additional;
import java.util.*;

public class Palindram {
	Scanner s=new Scanner(System.in);
	
	
	void palindromcheck()
	{
		System.out.println("enter the string to check palindram or not");
		String str=s.next();
		String c= "";
		str=str.toLowerCase();
		
		int j=str.length()-1;
		
		for (int i=j ; i>=0 ; i--)
		{
			c= c + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(c))
			System.out.println(str+" is an palindram string");
		else
			System.out.println(str+" is an non-palindram string");
		
	}

	public static void main(String[] args) {
		
		Palindram p=new Palindram();
		p.palindromcheck();
				
	
	}

}
