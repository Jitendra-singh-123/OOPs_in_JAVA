class Student{
	private String name;
	private String pass;
	public void setname(String n) {
		name=n;
	}
	public void setpass(String p) {
		if(p=="123456789")
			System.out.println("Welcome");
		else
			System.out.println("Invalid password");
	}
	public String  getpass() {
		return pass;
	}
	public String getname() {
		return name;
	}
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setname("Rahul");
		st.setpass("123456789");
		System.out.println(st.getname());
	}

}
