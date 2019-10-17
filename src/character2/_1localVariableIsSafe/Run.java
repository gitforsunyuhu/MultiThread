package character2._1localVariableIsSafe;

/**
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
