package lecture_examples;

public class ClassWithStatic {
	private int instanceVar;
	private static int staticVar;
	private static final double PI = 3.14159265;
	
	public ClassWithStatic(int instanceVar, int staticVar) {
		this.instanceVar = instanceVar;
		ClassWithStatic.staticVar = staticVar;
	}

	public int getInstanceVar() {
		return instanceVar;
	}

	public void setInstanceVar(int instanceVar) {
		this.instanceVar = instanceVar;
	}

	public static int getStaticVar() {
		return ClassWithStatic.staticVar;
	}

	public static void setStaticVar(int staticVar) {
		ClassWithStatic.staticVar = staticVar;
	}
	
	
	
}
