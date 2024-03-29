##### 简介

通过上课的例子来将线程的一些函数的用法汇聚在一起。

##### 实例过程

三个类分别是①黑板②学生③课堂④老师，在这四个类中，课堂相当于是测试类：

​	当课堂线程开启后，启动老师线程并启动若干个学生线程；

​	老师开始板书其他的学生在听讲；

​	当老师让某个学生上去作业时，老师板书停止，学生获得板书的锁；

​	题目完成后，老师重新获得板书锁，学生释放锁；

​	之后课堂结束，老师和学生线程都停止了。

##### 主要知识点

1、两种创建线程的方法：继承Thread类或者实现Runnable接口；

2、使用volatile关键字，使得在其他线程中修改线程对象标志符，进而停止线程对象的执行；

3、使用join()方法，使得新线程加入之后，当前的线程会等待新线程执行完了之后再结束；

4、使用synchronized关键字，使得线程在操作某个共享实例的时候具有同步性；

