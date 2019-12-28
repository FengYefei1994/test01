package ArrayZuoye;

/*5.15	使用随机数给一个长度为10的整型数组赋值,然后用任意一种排序算法对10个整数排序
 * （不可以调用现成的排序方法）。
*/
public class Zuoye15 {

	public static void main(String[] args) {
		int[] a = new int[10];

		for (int i = 0; i < a.length - 1; ++i) {
			a[i] = (int) (Math.random() * 10);
		}
		System.out.print("随机数组：");
		for (int b : a) {
			System.out.print(b + "；");
		}
		System.out.println();
		// 冒泡
		for (int i = 1; i < 10; ++i) {
			for (int j = 0; j < a.length - 1; ++j) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
				}
			}
		}

		System.out.print("排序后数组：");
		for (int b : a) {
			System.out.print(b + "；");
		}
	}
}
