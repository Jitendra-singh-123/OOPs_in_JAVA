
public class Exeception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		int a=10/0;
		
		}
		catch(ArithmeticException e) {
			System.out.println("Error is handeled");
			}
		finally {
			System.out.println("Always run");
		}
		
		
		System.out.println("Below exception");
		System.out.println("Below program");
	}

}
