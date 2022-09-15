package lecture_examples;

public class StaticTester {

	public static void main(String[] args) {
		ClassWithStatic class1 = new ClassWithStatic(10, 20);
		ClassWithStatic class2 = new ClassWithStatic(100, 52);
		
//		System.out.println("instanceVar: " + class1.getInstanceVar());
//		System.out.println("staticVar: " + class1.getStaticVar());
//		

//		
//		System.out.println("instanceVar: " + class2.getInstanceVar());
//		System.out.println("staticVar: " + class2.getStaticVar());
//		
//		System.out.println();
//		
//		System.out.println("instanceVar: " + class1.getInstanceVar());
//		System.out.println("staticVar: " + class1.getStaticVar());
		
		
		System.out.println(class1.getStaticVar());
		System.out.println(class2.getStaticVar());
		
		class2.setStaticVar(212);
		
		System.out.println(class1.getStaticVar());
		System.out.println(class2.getStaticVar());
		
		System.out.println(class1.getInstanceVar());
		System.out.println(ClassWithStatic.getStaticVar());
		/*
			Math.pow(a, b);
			Math.sqrt();
			Math.sin();
		*/
	}

}
