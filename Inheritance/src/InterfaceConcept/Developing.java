package InterfaceConcept;

public class Developing implements Interfaceconcept,InterfaceConcept1 {    // implements the Interface ,this class is responsible implement all method of Interceptconcept

	public static void main(String[] args) {
		Developing d =new Developing();  //d is responsible to call the all method of developing class
		d.checkingbalance();
		d.paycreditcard();
		d.transferbalance();
		d.login();
		d.investment();
Interfaceconcept dr=new Developing(); // dr is responsible to call the method of Interface called as Run time Polymorphism
dr.checkingbalance();
InterfaceConcept1 dr1=new Developing();
dr1.investment();
	}

@Override
public void paycreditcard() {
	// TODO Auto-generated method stub
	System.out.println("PaycrediCard Implemented");
	
}

@Override
public void transferbalance() {
	System.out.println("Transfer Balance Implemented");
	
}

@Override
public void checkingbalance() {
	System.out.println("Check Balance Implemented");
	
}

public void login() {  // Independent of Interface
	System.out.println("hiii");
}

@Override
public void investment() {
	System.out.println("Investment Implemented");
	
}
}
