/**
 * 
 */
package character3._1twoThreadTransData;

import java.util.List;

import character2._3twoObjectTwoLock.HasSelfPrivateNum;

/**
 * 用于检测是否加到了五个元素
 * @author lenovo
 *
 */
public class ThreadB extends Thread{
	private List list;
	
	public ThreadB(List list){
		super();
		this.list = list;
	}
	
	@Override
	public void run(){
		super.run();
		System.out.println("b 在运行");
		while(true){
			if(list.size() == 5){
				System.out.println("== 5 了，线程b要退出了!!");
				try {
					throw new InterruptedException();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
