package lambda03;
/**
 * 函数式接口:
      概念:有且仅有一个抽象方法的接口  (可以包含静态的方法,默认方法)

      注解:@FunctionalInterface-->检验此接口是不是一个函数式接口

      注意:一般函数式接口常用于方法的参数上
 * @author zhanglong
 *
 */
public class Test {
	public static void main(String[] args) {
	       /* MyInterface myInterface = new MyInterface() {
	            @Override
	            public void method() {
	                System.out.println("老子要运行了喽哈!");
	            }
	        };

	        myInterface.method();

	        System.out.println("-------一下是Lambda表达式-------");

	        MyInterface myInterface1 = ()->{System.out.println("老子要运行了喽哈11111!");};
	        myInterface1.method();



	        System.out.println("-------一下是Lambda表达式最终写法-------");
	        MyInterface myInterface2 = ()->System.out.println("老子要运行了喽哈11111222!");
	        myInterface2.method();*/

	       methodLambda(new MyInterface() {
	           public void method() {
	               System.out.println("沉香很厉害");
	           }
	       });

	       methodLambda(()-> System.out.println("沉香很牛逼"));
	    }

	    public static void methodLambda(MyInterface myInterface){
	        myInterface.method();
	    }
}
