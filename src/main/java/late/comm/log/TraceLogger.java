/**
 * @description
 */
package late.comm.log;

import java.io.File;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import late.comm.BaseThreadAttribute;

/**
 * @description
 * @projectName FileProcessorAPI
 * @packageName tf.file.comm
 * @fileName TraceLogger.java
 * @author chijingjia
 * @createTime :2017-3-2 下午07:22:05
 * @version: v1.1
 * @modify by chijingjia 20170512 添加登记异常信息
 */
public class TraceLogger {
	/**
	 * @description 日志
	 */
	private static Logger logger = Logger.getLogger(TraceLogger.class);
	/**
	 * 空字符
	 */
	private static final String BLANK_SPACE = "  ";
	/**
	 * 显示时间
	 */
	private static final Boolean TIMER = Boolean.FALSE;

	/**
	 * @description 测试日志
	 * @methodName debug
	 * @author chijingjia
	 * @createTime 2017-3-2 下午07:23:33
	 * @version v1.0
	 */
	public static void debug(String msg, String... info) {

//		String env = System.getProperty("user.home");
//		PropertyConfigurator.configure(env + File.separator + "log4j.properties");
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.debug(getMsg(msg, null, info));
	}

	/**
	 * @description 测试日志
	 * @methodName debug
	 * @author chijingjia
	 * @createTime 2017-3-2 下午07:23:33
	 * @version v1.0
	 */
	public static void info(String msg, String... info) {
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.info(getMsg(msg, null, info));
	}

	/**
	 * @description 测试日志
	 * @methodName debug
	 * @author chijingjia
	 * @createTime 2017-3-2 下午07:23:33
	 * @version v1.0
	 */
	public static void error(String msg, Throwable e, String... info) {
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.error(getMsg(msg, e, info));
	}

	/**
	 * 交易执行情况报告，用于报告交易执行进度，相当于log4j的info级
	 * 
	 * @methodName tradeStep
	 * @author chijingjia
	 * @createTime 2017-11-12 下午07:09:28
	 * @version v1.0
	 * @param msg
	 * @param e
	 * @param info
	 */
	public static void tradeStep(String msg, String... info) {
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.info(getMsg(msg, null, info));
	}

	/**
	 * 秘密信息输出，用于用户名密码等，仅调试时使用。
	 * 
	 * @methodName tradeStep
	 * @author chijingjia
	 * @createTime 2017-11-12 下午07:09:28
	 * @version v1.0
	 * @param msg
	 * @param e
	 * @param info
	 */
	public static void secret(String msg, String... info) {
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.debug(getMsg(msg, null, info));
	}

	/**
	 * @description 获取信息
	 * @methodName getMsg
	 * @author chijingjia
	 * @createTime 2017-3-2 下午07:28:10
	 * @version v1.0
	 * @param msg
	 * @param e
	 * @param info
	 * @return
	 */
	private static String getMsg(String msg, Throwable e, String... info) {
		StringBuilder rtnMsg = new StringBuilder();
		String tradeId = BaseThreadAttribute.getStr(BaseThreadAttribute.TRADE_ID);
		rtnMsg.append(tradeId).append(BLANK_SPACE).append(msg).append('\n');
		for (int i = 0; i < info.length; i++) {
			if (i % 2 == 0) {
				rtnMsg.append(tradeId).append(BLANK_SPACE).append(info[i]);
				rtnMsg.append(":");
			} else {
				rtnMsg.append(info[i]);
				rtnMsg.append("\n");
			}
		}
		if (rtnMsg.charAt(rtnMsg.length() - 1) != '\n') {
			rtnMsg.append('\n');
		}

		if (e != null) {
			getExcpMsg(tradeId, e, rtnMsg);
		}

		if (rtnMsg.charAt(rtnMsg.length() - 1) == '\n') {
			rtnMsg.setLength(rtnMsg.length() - 1);// 最后一个换行符省略
		}
		// System.out.println(rtnMsg.toString());
		return rtnMsg.toString();
	}

	/**
	 * 
	 * @methodName getExcpMsg
	 * @author chijingjia
	 * @createTime 2017-7-7 下午04:16:52
	 * @version 1.1
	 * @param tradeId
	 * @param excp
	 * @param rtnMsg
	 * @modify by chijingjia 20170707 递归输出Cause信息 版本号升至1.1
	 */
	private static void getExcpMsg(String tradeId, Throwable excp, StringBuilder rtnMsg) {
		if (excp != null) {
			rtnMsg.append(tradeId).append(BLANK_SPACE).append("Exception as").append(excp.getClass().getName()).append('\n')//
					.append("message :").append(excp.getMessage()).append('\n');
			for (StackTraceElement trace : excp.getStackTrace()) {
				rtnMsg.append(tradeId).append(BLANK_SPACE).append(BLANK_SPACE).append(trace.getClassName()).append(".").append(
						trace.getMethodName()).append(BLANK_SPACE).append(trace.getLineNumber()).append("\n");
			}
			Throwable cause = excp.getCause();
			if (cause != null) {
				rtnMsg.append(tradeId).append(BLANK_SPACE).append("Cause by ").append(cause.getMessage()).append("\n");
				getExcpMsg(tradeId, cause, rtnMsg);// 递归
			}
		}
	}

	/**
	 * @description 测试方法
	 * @methodName main
	 * @author chijingjia
	 * @createTime 2017-3-2 下午07:22:05
	 * @version v1.0
	 * @param args
	 */
	public static void main(String[] args) {
		// TraceLogger.debug("haha", "ces", "aa");
		Throwable e1 = new Throwable("haha1");
		Throwable e11 = new Throwable("haha2");
		Throwable e111 = new Throwable("haha2");
		e11.initCause(e111);
		e1.initCause(e11);

		String ss = getMsg("cc", e1, "aa");
		System.out.println(ss);
	}

	static {
		String env = System.getProperty("user.home");
		PropertyConfigurator.configure(env + File.separator + "log4j.properties");
//		File propFile = new File("log4j.properties");
//		PropertyConfigurator.configure(propFile.getAbsolutePath());
		// org.apache.log4j.xml.DOMConfigurator.configure(env + File.separator +
		// "log4j.properties");
	}
}
