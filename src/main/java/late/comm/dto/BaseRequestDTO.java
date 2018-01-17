/**
 * 
 */
package late.comm.dto;

import late.comm.SessionContext;

/**
 * 上传抽象父类
 * 
 * @projectName common
 * @packageName late.comm.dto
 * @fileName BaseRequestDTO.java
 * @author chijingjia
 * @createTime :2017年12月4日 上午10:17:10
 * @version: v1.0
 */
public abstract class BaseRequestDTO {

	/**
	 * 交易上下文
	 */
	private SessionContext context;

	/**
	 * @return the context
	 */
	public SessionContext getContext() {
		return context;
	}

	/**
	 * @param context
	 *            the context to set
	 */
	public void setContext(SessionContext context) {
		this.context = context;
	}

}
