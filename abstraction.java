abstract class Bike{
	Bike(){
		System.out.println("This is Bike");
	}
	abstract void run();
	void fun() {
		System.out.println("This is Bike func");
	}
}

class Honda extends Bike{
	void run() {
		System.out.println("This is Honda");
	}
}



public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stubgp-
			Bike b=new Honda();
			b.run();
			b.fun();
	}

}
