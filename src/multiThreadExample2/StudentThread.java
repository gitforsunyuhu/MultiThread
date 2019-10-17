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
	
	@Override
	public void run() {
	}
}
