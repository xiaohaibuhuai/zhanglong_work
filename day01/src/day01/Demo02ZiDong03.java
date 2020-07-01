package day01;
/**
 * 自动拆箱和装箱
 * @author zhanglong
 *
 */
public class Demo02ZiDong03 {
	public static void main(String[] args) {
		Integer i = 4;//自动装箱。相当于Integer i = Integer.valueOf(4);
		i = i+10;//先将i拆成基本数据类型 ,加10,之后再装箱
		
	}
}
