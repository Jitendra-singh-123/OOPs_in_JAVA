class A{
	A(){
		System.out.println("This is class A constructor");
	}
	
	
}
class B extends A{
	B(){
		System.out.println("This is class B constructor");
	}
	
}
class C extends B{
	C(){
		System.out.println("This is class C constructor");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C b=new C();
		
		
	}

}
