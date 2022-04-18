package io.neatcode;

import java.util.logging.Logger;

/**
 * Simple Logging API
 */
public class StdOut {

	private static final Logger log = Logger.getLogger(StdOut.class.getName());

	public void info(String message) {
		log.info(message);
	}
}
