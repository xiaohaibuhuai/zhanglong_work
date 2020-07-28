package set;

import java.util.HashSet;

/**
 * HashSet底层的数据结构是:哈希表

   HashSet如何保证数据的唯一的:有可能是面试题
      1.判断元素的哈希值是否一样,如果不一样,直接存
      2.判断内容是不是一样

      3.如果内容一样,那么哈希值一定一样
        如果内容不一样,那么哈希值有可能一样

     总结:
        先计算元素的哈希值,如果一样,比较内容
        如果说哈希值一样,内容一样,存到HashSet集合中的时候,就会去重复

 * @author zhanglong
 *
 */
public class Demo03_HashSet {
	public static void main(String[] args) {
        String s = "abc";
        String s1 = "abc";
        String s3 = "重地";
        String s4 = "通话";

        System.out.println(s.hashCode());//96354
        System.out.println(s1.hashCode());//96354
        System.out.println(s3.hashCode());//1179395
        System.out.println(s4.hashCode());//1179395


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("通话");
        hashSet.add("重地");
        System.out.println(hashSet);
    }
}
