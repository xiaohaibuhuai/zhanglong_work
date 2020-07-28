package hashmap01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap的遍历方式
         public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
         public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
 * @author zhanglong
 *
 */
public class Demo02_Map {
	public static void main(String[] args) {
		bianli1();
        System.out.println("--------------");
        bianli2();   
	}

	private static void bianli2() {
		//创建一个Map集合
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("涛哥","孝艳");
        hashMap.put("保华","晓亭");
        hashMap.put("于刚","小泽");
        hashMap.put("宝瑞","加藤鹰");

        //遍历调用entrySet方法获取键值对
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
		
	}

	private static void bianli1() {
		//创建一个Map集合
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("涛哥","孝艳");
        hashMap.put("保华","晓亭");
        hashMap.put("于刚","小泽");
        hashMap.put("宝瑞","加藤鹰");
        System.out.println(hashMap);

        //遍历方式1
        Set<String> set = hashMap.keySet();
        // System.out.println(key);
        for(String key:set){
            String value = hashMap.get(key);
            System.out.println(key+"="+value);
        }	
	}
}
