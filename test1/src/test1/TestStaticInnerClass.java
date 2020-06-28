package test1;
/**
 * 测试静态内部类
 * @author zhanglong
 *
 */
public class TestStaticInnerClass {

	public static void main(String[] args) {
		//通过new 外部类名.内部类名（） 来创建内部类对象
		Outer2.Inner2 inner = new Outer2.Inner2();
	}

}

class Outer2{
	//相当于外部类的一个静态成员
	static class Inner2{
		
	}
}