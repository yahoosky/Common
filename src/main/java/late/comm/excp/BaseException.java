/**
 * @description
 */
package late.comm.excp;

import late.comm.BaseThreadAttribute;
import late.comm.log.TraceLogger;

/**
 * @description 文件处理异常类
 * @projectName FileProcessorAPI
 * @packageName tf.file.comm.excp
 * @fileName FileProcessorException.java
 * @author chijingjia
 * @createTime :2017-3-2 下午01:10:04
 * @version: v1.0
 */
public class BaseException extends Exception {
	private static final String THIS_COMPONMENT_NAME = BaseException.class.getName();
	/**
	 * @description 版本序列号
	 */
	private static final long serialVersionUID = -2207944455637274432L;

	/**
	 * @description 错误码
	 */
	protected String errCode;
	/**
	 * @description 错误信息
	 */
	protected String errMsg;

	/**
	 * @description 构造方法。复用双参构造方法。默认警告
	 * @param errMsg
	 *            警告信息
	 */
	protected BaseException(String errMsg) {
		this(BaseErrCodeConstants.USER_DEFINED_MSG, errMsg);
	}

	/**
	 * @description 构造方法。设置错误码与错误信息
	 * @param errCode
	 * @param errMsg
	 */
	protected BaseException(String errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	@Override
	public void printStackTrace() {
		// TODO 日志输出方式未处理，希望添加为含异常栈信息
		StringBuilder msg = new StringBuilder()//
				.append(BaseThreadAttribute.getStr(BaseThreadAttribute.TRADE_ID)).append("交易出现异常")//
				.append("[")//
				.append(errCode)//
				.append("]")//
				.append(errMsg)//
		;
		TraceLogger.debug(THIS_COMPONMENT_NAME, msg.toString());
	}

	/**
	 * @description 获取错误信息
	 * @methodName getErrMsg
	 * @author chijingjia
	 * @createTime 2017-4-7 下午05:50:43
	 * @version v1.0
	 * @return
	 */
	public String getErrMsg() {
		return this.errMsg;
	}

	/**
	 * @description 获取错误码
	 * @methodName getErrMsg
	 * @author chijingjia
	 * @createTime 2017-4-7 下午05:50:43
	 * @version v1.0
	 * @return
	 */
	public String getErrCode() {
		return this.errCode;
	}
}
