package ArrayZuoye;

import java.util.Arrays;

/*5.14 直接初始化两个字符串数组，代码判断这两个数组的所有元素是否完全相同
 * （要求两个数组的所有元素大小和顺序都完全一致）。
*/
public class Zuoye14 {

	public static void main(String[] args) {
		String[] a = new String[] { "白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "老鹰", "布谷鸟", "黄鹂", "鹦鹉", "老鹰" };
		String[] b = Arrays.copyOf(a, 9);
		b[5] = "湖北房";

		for (int i = 0; i < b.length; ++i) {
			if (!a[i].equals(b[i])) {
				System.out.print("字符串不等");
				break;
			} else {
				if (i == (a.length - 1)) {
					System.out.print("字符串相等");
				}
			}
		}

	}
}
