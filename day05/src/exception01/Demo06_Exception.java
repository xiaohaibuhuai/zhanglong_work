package exception01;

import java.io.FileNotFoundException;

/**
 * try..catch  捕获多个异常

   try{
      可能出现异常的代码
   }catch(异常对象 变量名){
      处理代码
   }catch(异常对象 变量名){
      处理代码
   }...
 * @author zhanglong
 *
 */
public class Demo06_Exception {
	public static void main(String[] args) {
        //调用方法
       /* try{
            method(0);
        }catch (FileNotFoundException e){
            System.out.println(e+"~~");
        }catch (ClassNotFoundException e){
            System.out.println(e+"@@@");
        }*/

       try{
           method(0);
       }catch (Exception e){
           System.out.println(e);
       }
      /*  try {
            method(0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        System.out.println("game over");

    }

    public static void method(int n)throws FileNotFoundException,ClassNotFoundException{
        if (n==0){
            throw new FileNotFoundException("大哥,你写的内容臣妾找不到呀~");
        }

        if(n==1){
            throw new ClassNotFoundException("二哥,我的类找不到呀~");
        }

        System.out.println("我要执行拉~~");
    }
}
