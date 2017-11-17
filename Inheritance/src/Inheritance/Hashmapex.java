package Inheritance;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hashmap used to map key to value
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(0,"hi");
		hs.put(42, "bye");
		hs.put(5, "evening");
		System.out.println(hs.get(2));
		hs.remove(42);
		System.out.println(hs.get(42));
		Set sn=hs.entrySet();
		Iterator it=sn.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();//type cast with map.entry,separate key and value
			System.out.println(mp.getKey());  // to get the kay and value
			System.out.println(mp.getValue());
		}
	}

}
