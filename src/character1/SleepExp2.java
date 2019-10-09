package character1;

/**
 * 测试sleep()方法
 * @author lenovo
 *
 */
public class SleepExp2 extends Thread{
	@Override
	public void run(){
		try {
			System.out.println(this.currentThread().getName() + ":run begin==========" + System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println(this.currentThread().getName() + ":run end==========" + System.currentTimeMillis());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		SleepExp2 s = new SleepExp2();
		Thread t = new Thread(s);
		System.out.println("main begin==========" + System.currentTimeMillis());
		t.start();
		System.out.println("main end==========" + System.currentTimeMillis());
	}
}
