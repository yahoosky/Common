/**
 * 
 */
package late.comm;

import java.io.Serializable;

/**
 * 交易状态
 * 
 * @projectName FileProcessorAPI
 * @packageName tf.file.comm
 * @fileName TradeStatus.java
 * @author chijingjia
 * @createTime :2017-6-22 下午08:12:13
 * @version: v1.0
 */
public class TradeStatus implements Serializable {
	private static final long serialVersionUID = -3597815142943300461L;

	/**
	 * 返回码
	 */
	private int replayCode;
	/**
	 * 错误码
	 */
	private String errCode;
	/**
	 * 错误信息
	 */
	private String errMsg;

	/**
	 * @return the replayCode
	 */
	public int getReplayCode() {
		return replayCode;
	}

	/**
	 * @param replayCode
	 *            the replayCode to set
	 */
	public void setReplayCode(int replayCode) {
		this.replayCode = replayCode;
	}

	/**
	 * @return the errCode
	 */
	public String getErrCode() {
		return errCode;
	}

	/**
	 * @param errCode
	 *            the errCode to set
	 */
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	/**
	 * @return the errMsg
	 */
	public String getErrMsg() {
		return errMsg;
	}

	/**
	 * @param errMsg
	 *            the errMsg to set
	 */
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
