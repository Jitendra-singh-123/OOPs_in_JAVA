class copycons{
	int x;
	//constructor overload
	copycons(int a){
		x=a;
	}
	
	copycons(copycons i){
		x=i.x;
	}
	copycons(){
		
	}
	void display() {
		System.out.println(x);
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copycons c=new copycons(10);
		c.display();
		copycons c1=new copycons(c);
		c1.display();
		
		
		
		copycons c2=new copycons();
		c2.x=c1.x;
		c2.display();
	}

}
