import java.util.Scanner;

public class Reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner scn=new Scanner(System.in); // scanner class is used to provide the input 
	//	String s=scn.next();
	//	System.out.println(s);
		String s="Madam hi",rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			//System.out.println(s.charAt(i));
			rev = rev + s.charAt(i);
				
		}
		System.out.println(rev);
		if (s.equals(rev))
		
			System.out.println("Palindrome");
		
		else
		
			System.out.println("Not Palindrome");	
		

}
}