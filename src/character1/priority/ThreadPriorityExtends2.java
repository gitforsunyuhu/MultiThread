package character1.priority;

public class ThreadPriorityExtends2 extends Thread{
	@Override
	public void run(){
		System.out.println(this.getName() + ":"+ this.getPriority());
	}
}
