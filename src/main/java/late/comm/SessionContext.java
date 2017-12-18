/**
 * 
 */
package late.comm;

/**
 * 交易上下文
 * 
 * @projectName common
 * @packageName late.comm
 * @fileName SessionContext.java
 * @author chijingjia
 * @createTime :2017年12月14日 上午11:05:01
 * @version: v1.0
 */
public class SessionContext {

	/**
	 * 柜员信息
	 */
	private UserProfile user;

	/**
	 * @return the user
	 */
	public UserProfile getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(UserProfile user) {
		this.user = user;
	}

}
