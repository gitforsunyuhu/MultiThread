package character1.resumeAndsuspend;

/**
 * 用于同步的类
 * @author lenovo
 *
 */
public class SynchronizedObject {
	synchronized public void printString(){
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("a 线程永远suspend 了");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
