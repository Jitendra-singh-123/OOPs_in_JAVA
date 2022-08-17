//Method overloading
//class demo{
//	void add(String n1,String n2) {
//		System.out.println(n1+n2);
//	}
//	void add(int n1,int n2,int n3) {
//		System.out.println(n1+n2+n3);
//	}
//}
//Method overriding
class demo{
	void hello() {
		System.out.println("This is hello of demo");
	}
}
class demo1 extends demo{
	void hello() {
		System.out.println("This is hello of demo1");
	}
}
public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d=new demo1();
		d.hello();
	}

}
