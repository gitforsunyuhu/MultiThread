package character1;


/**
 * 从sleep状态停止某一个线程
 * @author lenovo
 *
 */
public class Sleep2Interrupted extends Thread{
	@Override
	public void run(){
		System.out.println("thread begin!!!!");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			System.out.println("我是thread，我在睡眠时候中断了！！！！！" + this.interrupted());
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("thread end!!!!");
	}
	public static void main(String[] args){
		Sleep2Interrupted thread = new Sleep2Interrupted();
		try {
			thread.start();
			Thread.sleep(10);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("我是main，我接到了异常！！！！！");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
