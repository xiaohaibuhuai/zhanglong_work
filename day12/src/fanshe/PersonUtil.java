package fanshe;

public class PersonUtil {
	public static Class getC() throws ClassNotFoundException {
        return Class.forName("cn.itcast.day12.fanshe.Person");
    }
}
