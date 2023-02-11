package programming;

public class Fibonai {
	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		System.out.print(f1 + " " + f2 + " ");
		for (int i = 1; i < 100; i++) {

			int f3 = f1 + f2;
			System.out.print(f3 + " ");
			f1=f2;
			f2=f3;
		}
	}

}
