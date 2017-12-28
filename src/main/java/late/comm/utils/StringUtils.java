/**
 * 
 */
package late.comm.utils;

/**
 * 
 * @projectName common
 * @packageName late.comm.utils
 * @fileName StringUtils.java
 * @author chijingjia
 * @createTime :2017年12月28日 上午10:45:32
 * @version: v1.0
 */
public class StringUtils {

	/**
	 * 判断是否为空
	 * 
	 * @methodName isEmpty
	 * @author chijingjia
	 * @createTime 2017年12月28日 上午10:45:57
	 * @version v1.0
	 * @return
	 */
	public static Boolean isEmpty(String str) {
		return str == null || str.isEmpty();
	}

	/**
	 * 根据默认值，获取实际值
	 * 
	 * @methodName getValWithDefault
	 * @author chijingjia
	 * @createTime 2017年12月28日 上午10:47:16
	 * @version v1.0
	 * @param str
	 * @param defVal
	 * @return
	 */
	public static String getValWithDefault(String str, String defVal) {
		return isEmpty(str) ? defVal : str;
	}
}
