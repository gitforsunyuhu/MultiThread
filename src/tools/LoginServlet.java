package tools;

public class LoginServlet {
	private static String usernameRef;
	private static String passwordRef;
	
	/**
	 * 如果没有加synchronized 关键字的话那么整个方法不是一个临界区，就会导致变量的不同步
	 * @param username
	 * @param password
	 */
	synchronized public static void doPost(String username, String password){
		
		usernameRef = username;
		if(username.equals("a")){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		passwordRef = password;
		System.out.println("username : " + usernameRef + " password: " + password);
	}
}
