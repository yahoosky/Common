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
public class TraceLogger extends MessageLogger{

/*	*//**
	 * @description 测试日志
	 * @methodName debug
	 * @author chijingjia
	 * @createTime 2017-3-2 下午07:23:33
	 * @version v1.0
	 *//*
	public static void debug(String msg, String... info) {

		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.debug(getMsg(msg, null, info));
	}

	*//**
	 * @description 测试日志
	 * @methodName debug
	 * @author chijingjia
	 * @createTime 2017-3-2 下午07:23:33
	 * @version v1.0
	 *//*
	public static void info(String msg, String... info) {
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.info(getMsg(msg, null, info));
	}

	*//**
	 * @description 测试日志
	 * @methodName debug
	 * @author chijingjia
	 * @createTime 2017-3-2 下午07:23:33
	 * @version v1.0
	 *//*
	public static void error(String msg, Throwable e, String... info) {
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.error(getMsg(msg, e, info));
	}

	*//**
	 * 交易执行情况报告，用于报告交易执行进度，相当于log4j的info级
	 * 
	 * @methodName tradeStep
	 * @author chijingjia
	 * @createTime 2017-11-12 下午07:09:28
	 * @version v1.0
	 * @param msg
	 * @param e
	 * @param info
	 *//*
	public static void tradeStep(String msg, String... info) {
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.info(getMsg(msg, null, info));
	}

	*//**
	 * 秘密信息输出，用于用户名密码等，仅调试时使用。
	 * 
	 * @methodName tradeStep
	 * @author chijingjia
	 * @createTime 2017-11-12 下午07:09:28
	 * @version v1.0
	 * @param msg
	 * @param e
	 * @param info
	 *//*
	public static void secret(String msg, String... info) {
		if (TIMER) {
			System.out.println(Calendar.getInstance().getTimeInMillis());
		}
		logger.debug(getMsg(msg, null, info));
	}
*/

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

}
