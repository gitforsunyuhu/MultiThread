package character1;

/**
 * 测试isAlive()函数的作用
 * @author lenovo
 *
 */
public class IsAliveExp extends Thread{

	public IsAliveExp(){
		System.out.println("Exp begin---------");
		System.out.println("Exp this.currentThread().getName():" + Thread.currentThread().getName());
		System.out.println("Exp this.currentThread().isAlive():" + Thread.currentThread().isAlive());
		System.out.println("Exp this.getName():" + this.getName());
		System.out.println("Exp this.isAlive():" + this.isAlive());
		System.out.println("Exp end---------");
	}
	@Override
	public void run(){
		System.out.println("run begin---------");
		System.out.println("run this.currentThread().getName():" + Thread.currentThread().getName());
		System.out.println("run this.currentThread().isAlive():" + Thread.currentThread().isAlive());
		System.out.println("run this.getName():" + this.getName());
		System.out.println("run this.isAlive():" + this.isAlive());
		System.out.println("run end---------");
	}
	public static void main(String[] args){
		IsAliveExp is = new IsAliveExp();
		Thread t = new Thread(is);
		t.setName("A");
		t.start();
		System.out.println("main getName:" + Thread.currentThread().getName());
		System.out.println("main isAlive:" + Thread.currentThread().isAlive());
	}
	
//	Exp begin---------
//	Exp this.currentThread().getName():main
//	Exp this.currentThread().isAlive():true
//	Exp this.getName():Thread-0
//	Exp this.isAlive():false
//	Exp end---------
//	main getName:main
//	main isAlive:true
//	run begin---------
//	run this.currentThread().getName():A
//	run this.currentThread().isAlive():true
//	run this.getName():A
//	run this.isAlive():true
//	run end---------
}
