/**
 * 
 */
package late.comm.dto;

import late.comm.TradeStatus;

/**
 * 返回抽象父类
 * 
 * @projectName common
 * @packageName late.comm.dto
 * @fileName BaseResponseDTO.java
 * @author chijingjia
 * @createTime :2017年12月4日 上午10:17:28
 * @version: v1.0
 */
public abstract class BaseResponseDTO {
	/**
	 * 交易状态
	 */
	private TradeStatus status = new TradeStatus();

	public TradeStatus getStatus() {
		return status;
	}

	public void setStatus(TradeStatus status) {
		this.status = status;
	}

	public void setRetInfo(String errCode, String errMsg) {
		this.status.setReplayCode(99);
		this.status.setErrCode(errCode);
		this.status.setErrMsg(errMsg);
	}

}
