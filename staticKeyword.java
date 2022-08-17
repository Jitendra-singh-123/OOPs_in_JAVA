class students{
	int roll;
	static String college="IIT";
	students(int r){
		roll=r;
	}
	void change() {
		college="Graphic era";
	}
	void display() {
		System.out.println(roll+" "+college);
	}
	static void demo() {
		System.out.println("static method for invoking");
	}
	
}
public class staticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students st1=new students(16);
		st1.display();
		students st2=new students(20);
		st2.display();
		st2.change();
		st1.display();
		st2.display();
		students st3=new students(50);
		st3.display();
		students.demo();
	}

}
