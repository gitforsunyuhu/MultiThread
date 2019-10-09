package character1;

/**
 * 测试sleep()方法
 * @author lenovo
 *
 */
public class SleepExp1 extends Thread{
	@Override
	public void run(){
		try {
			System.out.println(this.currentThread().getName() + ":run begin==========");
			Thread.sleep(2000);
			System.out.println(this.currentThread().getName() + ":run end==========");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		SleepExp1 s = new SleepExp1();
		//在主线程停了两秒
		System.out.println("main begin==========" + System.currentTimeMillis());
		s.run();
		System.out.println("main end==========" + System.currentTimeMillis());
	}
}
