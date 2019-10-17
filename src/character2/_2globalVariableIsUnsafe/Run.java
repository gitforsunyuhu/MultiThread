package character2._2globalVariableIsUnsafe;

/**
 * 两个线程访问同一个对象的同步方法时候
 * 一定是线程安全的
 * @author lenovo
 *
 */
public class Run {

	public static void main(String[] args) {
		//新建一个对象
		HasSelfPrivateNum object1 = new HasSelfPrivateNum();
		//将对象分别传入到两个线程里面
		ThreadA a = new ThreadA(object1);
		ThreadB b = new ThreadB(object1);
		a.start();
		b.start();
	}
}
