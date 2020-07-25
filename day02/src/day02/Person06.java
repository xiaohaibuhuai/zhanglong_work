package day02;
/**
 * 含有泛型的方法:
     修饰符 <E> 返回值类型 方法名(参数){  }
   什么时候使用:
     调用方法的时候确定类型
 * @author zhanglong
 *
 */
public class Person06 {
	public <E> void method(E e){
        System.out.println(e);
    }
}
class Test06{
	public static void main(String[] args) {
        Person06 person = new Person06();
        person.method("haha");
    } 
}
