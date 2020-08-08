package xuliehua;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化:
      ObjectOutputStream-->写对象
      ObjectOutputStream extends OutputStream

      方法:
         writeObject

      构造:
         ObjectOutputStream(OutputStream out)


   反序列化:
      ObjectInputStream-->读对象

      ObjectInputStream extends InputStream

      方法:
         readObject()

      构造:
         ObjectInputStream(InputStream in)

 * @author zhanglong
 *
 */
public class Demo01_XuLieHua {
	public static void main(String[] args) throws Exception{
	       //methodWrite();
	        methodRead();
	    }

	    public static void methodWrite() throws IOException {
	        FileOutputStream fos = new FileOutputStream("day10\\person.txt");

	        ObjectOutputStream oos = new ObjectOutputStream(fos);

	        oos.writeObject(new Person("柳岩",36));

	        oos.close();
	        fos.close();
	    }

	    //反序列化
	    public static void methodRead() throws IOException, ClassNotFoundException {
	        FileInputStream fis = new FileInputStream("day10\\person.txt");

	        ObjectInputStream ois = new ObjectInputStream(fis);

	       // Object o = ois.readObject();

	        Person p = (Person) ois.readObject();
	        System.out.println(p);

	        //关流

	        ois.close();
	        fis.close();
	    }
}
