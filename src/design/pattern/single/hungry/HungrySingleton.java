package design.pattern.single.hungry;

/**
 * 饿汉式单例模式
 * 优点：性能高，执行效率高，没有任何锁
 * 缺点：如果有大量的饿汉式单例模式的话容易造成内存泄露或内存浪费
 * @author zhangzhl
 *
 */
public class HungrySingleton {
	
	private HungrySingleton() {};
	
	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	
	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
	

}
