package ArrayZuoye;

/*
 * 5.18	����������int[] arr={2,3,1,0,2,5,3}��������е��ظ�����
 */
public class Zuoye18 {

	public static void main(String[] args) {
		int[] b = new int[] { 2, 3, 1, 0, 2, 5, 3 };

		for1: for (int i = 0; i < b.length - 1; ++i) {
			for (int j = i + 1; j < b.length; ++j) {
				if ((b[i] == b[j])) {
					System.out.println("������ͬԪ�أ�" + b[i]);
					continue for1; // ����ǩ��break��continue�÷�
				}
			}
		}

	}

}
