package package1;

public class TestConstructor {
	int id;
	String name;
	
	TestConstructor(int i, String s){
		 id= i;
		 name= s;
		
		
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		
		TestConstructor tc1= new TestConstructor(111, "Deepak");
		TestConstructor tc2= new TestConstructor(222, "Ashish");
		tc1.display();
		tc2.display();
			}
}
	
