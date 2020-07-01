package day01;
/**
 * StringBuilder:java.lang
    概述:一个可变的字符序列
    使用:
       1.new对象-->缓冲区就产生了
         new StringBuilder()
         new StirngBuilder(String str)

       2.调用方法
  public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
  public String toString()：将当前StringBuilder对象转换为String对象。
 * @author zhanglong
 *
 */
public class Demo01StringBuilder02 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder("孝艳");
		System.out.println(sb2);
		System.out.println("-------------------------");
		method02();
	}
	public static void method01(){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1.append(1);
        sb1.append("孝艳");
        sb1.append("晓亭");
        sb1.append("珊珊");
        System.out.println(sb1);
        sb1.append("涛哥").append("保华").append("就业老师").append("水岛安住");
        System.out.println(sb1);
    }
	//toString
	  public static void method02(){
	        StringBuilder sb1 = new StringBuilder();
	        StringBuilder sb2 = sb1.append(1);
	        sb1.append("孝艳");
	        sb1.append("晓亭");
	        sb1.append("珊珊");
	        System.out.println(sb1);

	        //链式调用
	        sb1.append("涛哥").append("保华").append("就业老师").append("水岛安住");
	        System.out.println(sb1);
	        String s = sb1.toString();
	        System.out.println(s);
	    }
}
