package character1;

public class CreateByImplementsRunnable implements Runnable {
	int i;
	
	public CreateByImplementsRunnable(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("这个是通过实现Runnable 接口创建的线程"+i+":" + Thread.currentThread().getName());
	}

	//这就表明线程是随机的
	public static void main(String[] args){
		CreateByImplementsRunnable mythread1 = new CreateByImplementsRunnable(1);
		CreateByImplementsRunnable mythread2 = new CreateByImplementsRunnable(2);
		CreateByImplementsRunnable mythread3 = new CreateByImplementsRunnable(3);
		CreateByImplementsRunnable mythread4 = new CreateByImplementsRunnable(4);
		CreateByImplementsRunnable mythread5 = new CreateByImplementsRunnable(5);
		CreateByImplementsRunnable mythread6 = new CreateByImplementsRunnable(6);
		CreateByImplementsRunnable mythread7 = new CreateByImplementsRunnable(7);
		CreateByImplementsRunnable mythread8 = new CreateByImplementsRunnable(8);
		CreateByImplementsRunnable mythread9 = new CreateByImplementsRunnable(9);
		Thread thread1  = new Thread(mythread1);
		Thread thread2  = new Thread(mythread2);
		Thread thread3  = new Thread(mythread3);
		Thread thread4  = new Thread(mythread4);
		Thread thread5  = new Thread(mythread5);
		Thread thread6  = new Thread(mythread6);
		Thread thread7  = new Thread(mythread7);
		Thread thread8  = new Thread(mythread8);
		Thread thread9  = new Thread(mythread9);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		
	}
}
