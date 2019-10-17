
package multiThreadExample1;

/**
 * 舞台的线程类，在这个舞台上将演绎 隋军和农民起义军 的战斗
 * 同时还包含了典型人物的战斗，演出结束
 * @author lenovo
 *
 */
public class Stage extends Thread {

	@Override
	public void run(){
		try {
			//进场打开帷幕
			System.out.println("大戏即将开始，小伙伴们做好准备！！");
			Thread.sleep(2000);
			
			//创建两个军队的线程
			ArmyThread suiArmy = new ArmyThread();
			ArmyThread farmArmy = new ArmyThread();
			
			Thread suiThread = new Thread(suiArmy, "隋军");
			Thread farmThread = new Thread(farmArmy, "农民起义军");
			
			// 两军开始相互进攻
			suiThread.start();
			farmThread.start();
			Thread.sleep(1000);
			
			//但是半路杀出一个程咬金
			System.out.println("半路杀出一个程咬金，两军都让开，音响舞台准备！新人物登场！！");
			
			//停止战斗命令
			suiArmy.keepRunning = false;
			farmArmy.keepRunning = false;
			//新建关键人物
			KeyPerson keyPerson = new KeyPerson();
			Thread chengYaojin = new Thread(keyPerson,"程咬金");
			while(true){
				if(!suiThread.isAlive() && !farmThread.isAlive()){
					System.out.println("程咬金开始战斗！！");
					
					chengYaojin.start();
					//加入join后主函数会等待chengYaojin这个线程结束之后才结束
					chengYaojin.join();
					
					System.out.println("大戏结束！！！");
					break;
				}
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) {
		new Stage().start();
	}
}
