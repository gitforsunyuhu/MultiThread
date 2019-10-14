package character1.common;

/**
 * 测试多线程中的getId方法，这个方法是获取线程的标志符
 * @author lenovo
 *
 */
public class GetIdExp extends Thread{

	@Override
	public void run(){
		System.out.println("NNNNNN");
	}
	
	public  static void main(String[] args){
		Thread t = new Thread();
		GetIdExp t1 = new GetIdExp();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		t3.start();
		t1.start();
		System.out.print("当前线程名称:" + t1.getName());
		System.out.println("当前线程id:" + t1.getId());
		System.out.print("当前线程名称:" + t3.getName());
		System.out.println("当前线程id:" + t3.getId());
		//如果想要获得主线程
		Thread maint = Thread.currentThread();
		System.out.println(maint.getId() + ";" + maint.getName());
	}
}
