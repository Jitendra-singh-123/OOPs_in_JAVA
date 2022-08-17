class demo11 extends Thread{
	public void run() {
		for(int i=1;i<15;i++) {
			try{Thread.sleep(5000);}
			catch(Exception e){System.out.println(e);}    
			System.out.println(i);
		
	}
}
}
public class threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo11 d=new demo11();
		d.start();
		demo11 d1=new demo11();
		d1.start();
	}

}
