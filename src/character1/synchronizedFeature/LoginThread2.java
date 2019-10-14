package character1.synchronizedFeature;

public class LoginThread2 extends Thread{
	
	@Override
	public void run(){
		LoginServlet.doPost("a", "aa");
	}
}
