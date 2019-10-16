package character1.resumeAndsuspend;


/**
 * 该类测试suspend方法和resume方法
 * @author lenovo
 *
 */
public class ResumeAndSuspendFunc extends Thread{
	
	private long i =0;
	public long getI(){
		return i;
	}
	@Override
	public void run(){
		while(true){
			i = i+1;
		}
	}
	public static void main(String[] args){
		ResumeAndSuspendFunc t = new ResumeAndSuspendFunc();
		t.start();
		System.out.println("当前时间："+System.currentTimeMillis() + "   i="+t.getI());
		try {
			t.suspend();
			System.out.println("当前时间："+System.currentTimeMillis() + "   i="+t.getI());
			Thread.sleep(5000);
			System.out.println("当前时间："+System.currentTimeMillis() + "   i="+t.getI());
			t.resume();
			
			//让其执行一会儿
			Thread.sleep(5000);
			
			t.suspend();
			System.out.println("当前时间："+System.currentTimeMillis() + "   i="+t.getI());
			Thread.sleep(5000);
			System.out.println("当前时间："+System.currentTimeMillis() + "   i="+t.getI());
			t.resume();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//让其执行一会儿
		
	}

}
