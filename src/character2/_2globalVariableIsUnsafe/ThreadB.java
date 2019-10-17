/**
 * 
 */
package character2._2globalVariableIsUnsafe;

/**
 * 用于测试线程的私有变量对于同步的影响
 * @author lenovo
 *
 */
public class ThreadB extends Thread{
	private HasSelfPrivateNum object;
	
	public ThreadB(HasSelfPrivateNum object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.addI("b");
	}
	
}
