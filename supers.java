class animal{
	String color="white";
	animal(){
		System.out.println("This is parent class");
	}
	void run() {
		System.out.println("Animal is running");
	}
	
}
class  dog extends animal{
	String color="Black";
	dog(){
		super();
		System.out.println("This is base class");
		
	}
	void show() {
		System.out.println(color);
		System.out.println(super.color);
	}
	void run() {
		System.out.println("Dog is running");
	}
	void work() {
		super.run();
	}
	
}
public class super1 {
	//super used to refer immediate parent class instance variable,constructor,method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.show();
		d.run();
		d.work();
	}

}
