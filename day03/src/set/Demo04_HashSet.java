package set;

import java.util.HashSet;

/**
 * HashSet存储自定义类型如何保证元素唯一?
       重写hashCode和equals方法
 * @author zhanglong
 *
 */
public class Demo04_HashSet {
	public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("柳岩",36));
        hashSet.add(new Person("安住",38));
        hashSet.add(new Person("柳岩",36));
        System.out.println(hashSet);
    }
}
