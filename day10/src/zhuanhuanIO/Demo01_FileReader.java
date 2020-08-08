package zhuanhuanIO;

import java.io.FileReader;
import java.io.IOException;

public class Demo01_FileReader {
	public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\idea\\work\\2.txt");
       /* int read = fr.read();
        System.out.println((char)read);

        fr.close();*/

       char[] chars = new char[1024];
       int len = 0;
       while((len=fr.read(chars))!=-1){
           System.out.println(new String(chars,0,len));
       }

       fr.close();
    }
}
