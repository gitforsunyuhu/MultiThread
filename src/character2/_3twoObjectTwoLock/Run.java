package character2._3twoObjectTwoLock;

/**
 * 两个线程访问两个对象时相互之间不会受到干扰,synchronized关键字取得是锁是对象锁
 * 并不是某一段代码或者方法，因此当访问不同的对象的时候不加synchronized关键字结果是一样的
 * 一定是线程安全的
 * @author lenovo
 *
 */
public class Run {

	public static void main(String[] args) {
		//新建两个对象
		HasSelfPrivateNum object1 = new HasSelfPrivateNum();
		HasSelfPrivateNum object2 = new HasSelfPrivateNum();
		//将对象分别传入到两个线程里面
		ThreadA a = new ThreadA(object1);
		ThreadB b = new ThreadB(object2);
		a.start();
		b.start();
	}
}

/*
a set over!  
b set over!  
b num: 200
a num: 100
*/