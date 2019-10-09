package character1;

/**
 * 通过继承Thread类实现自己的线程
 * @author lenovo
 *
 */
public class Test{
	
	public static void main(String[] args){
		RandomOfThread mthread = new RandomOfThread();
		mthread.setName("myThread");
		mthread.start();
		for(int i=0; i< 10; i++){
			int time  = (int)(Math.random() * 1000);
			try {
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
