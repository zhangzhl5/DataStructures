package design.pattern.single.seriable;

import java.io.Serializable;

//反序列化时导致单例破坏
public class SeriableSingleton implements Serializable {

	/**
	 * serialVersionUID适用于java序列化机制。
	 * 简单来说，JAVA序列化的机制是通过判断类的serialVersionUID来验证的版本一致的。
	 * 在进行反序列化时，JVM会把传来的字节流中的serialVersionUID于本地相应实体类的serialVersionUID进行比较。
	 * 如果相同说明是一致的，可以进行反序列化，否则会出现反序列化版本一致的异常，即是InvalidCastException。
	 * 具体序列化的过程是这样的：
	 * 序列化操作时会把系统当前类的serialVersionUID写入到序列化文件中，
	 * 当反序列化时系统会自动检测文件中的serialVersionUID，判断它是否与当前类中的serialVersionUID一致。
	 * 如果一致说明序列化文件的版本与当前类的版本是一样的，可以反序列化成功，否则就失败；
	 */
	private static final long serialVersionUID = -5145410590055765457L;

	// 序列化就是说把内存中的状态通过转换成字节码的形式
	// 从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
	// 内存中状态给永久保存下来了

	// 反序列化
	// 讲已经持久化的字节码内容，转换为IO流
	// 通过IO流的读取，进而将读取的内容转换为Java对象
	// 在转换过程中会重新创建对象new
	public final static SeriableSingleton INSTANCE = new SeriableSingleton();

	private SeriableSingleton() {
	}

	public static SeriableSingleton getInstance() {
		return INSTANCE;
	}

	// ObjectInputStream 中有判断是否hasReadResolveMethod()如果有就会返回该结果的值，是一种桥接模式
	// 这样保证了只有一个示例
	private Object readResolve() {
		return INSTANCE;
	}

}
