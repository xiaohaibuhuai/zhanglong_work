package test1;

public interface MyInterface {
	/*public static final*/ int MAX_AGE = 100;
	/*public abstract*/void test01();
}
class MyClass implements MyInterface{

	@Override
	public void test01() {
		System.out.println("MyClass.test01()");
		System.out.println(MAX_AGE);
	}
	
}