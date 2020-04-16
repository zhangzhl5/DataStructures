package design.pattern.single.lazy;

/**
 * 懒汉式双重检查单列模式 优点提高效率
 * 
 * @author zhangzhl
 *
 */
public class LazyDoubleCheckSignleton {

	private LazyDoubleCheckSignleton() {};

	private static LazyDoubleCheckSignleton lazyDoubleCheckSignleton;

	// synchronized 加锁保证只有对象没有被初始化时才进行初始化，之后的线程拿到初始化的引用直接返回
	public  static LazyDoubleCheckSignleton getInstance() {
		if(lazyDoubleCheckSignleton == null ) {
			synchronized(LazyDoubleCheckSignleton.class) {
				if(lazyDoubleCheckSignleton == null ) {
					lazyDoubleCheckSignleton = new LazyDoubleCheckSignleton();
				}
			}
		} 
		return lazyDoubleCheckSignleton;
	}

}
