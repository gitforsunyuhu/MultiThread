package character1.yieldFunction;

/**
 * yield方法是放弃当前的CPU资源，将他让给其他的任务去占用CPU执行时间，但是放弃的时间不确定
 * 可能刚刚放弃，马上又获得了CPU时间片
 * 实例可以在线程中获取时间，然后调用该方法，之后再获取时间看一下运行时间和不调用该方法之前的差距
 * @author lenovo
 *
 */
public class YieldExp extends Thread{
	
	@Override
	public void run(){
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for(int i=0;i<500000; i++){
			//Thread.yield();     endTime-beginTime:60
			//如果不加上面一句的话  endTime-beginTime:1
			count = count +1;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("endTime-beginTime:" + (endTime-beginTime));
	}

	public static void main(String[] args){
		YieldExp t = new YieldExp();
		t.start();
	}
}
