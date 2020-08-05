package digui;
/**
 *  递归阶乘

        5!
           5*4*3*2*1

           5*4!
             4*3!
               3*2!
                 2*1!
                   1

       n*(n-1)!



       递归求和
          5+4+3+2+1


        n+(n-1)

 * @author zhanglong
 *
 */
public class Demo02_DiGui {
	public static void main(String[] args) {
        /*int method = method(3);
        System.out.println(method);*/

        int method = method(5);
        System.out.println(method);
    }

   /* public static int method(int n){
        if (n==1){
            return 1;
        }

        return n*method(n-1);

    }*/
    public static int method(int n){
        if (n==1){
            return 1;
        }

        return n+method(n-1);

    }

}
