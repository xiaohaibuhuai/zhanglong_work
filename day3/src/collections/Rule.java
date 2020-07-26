package collections;

import java.util.Comparator;

/**
 * 前面的减去后面的:升序 
 * 相反:降序
 * @author zhanglong
 *
 */
public class Rule implements Comparator<Person>{
	public int compare(Person o1, Person o2) {
		return o2.getAge()-o1.getAge();
	}

}
