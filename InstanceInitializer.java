class A1{
	int a1;
	{
		System.out.println("Inside1 constructor");
	}
	A1(int x){
		a1=x;
		
	}
	{
		System.out.println("Inside2 construtor");
	}
	A1(){
		a1=10;
	}
	
}
public class IIB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		
	}

}
