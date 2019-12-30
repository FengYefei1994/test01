package ArrayZuoye;

/*5.13	数组的删除(假设数组中没有重复元素)
*/
public class Zuoye13 {

	public static void main(String[] args) {
		int[] a = { 38, 15, 33, 36, 13, 2, 809, 43 };
		System.out.print("修改前数组：");
		for (int b : a) {
			System.out.print(b + "；");
		}
		System.out.println();

		for (int i = 0; i < a.length - 1; ++i) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = 0;
		System.out.print("修改后数组：");
		for (int b : a) {
			System.out.print(b + "；");
		}
	}
}
