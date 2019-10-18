package multiThreadExample2;

/**
 * 学生线程：学生可以自己做作业，也可以使用黑板
 * 如果该线程可能会创建多个实例
 * 最好是用实现Runnable接口的方法来创建线程
 * @author lenovo
 *
 */
public class StudentThread implements Runnable {

	//通过volatile关键字使得在其他线程中修改了
	//该变量之后，可以将线程得到停止
	volatile boolean keepRunning = true; 
	
	//如果改为了false说明被交上去做题了
	volatile boolean keepSitting = true; 
	
	private Blackboard blackboard;
	
	public StudentThread(Blackboard blackboard){
		this.blackboard = blackboard;
	}
	
	@Override
	public void run() {
		while(keepRunning){
			System.out.println("==="+Thread.currentThread().getName() + "正在认真听讲===");
			try {
				Thread.sleep(1000);
				if(!keepSitting){
					System.out.println("===" + Thread.currentThread().getName() + "走向黑板===");
					for(int i=0;i<3;i++){
						blackboard.write(i);
					}
					System.out.println("===" + Thread.currentThread().getName() + "从黑板下来了===");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
