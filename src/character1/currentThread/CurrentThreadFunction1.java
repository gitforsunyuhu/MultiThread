package character1.currentThread;

public class CurrentThreadFunction1 extends Thread{
	
	public CurrentThreadFunction1() {
		// TODO Auto-generated constructor stub
		System.out.println("构造方法的thread: " +this.currentThread().getName());
	}
	@Override
	public void run(){
		System.out.println("run()方法的thread: " +this.currentThread().getName());
	}
	
	public static void main(String[] args){
		//在构造函数里面中的this指的是主函数调用构造方法
		
		CurrentThreadFunction1 ctf = new CurrentThreadFunction1();
		//ctf.start();
		//而在主函数中直接调用run()函数的时候，并不是线程子集启动的run()函数，因此得到的名字还是main
		ctf.run();
	}
	
}
