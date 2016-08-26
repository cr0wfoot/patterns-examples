package chain;

import chain.logger.DebugLogger;
import chain.logger.ErrorLogger;
import chain.logger.LoggerAbstract;
import chain.logger.MailLogger;

public class Run {

    public static void main(String[] args) {
        LoggerAbstract loggerDebug, loggerMail, loggerError;

        loggerDebug = new DebugLogger(LoggerAbstract.DEBUG);
        loggerMail = loggerDebug.setNext(new MailLogger(LoggerAbstract.MAIL));
        loggerError = loggerMail.setNext(new ErrorLogger(LoggerAbstract.ERROR));

        loggerDebug.message("Successful debugging.", LoggerAbstract.DEBUG);
        loggerMail.message("Debugging and sending mail.", LoggerAbstract.MAIL);
        loggerError.message("An error has occurred.", LoggerAbstract.ERROR);
    }
}
