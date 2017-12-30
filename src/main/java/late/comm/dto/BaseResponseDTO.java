/**
 * 
 */
package late.comm.dto;

import late.comm.TradeStatus;
import late.comm.excp.BaseErrCodeConstants;
import late.comm.excp.BaseException;
import late.comm.utils.StringUtils;

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

	/**
	 * 设置返回信息
	 * 
	 * @methodName setRetInfo
	 * @author chijingjia
	 * @createTime 2017年12月28日 上午10:57:05
	 * @version v1.0
	 * @param errCode
	 * @param errMsg
	 */
	public void setRetInfo(String errCode, String errMsg) {
		if (!StringUtils.isEmpty(errCode)) {
			getStatus().setReplayCode(99);
			getStatus().setErrCode(errCode);
			getStatus().setErrMsg(errMsg);
		}
	}

	public void setExcp(Throwable e) {
		if (e != null) {
			getStatus().setReplayCode(99);
			if (e instanceof BaseException) {
				getStatus().setErrCode(((BaseException) e).getErrCode());
				getStatus().setErrMsg(((BaseException) e).getErrMsg());
			} else {
				getStatus().setErrCode(BaseErrCodeConstants.UNKNOWN_EXCEPTION);
				getStatus().setErrMsg(e.getMessage());
			}
		}
	}

}
