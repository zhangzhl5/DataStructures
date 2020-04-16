package design.pattern.single.register;

/**
 * 懒汉式单例模式 枚举实现  
 * 
 * @author zhangzhl
 *
 */
public enum EnumSignleton {
	INATANCE;

	// 常量公用
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static EnumSignleton getInstance() {
		return INATANCE;
	}

}
