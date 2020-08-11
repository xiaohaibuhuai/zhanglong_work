package fanshe;
/**
 * JavaBean-->domain    pojo
         人类  商品类   动物类

         私有的成员变量
         空参构造
         有参构造
         get/set

    一般JavaBean需要实现序列化接口-->一般为了省事,不需要实现
 * @author zhanglong
 *
 */
public class Person {
	private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name){
        this.name = name;
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
}
