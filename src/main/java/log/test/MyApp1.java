package log.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jiangmitiao
 * @date 2016/3/24
 * @description TODO
 */
public class MyApp1 {
	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(MyApp1.class.getName());
		logger.info("before");
		Foo.doIt();
		logger.info("after");

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			logger.error("errorTest {}", "i don't known",e);
		}
	}
}