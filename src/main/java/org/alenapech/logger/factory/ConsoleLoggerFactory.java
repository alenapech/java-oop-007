package org.alenapech.logger.factory;

import org.alenapech.logger.ConsoleLogger;
import org.alenapech.logger.Logger;

public class ConsoleLoggerFactory implements LoggerFactory {

    @Override
    public Logger create() {
        return new ConsoleLogger();
    }
}
