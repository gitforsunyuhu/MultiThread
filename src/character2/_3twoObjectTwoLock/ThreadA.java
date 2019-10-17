/**
 * 
 */
package character2._3twoObjectTwoLock;

/**
 * @author lenovo
 *
 */
public class ThreadA extends Thread{

	private HasSelfPrivateNum object;
	
	public ThreadA(HasSelfPrivateNum object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.addI("a");
	}
	
}
