package multiThreadExample2;

/**
 * 黑板实例：一次只能容纳一个学生在黑板上面写字
 * @author lenovo
 *
 */
public class Blackboard{
	
	private final Object lockObject = new Object();
	public void write(int i) {
		synchronized(lockObject){
			try {
				//开启板书
				System.out.println(Thread.currentThread().getName() + "正在写第[" + (i+1) +"]行板书");
				Thread.sleep(1000);
				lockObject.notifyAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
