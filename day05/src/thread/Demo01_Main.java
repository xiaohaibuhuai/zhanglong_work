package thread;

public class Demo01_Main {
	public static void main(String[] args) {
		method01();
		System.out.println(Math.abs(-1));
	}

	private static void method01() {
		for (int i = 0; i < 100; i++) {
			System.out.println("我爱java");
		}		
	}
}
