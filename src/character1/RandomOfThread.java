package character1;

/*
 * 线程执行的随机性
 * 
 */
public class RandomOfThread extends Thread{
	
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			int time  = (int)(Math.random() * 1000);
			try {
				Thread.sleep(time);
				System.out.println("run=" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}	
	
		//main=main
		//main=main
		//run=myThread
		//run=myThread
		//run=myThread
		//main=main
		//run=myThread
		//run=myThread
		//main=main
		//run=myThread
		//main=main
		//main=main
		//run=myThread
		//main=main
		//run=myThread
		//main=main
		//main=main
		//run=myThread
		//run=myThread
		//main=main
		//某次输出的结果
	public static void main(String[] args){
		RandomOfThread mthread = new RandomOfThread();
		mthread.setName("myThread");
		mthread.start();
		for(int i=0; i< 10; i++){
			int time  = (int)(Math.random() * 1000);
			try {
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
