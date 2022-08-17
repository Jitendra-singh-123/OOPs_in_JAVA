
public class Exception3 {
	//unchecked
	static void A() {
		B();
	
	}
	static void B() {
		try {
		C();
		}
		catch(ArithmeticException e) {
			System.out.println("Handeled  unchecked");
		}
	}
	static void C() {
		int a=10/0;
	}
	
	
	
	
	//checked
	static void demo1() throws IllegalAccessException{
		demo();
	}

	static void demo() throws IllegalAccessException {
		throw new IllegalAccessException("To propogate Checked exception uses throws keyword");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A();
	try {
		demo1();
	}
	catch(Exception e) {
		System.out.println("Handled checked");
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	
	}
}
