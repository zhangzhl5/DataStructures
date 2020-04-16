package design.pattern.single.register;

/**
 *懒汉式单例模式
 *枚举实现  
 * @author zhangzhl
 *
 */
public enum EnumSignleton {
	INATANCE;
	
	public static EnumSignleton getInstance() {
		return INATANCE;
	}

}
