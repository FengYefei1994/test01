package ArrayZuoye;

/*将最小的数与最小的数所在的下标输出
*/
public class Zuoye11 {

	public static void main(String[] args) {
		int[] arr = { 38, 15, 33, 36, 13, 2, 809, 43 };
		int i = 0;
		int min = arr[0];
		int num = 0;
		for (; i < arr.length; ++i) {
			if (arr[i] < min) {
				min = arr[i];
				num = i;
			}
		}
		System.out.println("最小值是：" + min);
		System.out.println("最小值下标是：" + num);
	}
}
