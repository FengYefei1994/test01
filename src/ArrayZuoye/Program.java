package ArrayZuoye;

public class Program {

	public static void main(String[] args) {
		// 5.1 打印3行数组
		int[] a = { 7, 8, 78, 56, 76, 8, 87, 54, 7 };
		for (int i = 0; i < 3; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		for (int i = 3; i < 6; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		for (int i = 6; i < 9; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
