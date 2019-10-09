package character1;

import tools.LoginServlet;

public class LoginThread1 extends Thread{
	
	@Override
	public void run(){
		LoginServlet.doPost("b", "bb");
	}
}
