package ArrayZuoye;

/*����С��������С�������ڵ��±����
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
		System.out.println("��Сֵ�ǣ�" + min);
		System.out.println("��Сֵ�±��ǣ�" + num);
	}
}
