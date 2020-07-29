package kuozhan;
/**
 * 可变参数:相当于一个数组
       什么时候用:
          当我们定义方法的时候,参数的类型确定了,但是将来传入的个数不确定

          格式:
            数据类型...变量名

          注意:
             如果参数中有多个参数,那么可变参放最后面
             一个参数中,不能出现多个可变参数
 * @author zhanglong
 *
 */
public class VarTest {
	public static void main(String[] args) {
	        
		  //method("haha",1,2,3,4);
	      //method("",2,3,4);
	      //method(1,2,3,2);

	      method("小泽","涛哥","宝瑞","加藤鹰");
	    }

	    public static void method(/*int...arr1,*/int...arr){
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
	    }

	    public static void method(String...s){
	        for (int i = 0; i < s.length; i++) {
	            System.out.println(s[i]);
	        }
	    }
}
