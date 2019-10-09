package character1;

/**
 * 通过继承Thread类实现自己的线程
 * @author lenovo
 *
 */
public class CreateByExtendsThreadClass extends Thread{
	
	@Override
	public void run(){
		super.run();
		System.out.println("这是第一个线程！！");
	}
	
	public static void main(String[] args){
		CreateByExtendsThreadClass mthread = new CreateByExtendsThreadClass();
		mthread.start();
		mthread.run();
		System.out.println("运行结束！！");
	}
}