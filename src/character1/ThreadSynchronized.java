package character1;

public class ThreadSynchronized extends Thread{

	private int count = 5;
	
	@Override
	synchronized public void run(){
		count --;
		System.out.println(" 由 " + this.currentThread().getName() + " 得到的count为：" + count);
	}
	
	public static void main(String[] args){
		ThreadSynchronized mythread = new ThreadSynchronized();
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
