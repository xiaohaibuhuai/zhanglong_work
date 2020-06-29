package day01;
/**
 * Object :所有的父类
 * 只要是Object类的子类都可以使用Object类中的方法，或者重写里面的方法
 * @author zhanglong
 *
 */
public class Person01 {
	private String name;
	private int age;
	public Person01(){
		
	}
	public Person01 (String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	/**
	    *   问题1:
	    *   我们想要比较Person类中的属性值是否相等,由于name和age是Person(子类)特有的
	    *   所以,多态形式调用不了name和age
	    *   解决:向下转型
	    *
	    *   问题2:如果我们传递的不是Person类型,那么强转之后会出现:ClassCastException
	    *   解决:instanceof
	    *
	    *   问题3:假如,我们传递null,为了提高判断效率
	    *   解决:做非空判断
	    *
	    *   问题4:如果我们自己跟自己比,就没有必要了
	    *   解决:再加个判断,判断两个对象是不是同一个,返回true
	    *
	    */
	   /* @Override
	    public boolean equals(Object obj) {//Object obj = p2
	        if (this==obj){
	            return true;
	        }

	        if (obj==null){
	            return false;
	        }

	        if (obj instanceof Person){
	            Person p = (Person)obj;
	            boolean result =  this.age==p.age && this.name.equals(p.name);
	            return result;
	        }

	       return false;

	    }*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person01 other = (Person01) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
