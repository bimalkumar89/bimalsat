package Inheritance;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("USA");
hs.add("UK");
hs.add("UK");
hs.add("he");

System.out.println(hs);
//System.out.println(hs.remove("UK"));
System.out.println(hs.isEmpty());
System.out.println(hs.size());

Iterator<String> i=hs.iterator();
while(i.hasNext()){
	System.out.println(i.next());
}

	}

}
