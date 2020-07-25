package day02;

import java.util.ArrayList;
import java.util.Collection;
public class Demo02ForPlus05 {
	public static void main(String[] args) {
        Collection<String> collection =new ArrayList<>();
        collection.add("明步");
        collection.add("海翼");
        collection.add("安住");
        collection.add("波多");
        collection.add("波多");
        collection.add("小泽");
        collection.add("未久");
        for (String s : collection) {
            System.out.println(s);
        }
    }
}
