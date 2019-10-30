/**
 * 
 */
package character3._1twoThreadTransData;

import java.util.List;

/**
 * 第一个线程用于向列表中添加元素
 * @author lenovo
 *
 */
public class ThreadA extends Thread{
	private List list;
	
	public ThreadA(List list){
		super();
		this.list = list;
	}
	
	@Override
	public void run(){
		super.run();
		for(int i=0;i< 10;i++){
			list.add("学习使我快乐！！");
			System.out.println("添加了第" + (i+1) + "个元素！");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
