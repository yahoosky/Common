/**
 * @description
 */
package late.comm.log;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * 日志缓存类
 * 
 * @projectName common
 * @packageName late.comm.log
 * @fileName LoggerHelper.java
 * @author chijingjia
 * @createTime :2017年12月27日 上午10:32:28
 * @version: v1.0
 */
public class LoggerHelper {
	/**
	 * Logger缓存
	 */
	Map<String, Logger> loggerMap = new HashMap<String, Logger>();

	protected Logger getLogger(String loggerName) {
		Logger logger = loggerMap.get(loggerName);
		if (logger == null) {
			logger = Logger.getLogger(loggerName);
			loggerMap.put(loggerName, logger);
		}
		return logger;
	}

}
