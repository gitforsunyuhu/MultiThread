
package multiThreadExample2;

/**
 * 教室的线程类，在教室里有很多个学生
 * 演示学生学习或者在黑板上写题的过程
 * @author lenovo
 *
 */
public class Classroom{
	
	public static void main(String[] args){
		
		Blackboard blackboard = new Blackboard();
		
		try {
			//开始上课，教室渐渐安静下来
			System.out.println("开始上课，教室渐渐安静下来===");
			Thread.sleep(1000);
			
			//新建一个老师线程，开始板书上课
			TeacherThread teacherRun = new TeacherThread(blackboard);
			Thread teacherThread = new Thread(teacherRun, "美女老师");
			teacherThread.start();
			
			//新建10个学生线程，小班授课
			StudentThread stuRunnable1 = new StudentThread(blackboard);
			Thread stuThread1 = new Thread(stuRunnable1, "小明同学");
			StudentThread stuRunnable2 = new StudentThread(blackboard);
			Thread stuThread2 = new Thread(stuRunnable2, "小丽同学");
			StudentThread stuRunnable3 = new StudentThread(blackboard);
			Thread stuThread3 = new Thread(stuRunnable3, "小刚同学");
			StudentThread stuRunnable4 = new StudentThread(blackboard);
			Thread stuThread4 = new Thread(stuRunnable4, "小红同学");
//			StudentThread stuRunnable5 = new StudentThread(blackboard);
//			Thread stuThread5 = new Thread(stuRunnable5, "张三同学");
//			StudentThread stuRunnable6 = new StudentThread(blackboard);
//			Thread stuThread6 = new Thread(stuRunnable6, "李四同学");
//			StudentThread stuRunnable7 = new StudentThread(blackboard);
//			Thread stuThread7 = new Thread(stuRunnable7, "王二同学");
//			StudentThread stuRunnable10 = new StudentThread(blackboard);
//			Thread stuThread8 = new Thread(stuRunnable10, "铁蛋同学");
//			StudentThread stuRunnable8 = new StudentThread(blackboard);
//			Thread stuThread9 = new Thread(stuRunnable8, "钢蛋同学");
//			StudentThread stuRunnable9 = new StudentThread(blackboard);
//			Thread stuThread10 = new Thread(stuRunnable9, "皮蛋同学");
			
			stuThread1.start();
			stuThread2.start();
			stuThread3.start();
			stuThread4.start();
//			stuThread5.start();
//			stuThread6.start();
//			stuThread7.start();
//			stuThread8.start();
//			stuThread9.start();
//			stuThread10.start();
			//这样的话学生结束之后主线程才结束
//			stuThread1.join();
//			stuThread2.join();
//			stuThread3.join();
//			stuThread4.join();
//			stuThread5.join();
//			stuThread6.join();
//			stuThread7.join();
//			stuThread8.join();
//			stuThread9.join();
//			stuThread10.join();
			
			//五分钟之后
			Thread.sleep(2000);
			System.out.println("老师要找人上去做题喽，同学们心惊胆战！！");
			
			stuRunnable3.keepSitting = false;
			teacherRun.keepWriting = false;
			
			Thread.sleep(500);
			
			stuRunnable3.keepSitting = true;
			teacherRun.keepWriting = true;
			
			Thread.sleep(4000);
			
			teacherRun.keepRunning = false;
			stuRunnable1.keepRunning = false;
			stuRunnable2.keepRunning = false;
			stuRunnable3.keepRunning = false;
			stuRunnable4.keepRunning = false;

			stuThread1.join();
			stuThread2.join();
			stuThread3.join();
			stuThread4.join();
			
			System.out.println("下课啦！！开心！！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
