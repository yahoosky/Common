package late.comm;

/**
 * 用户信息
 * 
 * @projectName common
 * @packageName late.comm
 * @fileName UserProfile.java
 * @author chijingjia
 * @createTime :2017年12月14日 上午11:07:00
 * @version: v1.0
 */
public class UserProfile {
	/**
	 * 用户编号
	 */
	private Long userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 级别
	 */
	private String lvl;

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the lvl
	 */
	public String getLvl() {
		return lvl;
	}

	/**
	 * @param lvl
	 *            the lvl to set
	 */
	public void setLvl(String lvl) {
		this.lvl = lvl;
	}

}