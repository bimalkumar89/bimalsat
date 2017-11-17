package Inheritance;

import java.util.ArrayList;

public class Arraylistexample {
	// can accept duplicates value
	//Array List ,Linked List ,vector - Implementing List Interface
	//Array has fixed size whereas arraylist can grow dynamincally
	//you can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<String>();
a.add("Bimal");
a.add("Hii");
System.out.println(a);
a.add(0,"Student");
System.out.println(a);
//a.remove(1);
//System.out.println(a);
//a.get(2);// pull the string present in index 2
System.out.println(a.get(2));
System.out.println(a.contains("Testing"));
System.out.println(a.indexOf("Bimal"));
System.out.println(a.isEmpty());
System.out.println(a.size());
	}

}
