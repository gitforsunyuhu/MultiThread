package character1.stopAThread;


/**
 * 测试stop()方法,使用stop停止线程是十分暴力的
 * @author lenovo
 *
 */
public class StopMethodExp1 extends Thread{
	
	@Override
	public void run(){
		super.run();
		try {
			int i=0;
			while(true){
				i ++;
				System.out.println("==="+ i + "===");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("在执行过程中被stop方法终止了！！");
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		StopMethodExp1 t = new StopMethodExp1();
		t.start();
		try{
			Thread.sleep(8000);
			t.stop();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
