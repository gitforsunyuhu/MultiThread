package character1.resumeAndsuspend;

/**
 * 使用suspend和resume容易引起数据不一致的现象
 * @author lenovo
 *
 */
public class ResumeAndSuspendNoSameValue {
	
	public static void main(String[] args){
		//新建一个MyObject类对象
		MyObject myobject = new MyObject();
		
		//新建一个线程，让其执行MyObject的setString方法
		Thread t1 = new Thread(){
			@Override
			public void run(){
				myobject.setString("1", "111");
			}
		};
		t1.setName("a");
		t1.start();
		//中间间隔2秒使得一定会执行到“暂停阶段”
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//再次新建一个线程，让其执行MyObject的printString方法
		//此时t1还没有将password修改过来，这个时候读取的时候就会出错
		Thread t2 = new Thread(){
			@Override
			public void run(){
				myobject.printString();
			};
		};
		t2.start();
	}

}

//如果将两个方法前面都加上synchronized关键字，那么这个程序将永久运行，因为没有唤醒a线程得方法
class MyObject{
	private String username= "a";
	private String password="aa";
	public void setString(String username, String password){
		this.username = username;
		//通过在此设置暂停，使得数据设置执行到一半
		try{
			Thread.sleep(500);
			if(Thread.currentThread().getName().equals("a"))
			{
				System.out.println("停止a线程");
				Thread.currentThread().suspend();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		this.password =password;
	}
	public void printString() {
		System.out.println(username + "   " + password);
	}
}