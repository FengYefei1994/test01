package ArrayZuoye;

import java.util.Arrays;

public class Zuoye03 {

	public static void main(String[] args) {
		// 5.3 整数数组，其中存放着序列45,6,23,8,26,98,6,15。请将该序列排序并倒序输出。
		int[] array = new int[] { 45, 6, 23, 8, 26, 98, 6, 15 };
		Arrays.sort(array); // 通过Arrays包，可省略循环排序问题
		for (int j = array.length - 1; j >= 0; --j) {
			System.out.print(array[j] + "，");
		}

		// 排序部分：升序
		/*
		 * for(int i=1;i<array.length;i++){ for(int j=0;j<array.length-1;j++){
		 * if(array[j]>array[j+1]){ int tmp=array[j]; array[j]=array[j+1];
		 * array[j+1]=tmp; } } }
		 */
		// 增强for循环
		for (int j : array) {
			System.out.print(j + "，");
		}

	}

}
