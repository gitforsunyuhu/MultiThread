package character1.synchronizedFeature;

public class LoginThread1 extends Thread{
	
	@Override
	public void run(){
		LoginServlet.doPost("b", "bb");
	}
}
