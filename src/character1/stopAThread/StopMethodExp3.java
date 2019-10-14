package character1.stopAThread;

/**
 * 测试stop()导致数据不一致的情况
 * 这个方法目前已经作废了，原因如下：
 * 1、因为如果强制让线程停止则有可能使得一些清理性的工作得不到完成
 * 2、对锁定的对象进行了“解锁”，导致数据得不到同步的处理，出现数据不一致的情况
 * @author lenovo
 *
 */
public class StopMethodExp3 extends Thread{
	
	private StopMethodTestObject object;
	
	public StopMethodExp3(StopMethodTestObject object) {
		// TODO Auto-generated constructor stub
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.printString("b", "bb");
	}

	public static void main(String[] args){
		try {
			StopMethodTestObject smt = new StopMethodTestObject();
			StopMethodExp3 a = new StopMethodExp3(smt);
			a.start();
			Thread.sleep(500);
			a.stop();
			System.out.println(smt.getUsername() + ":" + smt.getPassword()) ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
