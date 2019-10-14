package character1.stopAThread;

/**
 * 演示通过return来停止线程的实例
 * @author lenovo
 *
 */
public class UserReturn2Stop extends Thread{

	@Override
	public void run(){
		int i=0;
		while(true){
			//回顾一下之前的知识，如果使用的是interrupted方法则执行之后会将阻塞状态清除，因此后面输出的是false
			//如果使用的是isInterrupted方法
			if(this.interrupted()){
				System.out.println("停止了");
				System.out.println(this.isInterrupted());
				return;
			}
			System.out.println(System.currentTimeMillis());
		}
	}
	public static void main(String[] args){
		UserReturn2Stop t = new UserReturn2Stop();
		t.start();
		try {
			Thread.sleep(1000);
			t.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
