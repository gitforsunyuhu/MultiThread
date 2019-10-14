package character1.stopAThread;


/**
 * 测试stop()方法
 * 调用stop方法会抛出java.lang.ThreadDeath异常但是这个异常通常不需要显示的捕捉
 * 例如：
 * @Override
 *	public void run(){
 *		super.run();
 *		this.stop();
 *	}
 *
 * 这句话就不会报错！这个方法目前已经作废了，原因如下：
 * 1、因为如果强制让线程停止则有可能使得一些清理性的工作得不到完成
 * 2、对锁定的对象进行了“解锁”，导致数据得不到同步的处理，出现数据不一致的情况
 * @author lenovo
 *
 */
public class StopMethodExp2 extends Thread{
	
	@Override
	public void run(){
		super.run();
		try{
			this.stop();
		}catch(ThreadDeath e){
			System.out.println("进入catch方法");
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		StopMethodExp2 t = new StopMethodExp2();
		t.start();
	}
}
