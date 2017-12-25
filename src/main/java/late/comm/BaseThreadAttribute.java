/**
 * @description
 */
package late.comm;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
 
/**
 * @description 存储线程信息容器。
 * @projectName FileProcessorAPI
 * @packageName tf.file.comm
 * @fileName FileProc】、
 * essorThreadAttribute.java
 * @author chijingjia
 * @createTime :2017-3-2 下午05:19:31
 * @version: v1.0
 */
public class BaseThreadAttribute {
	/**
	 * @description 交易代码。（UUID）
	 */

	public static final String TRADE_ID = "TRADEID";
	public static final String DB_CONNECTION = "_DB_CONN";
	public static final String JMS_INFO = "_JMS_INFO";
	public static final String EXCEPTION = "_EXCP";

	private static final ThreadLocal<Map<String, Object>> attributeMapHolder = new ThreadLocal<Map<String, Object>>() {
		@Override
		protected Map<String, Object> initialValue() {
			return new HashMap<String, Object>() {
				private static final long serialVersionUID = 8233723281076119401L;
				{
					put(BaseThreadAttribute.TRADE_ID, UUID.randomUUID().toString());
				}
			};
		}
	};

	/**
	 * @description 获取字符串属性
	 * @methodName getStr
	 * @author chijingjia
	 * @createTime 2017-3-2 下午06:14:28
	 * @version v1.0
	 * @param key
	 * @return
	 */
	public static String getStr(String key) {
		return (String) attributeMapHolder.get().get(key);
	}

	/**
	 * 获取Object对象
	 * 
	 * @methodName getObj
	 * @author chijingjia
	 * @createTime 2017-6-24 上午08:43:12
	 * @version 1.0
	 * @param key
	 * @return
	 */
	public static Object getObj(String key) {
		return attributeMapHolder.get().get(key);
	}

	/**
	 * @description 设置属性
	 * @methodName set
	 * @author chijingjia
	 * @createTime 2017-3-2 下午06:19:13
	 * @version v1.0
	 * @param key
	 * @param value
	 */
	public static void set(String key, Object value) {
		attributeMapHolder.get().put(key, value);
	}
}
