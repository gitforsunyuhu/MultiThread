package character3._1twoThreadTransData;

import java.util.ArrayList;

/**
 * @author lenovo
 *
 */
public class Run {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		ThreadA a = new ThreadA(list);
		ThreadB b = new ThreadB(list);
		
		b.start();
		a.start();
	}
	
	
// 为啥结果和书上的不一样呢?
//	b 在运行
//	添加了第1个元素！
//	添加了第2个元素！
//	添加了第3个元素！
//	添加了第4个元素！
//	添加了第5个元素！
//	添加了第6个元素！
//	添加了第7个元素！
//	添加了第8个元素！
//	添加了第9个元素！
//	添加了第10个元素！
	
}
