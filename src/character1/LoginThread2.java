package character1;

import tools.LoginServlet;

public class LoginThread2 extends Thread{
	
	@Override
	public void run(){
		LoginServlet.doPost("a", "aa");
	}
}
