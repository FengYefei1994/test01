package ArrayZuoye;

/*
 * 5.18	假设有数组int[] arr={2,3,1,0,2,5,3}，输出其中的重复数字
 */
public class Zuoye18 {

	public static void main(String[] args) {
		int[] b = new int[] { 2, 3, 1, 0, 2, 5, 3 };

		for1: for (int i = 0; i < b.length - 1; ++i) {
			for (int j = i + 1; j < b.length; ++j) {
				if ((b[i] == b[j])) {
					System.out.println("存在相同元素：" + b[i]);
					continue for1; // 带标签的break、continue用法
				}
			}
		}

	}

}
