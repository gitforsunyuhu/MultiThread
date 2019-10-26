
package character2._4synchronizedMethodLockObject;

/**
 * @author lenovo
 *
 */
public class MyObject {
	public void methodA(){
		try{
			System.out.println("begin methodA threadName: "
					+ Thread.currentThread().getName());
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

	}
}
