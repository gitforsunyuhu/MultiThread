package character1;

/**
 * 测试interrupt()方法，interrupted()方法，isInterrupted()方法
 * interrupt方法调用之后会使得进程进入阻塞状态
 * interrupted方法是静态方法，可以通过Thread类直接调用，作用是返回当前正在执行的线程是否阻塞，并且会将中断状态修改为false
 * isInterrupted方法是对象方法，作用是返回对象线程的阻塞情况，不会清除中断状态
 * @author lenovo
 *
 */
public class InterruptExp extends Thread{
	
	@Override
	public void run(){
		System.out.println("Interrupt Test 执行啦！！");
//		for(int i= 0;i<50000;i++){
//			System.out.println("Interrupt Test!" + (i+1));
//		}
	}
	
	public  static void main(String[] args){
		InterruptExp t1 = new InterruptExp();
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
//		Thread.currentThread().interrupt();
//		System.out.println("是否中断？  " + t1.interrupted());
//		System.out.println("是否中断？  " + t1.interrupted());
//		System.out.println(Thread.interrupted());
//		System.out.println(Thread.interrupted());//在interrupted()调用的过程中会清除中断状态，因此第二次调用的时候返回值是false
		System.out.println("当前状态"+t1.getState()+"  是否中断？  " + t1.isInterrupted());
		System.out.println("当前状态"+t1.getState()+"  是否中断？  " + t1.isInterrupted());
		
	}
	

}
