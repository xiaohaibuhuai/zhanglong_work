package day02;
/**
 * 含有泛型的类:
     定义格式:
        修饰符 class 类名<E> {  }
     什么时候确定:
        创建对象的时候确定类型
 * @author zhanglong
 *
 */
public class Person05<E> {
	private E age;	
	public void setAge(E e) {
		this.age = age;
	}	
	public E getAge(){
		return age;
	}
}
class Test05{
	public static void main(String[] args) {
		Person05<String> p = new Person05<>();
		p.setAge("haha");
		String age = p.getAge();
		Person05<Integer> person = new Person05<>();
		person.setAge(1);
	}
}