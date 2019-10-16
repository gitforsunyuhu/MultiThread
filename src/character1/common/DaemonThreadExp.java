package character1.common;


/**
 * 演示守护线程的作用：个人理解的守护线程可以和守护进程对比，例如在Windows操作系统中
 * 守护进行就是我们通常的服务程序，就是后台默默为你服务的进程，相应的，守护线程就是默默
 * 守护着用户线程的运行，例如Java中的GC就是典型的守护线程，当用户线程都执行完了之后，GC也就不需要工作了
 * 守护线程也就退出了，一个线程可以通过  setDaemon(true)方法来将线程设置为守护线程
 * @author lenovo
 *
 */
public class DaemonThreadExp extends Thread{

	private long i = 0;
	@Override
	public void run(){
		while(true){
			i= i+1;
		}
	}
	public static void main(String[] args){
		try{
			//首先新建一个线程
			DaemonThreadExp t = new DaemonThreadExp();
			//将其设置为守护线程,这样当主线程结束之后，守护线程也会结束运行
			t.setDaemon(true);
			t.setName("守护线程");
			t.start();
			Thread.sleep(3000);
			//当输出这句话的时候，会发现t线程也会随之结束而不是无限循环
			System.out.println("主线程执行结束了，因此  " + t.getName()  + "也结束了！！！");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
