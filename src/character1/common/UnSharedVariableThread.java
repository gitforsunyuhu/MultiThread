package character1.common;


/**
 * 测试线程是否共享变量
 * 此时各个线程之间是独立的
 * 没有共享的变量
 * @author lenovo
 *
 */
public class UnSharedVariableThread extends Thread{
	private int count = 5;
	
	public UnSharedVariableThread(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}
	
	@Override
	public void run(){
		while(count > 0){
			count --;
			System.out.println(" 由 " + this.currentThread().getName() + " 得到的count为：" + count);
		}
	}
	
	public static void main(String[] args){
		Thread t1 = new UnSharedVariableThread("A");
		Thread t2 = new UnSharedVariableThread("B");
		
		t1.start();
		t2.start();
	}

}
