package day02;
/**
 * java.util.Iterator:接口

   需求:
      定义一个集合,往集合中添加5个元素:孙悟空  唐僧    八戒    沙僧   白龙马
      遍历集合,判断如果遍历出来的是八戒,我们直接再添加一个元素


   注意:
      使用迭代器的时候不要随意改变集合的长度:ConcurrentModificationException(并发修改异常)-->避免

 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Demo02Iterator04 {
	public static void main(String[] args) {

	       //创建集合
	        Collection<String> collection = new ArrayList<>();
	        collection.add("孙悟空");
	        collection.add("唐僧");
	        collection.add("沙僧");
	        collection.add("白龙马");
	        collection.add("八戒");
	        collection.add("八戒");
	        collection.add("八戒");
	        System.out.println(collection);
	      //利用迭代器
	        Iterator<String> iterator = collection.iterator();
	        while(iterator.hasNext()){
	            String name = iterator.next();
	            if ("八戒".equals(name)){
	                collection.add("八戒");
	            }
	        }

	        System.out.println(collection);
	        
	    }
}
