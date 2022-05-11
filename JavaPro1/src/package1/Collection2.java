package package1;

import java.util.Iterator;
import java.util.Stack;

public class Collection2 {
	public static void main(String[] args) {
		Stack<String> stack= new Stack<String>();
		stack.push("Ajay");
		stack.push("deepak");
		stack.push("Ravi");
		stack.push("abc");
		stack.push("xyz");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
