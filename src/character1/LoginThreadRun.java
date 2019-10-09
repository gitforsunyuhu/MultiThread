package character1;

public class LoginThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginThread2 l2 = new LoginThread2();
		l2.start();
		
		LoginThread1 l1 = new LoginThread1();
		l1.start();

	}

}
