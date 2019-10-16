package character1.priority;

import java.util.Random;

public class LowPriorityThread extends Thread{

	
	@Override
	public void run(){
		
		int number = 0;
		long startTime = System.currentTimeMillis();
		for(int i=0;i<500000;i++){
			for(int j = 0;j<10;j++){
				Random random = new Random();
				random.nextInt();
				number = (number + 1) +j*random.nextInt();
				number = j*j*random.nextInt();
				number = j*random.nextInt()+ j*j*j*random.nextInt();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆ low priority use time: " + (endTime -startTime));
	}
}
