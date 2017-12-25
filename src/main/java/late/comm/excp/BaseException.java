/**
 * @description
 */
package late.comm.excp;

import org.apache.log4j.Logger;

import late.comm.BaseThreadAttribute;

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
	/**
	 * @description 版本序列号
	 */
	private static final long serialVersionUID = -2207944455637274432L;
	/**
	 * @description 内部日志类
	 */
	protected static final Logger logger = Logger.getLogger(BaseException.class);

	/**
	 * @description 错误码
	 */
	private String errCode;
	/**
	 * @description 错误信息
	 */
	private String errMsg;

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
		StringBuilder msg = new StringBuilder()//
				.append(BaseThreadAttribute.getStr(BaseThreadAttribute.TRADE_ID)).append("交易出现异常")//
				.append("[")//
				.append(errCode)//
				.append("]")//
				.append(errMsg)//
		;
		logger.debug(msg);
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
