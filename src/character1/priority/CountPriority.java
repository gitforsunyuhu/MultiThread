package character1.priority;


/**
 * 这个类测试CountThread1和CountThread2两个线程谁计算的更快速一些
 * 这样来体现线程优先级的作用
 */
public class CountPriority {
	
	public static void main(String[] args){
		CountThread1 ct1 = new CountThread1();
		CountThread2 ct2 = new CountThread2();
		try {
		//设置不同的优先级
		ct1.setPriority(Thread.NORM_PRIORITY -3);
		ct2.setPriority(Thread.NORM_PRIORITY +3);
		ct1.start();
		ct2.start();
		Thread.sleep(2000);
		System.out.println(ct1.getCount());
		System.out.println(ct2.getCount());
		ct1.suspend();
		ct2.suspend();
		
		Thread.sleep(2000);
		
		ct1.resume();
		ct2.resume();
		
		System.out.println(ct1.getCount());
		System.out.println(ct2.getCount());
		//强制停止
		ct1.stop();
		ct2.stop();
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/*
953607902
1006283152
953845376
1006377615
*/