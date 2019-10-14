package character1.currentThread;

public class CurrentThreadFunction2 extends Thread{
	
	public CurrentThreadFunction2() {
		// TODO Auto-generated constructor stub
		System.out.println("========CurrentThread begins=========");
		System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
		System.out.println("this.getName(): " + this.getName());
		System.out.println("========CurrentThread ends=========");
	}
	@Override
	public void run(){
		System.out.println("========run begins=========");
		System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
		System.out.println("this.getName(): " + this.getName());
		System.out.println("========run ends=========");
	}
	
	public static void main(String[] args){
		CurrentThreadFunction2 ctf = new CurrentThreadFunction2();
		Thread t1= new Thread(ctf);
		t1.setName("aa");
		t1.start();
		//t1.run();
	}
	
}
