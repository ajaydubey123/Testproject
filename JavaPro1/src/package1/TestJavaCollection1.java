package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1 {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Ajay");
		list.add("Sumit");
		list.add("Deepak");
		list.add("ankit");
		
		//System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
