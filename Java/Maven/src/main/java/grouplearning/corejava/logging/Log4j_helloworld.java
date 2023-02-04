package grouplearning.corejava.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_helloworld {
    private static final Logger logger = LogManager.getLogger(Log4j_helloworld.class);

    public static void main(String[] args) {
        logger.trace("Hello, Trace!");
        logger.debug("Hello, Debug!");
        logger.info("Hello, Info!");
        logger.warn("Hello, Warn!");
        logger.error("Hello, Error!");
        logger.fatal("Hello, fatal!");
    }

}
