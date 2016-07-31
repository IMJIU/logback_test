package log.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jiangmitiao
 * @date 2016/3/24
 * @description TODO
 */
public class Foo {
	public static void doIt() {
		Logger logger = LoggerFactory.getLogger(Foo.class.getName());
		logger.debug("let`s do it");
	}
}
