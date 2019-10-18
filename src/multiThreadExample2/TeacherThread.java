package multiThreadExample2;

/**
 * 老师线程类，老师一开始就占据了黑板的资源
 * 只有让学生上去做题的时候才会释放资源
 * @author lenovo
 *
 */
public class TeacherThread implements Runnable{
	
	private Blackboard blackboard;
	//设置下课的标志
	volatile boolean keepRunning= true;
	//设置学生的标志
	volatile boolean keepWriting = true;
	
	public TeacherThread(Blackboard blackboard){
		this.blackboard = blackboard;
	}
	@Override
	public void run() {
		int count = 0;
		while(keepRunning){
			try {
				if(!keepWriting){
					System.out.println(Thread.currentThread().getName() + "进入等待状态！！");
					//让出当前的锁，让学生有机会获得黑板锁
					Thread.currentThread().wait();
				}else{
					System.out.println(Thread.currentThread().getName() +"在讲台上===");
					blackboard.write(count);
					count ++;
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
