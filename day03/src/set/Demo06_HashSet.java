package set;

import java.util.HashSet;

public class Demo06_HashSet {
	public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
       /* hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);*/

        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        System.out.println(hashSet);
    }
}
