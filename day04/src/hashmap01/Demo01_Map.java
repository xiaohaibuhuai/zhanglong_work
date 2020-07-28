package hashmap01;

import java.util.HashMap;

/**
 * HashMap<K,V> implements Map<K,V>

     特点:
        1.无序
        2.键唯一
        3.没索引
        4.数据结构是哈希表
        5.一个键对应一个值

   LinkedHashMap:
        特点:
           1.有序
           2.数据结构是双链表

     方法:
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
        public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
        public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
        public boolean containsKey(Object key):判断该集合中是否有此键。
        boolean containsValue(Object value)

 * @author zhanglong
 *
 */
public class Demo01_Map {
	public static void main(String[] args) {
        //创建对象
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("张无忌","赵敏");
        hashMap.put("涛哥","柳岩");
        hashMap.put("文章","马伊琍");
        hashMap.put("黄晓明","杨颖");
        hashMap.put("陈冠希","杨颖");
        hashMap.put(null,null);
        System.out.println(hashMap);
        
      //public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
        String s = hashMap.remove("涛哥1");
        System.out.println(s);
        System.out.println(hashMap);
        
        System.out.println("-----------------");
        String s1 = hashMap.get("张无忌");
        System.out.println(s1);
        
        System.out.println("-----------------");
        boolean result = hashMap.containsKey("涛哥");
        System.out.println(result);
        
        boolean value = hashMap.containsValue("杨颖");
        System.out.println(value);
	}
}
