package day02;
import java.util.Scanner;
/**
 * 含有泛型的接口
     格式:
        修饰符 interface 接口名<E> {  }
     实现类实现接口的时候确定类型
     一直不确定类型,创建对象的时候确定
 * @author zhanglong
 *
 */
public interface InterfaceA06<E> {
	E next();
	
}
class InterfaceAImpl06 implements InterfaceA06<String>{
	public String next() {
        return "涛哥是世界第一帅的人~~~";
    }
}
class Test {
    public static void main(String[] args) {
        InterfaceAImpl06 interfaceA = new InterfaceAImpl06();
        String next = interfaceA.next();
        System.out.println(next);
    }
}
