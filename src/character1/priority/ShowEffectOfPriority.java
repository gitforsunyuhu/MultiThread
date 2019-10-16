package character1.priority;

public class ShowEffectOfPriority {
	public static void main(String[] args){
		for(int i=0;i<1000;i++){
			HighPriorityThread high = new HighPriorityThread();
			LowPriorityThread low = new LowPriorityThread();
			
			high.setPriority(9);
			low.setPriority(2);
			high.start();
			low.start();
		}
	}
}
