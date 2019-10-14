package character1.common;

public class PrintlnThreadSafe extends Thread{
	
	private int count = 5;
	
	/**
	 * 如果不加synchronized关键字，虽然println的实现是同步的，但是count--是在执行该方法之前就已经完成了的
	 * 因此还是需要在方法前加上synchronized关键字
	 */
	@Override
	synchronized public void run(){
		System.out.println(this.currentThread().getName() + " count :" + count--);
	}

	public static void main(String[] args){
		PrintlnThreadSafe pt = new PrintlnThreadSafe();
		Thread t1= new Thread(pt,"a");
		Thread t2= new Thread(pt,"b");
		Thread t3= new Thread(pt,"c");
		Thread t4= new Thread(pt,"d");
		Thread t5= new Thread(pt,"e");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
