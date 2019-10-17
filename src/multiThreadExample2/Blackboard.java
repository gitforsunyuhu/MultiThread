package multiThreadExample2;

/**
 * 黑板实例：一次只能容纳一个学生在黑板上面写字
 * @author lenovo
 *
 */
public class Blackboard{
	
	public void write() {
		try {
			// 如果没有接受到命令那么军队就会持续攻击
			//开启10连击
			for(int i=0; i<10; i++){
				//执行进攻动作
				System.out.println(Thread.currentThread().getName() + "正在进攻第[" + (i+1) +"]次");
			}
			Thread.sleep(2000);
			//进攻结束了，鸣金收兵
			System.out.println(Thread.currentThread().getName() + "进攻结束！！！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
