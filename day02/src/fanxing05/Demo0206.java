package fanxing05;
/**
 * 能知道代表啥就行
    泛型的上限：
    格式： 类型名称 <? extends 类 > 对象名称
    意义： 只能接收该类型及其子类
    泛型的下限：
    格式： 类型名称 <? super 类 > 对象名称
    意义： 只能接收该类型及其父类型

      Integer-->Numer-->Object
      String-->Object
 */
import java.util.ArrayList;
import java.util.Collection;

public class Demo0206 {
	public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();
       /* getElement1(list1);
        getElement1(list2);//报错
        getElement1(list3);
        getElement1(list4);//报错

        getElement2(list1);//报错
        getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);*/
    }
    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){}
    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}
}

