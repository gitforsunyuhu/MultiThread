package character1.resumeAndsuspend;


/**
 * 如果suspend方法和resume方法使用不当容易造成独占锁
 * @author lenovo
 *
 */
public class ResumeAndSuspendLockStop extends Thread{
	
	private long i =0;
	public long getI(){
		return i;
	}
	@Override
	public void run(){
		while(true){
			i = i+1;
			//System.out.println("i="+i);
			//如果加上上面这句话，由于println方法内部是同步的，因此当该线程suspend的时候，print的锁得不到释放
			//在main函数中的println就得不到执行
		}
	}
	
	public static void main(String[] args){
		ResumeAndSuspendLockStop t = new ResumeAndSuspendLockStop();
		t.start();
		try {
			Thread.sleep(1000);
			t.suspend();
			System.out.println("main end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//让其执行一会儿
		
	}
}
