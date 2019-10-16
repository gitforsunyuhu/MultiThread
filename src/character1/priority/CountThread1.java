package character1.priority;


/**
 * 用于CountPriority对于priority的测试
 * @author lenovo
 *
 */
public class CountThread1 extends Thread{
	private long count = 0;
	
	@Override
	public void run(){
		while(true){
			count = count+1;
		}
	}
	
	public long getCount(){
		return count;
	}

}
