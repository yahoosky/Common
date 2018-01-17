/**
 * @description
 */
package late.comm.excp;

/**
 * @description 错误代码常量
 * @projectName FileProcessorAPI
 * @packageName tf.file.comm.excp
 * @fileName FileProcessorErrCodeConstants.java
 * @author chijingjia
 * @createTime :2017-3-2 下午05:52:04
 * @version: v1.0
 */
public interface BaseErrCodeConstants {

	/**
	 * 用户自定义的错误信息
	 */
	public static final String USER_DEFINED_MSG = "USERDEF01";

	/**
	 * 未知异常信息
	 */
	public static final String UNKNOWN_EXCEPTION = "UKNOWEXCP";

	/**
	 * 用户总线为空
	 */
	public static final String USER_CONTEXT_ISNULL = "COMM0002";

	/**
	 * 登录超时
	 */
	public static final String USER_LOGIN_TIMEOUT = "COMM0003";

	/**
	 * 未知异常信息
	 */

}
