package multiThreadExample1;

/**
 * 军队线程：军队可以进行五连击，如果该线程可能会创建多个实例
 * 最好是用实现Runnable接口的方法来创建线程
 * @author lenovo
 *
 */
public class ArmyThread implements Runnable {

	//通过volatile关键字使得在其他线程中修改了
	//该变量之后，可以将线程得到停止
	volatile boolean keepRunning = true; 
	
	@Override
	public void run() {
		try {
			// 如果没有接受到命令那么军队就会持续攻击
			while(keepRunning){
				//开启五连击
				for(int i=0; i<5; i++){
					//执行进攻动作
					System.out.println(Thread.currentThread().getName() + "正在进攻第[" + (i+1) +"]次");
					Thread.sleep(1000);
					//每次攻击之后下一次攻击还不知道是哪一队
					Thread.yield();
				}
			}
			//进攻结束了，鸣金收兵
			System.out.println(Thread.currentThread().getName() + "进攻结束！！！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
