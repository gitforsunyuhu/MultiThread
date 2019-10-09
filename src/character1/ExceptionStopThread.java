package character1;

/**
 * 通过异常来停止线程
 * @author lenovo
 *
 */
public class ExceptionStopThread extends Thread{
	
	@Override
	public void run(){
		System.out.println("thread begin!!!!");
		try {
			for(int i=0;i<50000;i++){
				if(this.interrupted()){
					System.out.println("我要退出了！！！");
					throw new InterruptedException();
				}
				System.out.println((i+1));
			}
			System.out.println("thread end!!!!");
		}catch (InterruptedException e) {
			System.out.println(this.isInterrupted());
			System.out.println("我将异常扔给了 main ");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){
		ExceptionStopThread thread = new ExceptionStopThread();
		try {
			thread.start();
			Thread.sleep(10);          //如果设置的时间很长的话，主线程还没执行到下一步，thread线程就已经执行完了，这个时候看不到效果的
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("我是main，我接到了异常！！！！！");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


//以下代码在跳出循环之后并没有停止，还是会执行for循环之后的语句的。
//public class ExceptionStopThread extends Thread{
//	
//	@Override
//	public void run(){
//		System.out.println("thread begin!!!!");
//		for(int i=0;i<50000;i++){
//			if(this.interrupted()){
//				System.out.println("我要退出了！！！");
//				break;
//			}
//			System.out.println((i+1));
//		}
//		System.out.println("thread end!!!!，但是实际上我并没有停止！！！");
//	}
//	public static void main(String[] args){
//		ExceptionStopThread thread = new ExceptionStopThread();
//		try {
//			thread.start();
//			Thread.sleep(10);          //如果设置的时间很长的话，主线程还没执行到下一步，thread线程就已经执行完了，这个时候看不到效果的
//			thread.interrupt();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
