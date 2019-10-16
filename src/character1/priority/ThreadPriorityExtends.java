package character1.priority;


/**
 * 这个类验证了在Java中线程的优先级是可以继承的，在A线程中如果调用了B线程，那么B线程也会拥有和A同样的优先级
 * @author lenovo
 *
 */
public class ThreadPriorityExtends extends Thread{
	@Override
	public void run(){
		System.out.println(this.getName() + ":"+ this.getPriority());
		Thread t1 = new ThreadPriorityExtends2();
		t1.setName("aaa");
		t1.start();
	}
	
	public static void main(String[] args){
		ThreadPriorityExtends t = new ThreadPriorityExtends();
		//t.setPriority(3);  如注释了之后，那么不过是a线程还是aaa线程的优先级都是5
		t.setName("a");
		t.start();
		
	}
}
