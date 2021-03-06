package design.pattern.single.threadlocal;

/**
 * 
 * @author zhangzhl
 *
 */
public class ThreadLocalSingleton {
	
	private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
		@Override
		protected ThreadLocalSingleton initialValue() {
			return new ThreadLocalSingleton();
		}
	};

	private ThreadLocalSingleton() {}

	public static ThreadLocalSingleton getInstance() {
		return threadLocalInstance.get();
	}
}
