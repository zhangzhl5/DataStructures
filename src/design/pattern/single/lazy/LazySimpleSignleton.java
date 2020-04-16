package design.pattern.single.lazy;

/**
 * 懒汉式单例模式
 * 优点：节省内存消耗
 * 缺点：线程不安全
 * 
 * @author zhangzhl
 *
 */
public class LazySimpleSignleton {
	
	private LazySimpleSignleton() {};
	
	private static LazySimpleSignleton lazySimpleSignleton;
	
	//synchronized 加锁保证同一时间只能有一个线程进入该方法
	public synchronized static LazySimpleSignleton getInstance() {
		if(lazySimpleSignleton == null ) {
			lazySimpleSignleton = new LazySimpleSignleton();
		} 
		return lazySimpleSignleton;
	}

}
