
package multiThreadExample2;

/**
 * 教室的线程类，在教室里有很多个学生
 * 演示学生学习或者在黑板上写题的过程
 * @author lenovo
 *
 */
public class Classroom extends Thread {

	@Override
	public void run(){
		try {
			//进场打开帷幕
			System.out.println("开始上课！！");
			Thread.sleep(2000);
			
			//创建两个军队的线程
			StudentThread suiArmy = new StudentThread();
			StudentThread farmArmy = new StudentThread();
			
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
			Blackboard blackboard = new Blackboard();
			//Thread chengYaojin = new Thread(blackboard,"程咬金");
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
		new Classroom().start();
	}
}
