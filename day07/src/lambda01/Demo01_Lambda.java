package lambda01;
/**
 * 面向对象:
      为了做一件具体的事儿,我们不得不创建对象
   函数式编程思想:
      只注重与我们要做的事儿

   Lambda表达式格式:
       (数据类型 变量名)->{方法体}

       (数据类型 变量名):正常的方法的参数
       ->:将变量传递到方法体中
       方法体:正常的方法体
 * @author zhanglong
 *
 */
public class Demo01_Lambda {
	public static void main(String[] args) {
		new Thread(new Runnable(){
			public void run() {
                System.out.println("我要执行了!!");
            }
		}).start();
		System.out.println("-------Lambda表达式体验---------");

        new Thread(()-> { System.out.println("我要执行了1!!"); }).start();

        System.out.println("-------Lambda表达式最终简化体验---------");

        new Thread(()->  System.out.println("我要执行了2!!")).start();
	}
}
