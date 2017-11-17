package Inheritance;

public class Exceptiondemo {
 /*int a=4;
 //try catch mechanism
 int b=7;
 int c=0;
 int k=b/c;
 public void getdata()
 {
	 System.out.println(k);
 }*/
		

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int b=7;
	 int c=0;
	 try
	 {
		// purchase fail or popup fails 
		//int k =b/c;
		 int arr[]=new int[5];
		 System.out.println(arr[7]);
		 
		//System.out.println(k);
	 }
	 catch(ArithmeticException et)
	 {
		 System.out.println("Arithmetic Error Exception Occur");
	 }
	 catch(IndexOutOfBoundsException et)
	 {
		 System.out.println("Out of Bound  Error Exception Occur");
	 }
	 catch(Exception e)
	 {
		 System.out.println("Error Exception Occur");
	 }
	 finally
	 {
		 // This block is executed Irrespective of exception thrown or not
		 System.out.println("delete cookies");
		 
	 }
	 }
}
