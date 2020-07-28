package set;
/**
 * 哈希值
     概述:是一个整数,是计算出来,一个对象调用hashCode方法获取一个十进制的哈希值(整数),
     这个哈希值就可以看做是对象的地址值

   总结:
      调用equals方法比较内容
      调用hashCode方法获取哈希值

      equals一样,hashCode一定一样
      equals不一样,hashCode不一定不一样
 * @author zhanglong
 *
 */
public class Demo02_HashSet {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		
		System.out.println(p2);
		
		String s = "abc";
		String s1 = "abc";
		System.out.println(s.hashCode());//96354
		System.out.println(s1.hashCode());//96354
		
		String s2 = "通话";
        String s3 = "重地";
        System.out.println(s2.hashCode());//1179395
        System.out.println(s3.hashCode());//1179395
	}
}
