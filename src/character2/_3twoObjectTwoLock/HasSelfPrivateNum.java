package character2._3twoObjectTwoLock;


/**
 * 用于测试多线程中，方法内部的变量如果是私有的，那么则是线程安全的
 * @author lenovo
 *
 */
public class HasSelfPrivateNum {
	
	//如果在这里写的话，那么num不是方法内部的私有变量了
	//而是类的成员属性，这样是非线程安全的
	private int num = 0;
	
	public void addI(String username){
		try{
			//当变量是方法内的私有变量时，这个时候是不存在线程不安全的情况的
			//int num = 0;
			if(username.equals("a")){
				num = 100;
				System.out.println("a set over!  ");
				Thread.sleep(10);
			}else{
				num = 200;
				System.out.println("b set over!  ");
			}
			System.out.println(username  + " num: " + num);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

/*
b set over!  
a set over!  
b num: 200
a num: 200
 */
