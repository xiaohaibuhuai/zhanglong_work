package string;
/**
 * tring​(byte[] bytes)

   String​(byte[] bytes, int offset, int length)

   String​(char[] value)

   String​(char[] value, int offset, int count)
 * @author zhanglong
 *
 */
public class Demo01 {
	  public static void main(String[] args) {
	        byte[] bytes = {97,98,99,100};
	        String s = new String(bytes);
	        System.out.println(s);

	        String s1 = new String(bytes,1,2);
	        System.out.println(s1);

	        char[] chars = {'a','b','c','d'};
	        String s2 = new String(chars);
	        System.out.println(s2);

	        String s3 = new String(chars,1,2);
	        System.out.println(s3);
	    }

}
