package exception01;

import java.io.FileNotFoundException;
/**
 * 使用多个catch时候的注意事项:

      多个catch的时候是有顺序的

      先捕获小的,再捕获大的,如果实在不想这么写,直接写一个最大的Exception

 * @author zhanglong
 *
 */
public class Demo07_Exception {
	public static void main(String[] args) {
		try{
			method(1);
		}catch(Exception e){
			System.out.println(e+"~~~");
		}/*catch (FileNotFoundException e){
        System.out.println(e+"@@@");
    	}*/
			
		System.out.println("game over");
	}

	public static void method(int n) throws FileNotFoundException, ClassNotFoundException {		
		if (n==0){
            throw new FileNotFoundException("大哥,你写的内容臣妾找不到呀~");
        }

        if (n==1){
            throw new ClassNotFoundException("二哥,我的类找不到呀~");
        }

        System.out.println("我要执行拉~~");
    }
	
}
