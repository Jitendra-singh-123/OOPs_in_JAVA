class check{
	public int roll;
	check(int r){
		try {
		if(r>100) {
			throw new ArithmeticException("Roll>100 is allowed only");
		}
		}
		catch(ArithmeticException e){
			System.out.println("Please enter roll no above 100");
			}
	}
	
	


}
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check c=new check(120);
		System.out.println(c.roll);
	}

}
