/**
 * 
 */
package late.comm.utils;

import java.util.Arrays;

/**
 * 数组工具
 * 
 * @projectName common
 * @packageName late.comm.utils
 * @fileName ArrayUtils.java
 * @author chijingjia
 * @createTime :2017年12月27日 上午11:09:41
 * @version: v1.0
 */
public class ArrayUtils {
	/**
	 * 数组头追加数组
	 * 
	 * @methodName headAdd
	 * @author chijingjia
	 * @createTime 2017年12月27日 上午11:12:07
	 * @version v1.0
	 * @param <T>
	 * @param arr
	 * @param headArr
	 * @return
	 */
	@SafeVarargs
	public static <T> T[] headAdd(T[] arr, T... headArr) {
		T[] tmpArr = Arrays.copyOf(headArr, arr.length + headArr.length);
		System.arraycopy(arr, 0, tmpArr, headArr.length, arr.length);
		return tmpArr;
	}

	public static void main(String[] args) {
		String[] aa = new String[] { "a", "b" };
		aa = headAdd(aa, "d", "e");
		for (String string : aa) {
			System.out.println(string);
		}
	}
}
