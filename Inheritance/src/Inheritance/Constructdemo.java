package Inheritance;

public class Constructdemo {
	//default constructor
public Constructdemo(){
	System.out.println("Constructor");
}// will not return valua and its name is same as class name
// paramaterized constructor

public Constructdemo(int a,int b)
{
	System.out.println("Parameterized Constructor");
}

public Constructdemo(String str)
{
	System.out.println(str);
}
public void method(){
	System.out.println("Method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructdemo g=new Constructdemo();//compiler will call implicit constructor if you have not defined constructor
		//whenever u creaate an object constructor will call
		//block of code whenever object is created
		Constructdemo h=new Constructdemo(4,5); 
		// executes parametrized constructor
		Constructdemo i=new Constructdemo("Hello"); // if no constructor defined ,then it will go default constructor
	}
	
	
	

}
