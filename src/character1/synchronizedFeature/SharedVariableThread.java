package character1.synchronizedFeature;


/**
 * 测试线程是否共享变量
 * 在新建线程的时候传入的是同一个对象
 * 因此他们是可以共享变量的
 *
 * @author lenovo
 *
 */
public class SharedVariableThread extends Thread{
	private int count = 5;
	
	@Override
	public void run(){
		count --;
		System.out.println(" 由 " + this.currentThread().getName() + " 得到的count为：" + count);
	}
	
	public static void main(String[] args){
		SharedVariableThread mythread = new SharedVariableThread();
		Thread t1 = new Thread(mythread,"A");
		Thread t2 = new Thread(mythread,"B");
		Thread t3 = new Thread(mythread,"C");
		Thread t4 = new Thread(mythread,"D");
		Thread t5 = new Thread(mythread,"E");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
