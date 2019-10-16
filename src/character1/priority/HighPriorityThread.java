package character1.priority;

import java.util.Random;

/**
 * 在这个实验中由于实验的次数很多，所以既可以体现了线程的规则性也可以体现线程的随机性
 * 如果将两个线程的优先级差距设置的很小，那么随机性将会更加明显
 * 如果将两个线程的优先级差距设置的很大，那么规则性将会更加明显
 * @author lenovo
 *
 */
public class HighPriorityThread extends Thread{
	
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
		System.out.println("△△△△△△△△△△△ high priority use time: " + (endTime -startTime));
	}
/*	
         ☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 316462
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 280561
	△△△△△△△△△△△ high priority use time: 88869
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 312457
	△△△△△△△△△△△ high priority use time: 189585
	△△△△△△△△△△△ high priority use time: 108833
	△△△△△△△△△△△ high priority use time: 172422
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 332757
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 305710
	△△△△△△△△△△△ high priority use time: 190829
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 317446
	△△△△△△△△△△△ high priority use time: 185359
	△△△△△△△△△△△ high priority use time: 225627
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 277026
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 276795
	△△△△△△△△△△△ high priority use time: 159281
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 333895
	△△△△△△△△△△△ high priority use time: 123964
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 342893
	☆☆☆☆☆☆☆☆☆☆☆ low priority use time: 343293
	△△△△△△△△△△△ high priority use time: 156306
	*/
}
