package com.custom.logger;

import org.apache.log4j.Logger;

public class CustomLogger {
	private static Logger logger;
	public static CustomLogger getLogger(Class<?> objectClass) {
		logger = Logger.getLogger(objectClass);
		return new CustomLogger();
	}

	/**
	 * logs more detail information  
	 * @param message
	 */
	public void logMin(String... message) {
		logger.trace(constructMessage(message));
	}

	/**
	 * 
	 * @param message
	 */
	public void critical(String... message) {
		logger.fatal(constructMessage(message));
	}

	/**
     * @param e
     * @param message
     */
     public void error(Exception e,String... message) {
            logger.error(constructMessage(message),e);
     }
	
	/**
	 * @param message
	 */
	public void warning(String... message) {
		logger.warn(constructMessage(message));
	}

	public void info(String... message) {
		logger.info(constructMessage(message));
	}

	/**
	 * @param message
	 */
	public void debug(String... message) {
		logger.debug(constructMessage(message));
	}

	/**
	 * @param message
	 */
	public void logMax(String... message) {
		logger.debug(constructMessage(message));
	}

	/**
	 * @param message
	 * @return log string
	 */
	private String constructMessage(String... message) {
		StringBuffer buffer = new StringBuffer();
		for (String s : message) {
			buffer.append(s + "-");
		}

		return buffer.toString();

	}
}
