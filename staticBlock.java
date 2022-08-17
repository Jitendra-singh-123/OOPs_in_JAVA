
public class staticBlock {
	static {
		System.out.println("first block is called first");
	}
	static {
		System.out.println("second block is called second");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("As class is loaded all static block will first execute then this main function will execute");
	}

	static {
		System.out.println("Third block is called third");
	}
}
