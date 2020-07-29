package hashmap02;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 统计字符串中字符在Map集合中出现的次数
 * @author zhanglong
 *
 */
public class HashMap_Test {
	public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个字符串:");
        String str = sc.next();
        //调用方法,将str传递过去
        method(str);
    }

    public static void method(String str) {
        //创建Map集合
        HashMap<String,Integer> hashMap = new HashMap<>();
        //将str中的每一个字符存到数组中
        char[] chars = str.toCharArray();
        //遍历char数组,将每一个字符遍历出来
        for (int i = 0; i < chars.length; i++) {
            String key = chars[i]+"";

            //判断Map集合中有没有此字符
            if (!hashMap.containsKey(key)){
                hashMap.put(key,1);
            }else{
                //获取已经包含的key对应的值
                Integer value = hashMap.get(key);
                value++;
                //将加1之后的值以及对应的字符重新存到map集合中
                hashMap.put(key,value);
            }
        }
        System.out.println(hashMap);
    }
}
