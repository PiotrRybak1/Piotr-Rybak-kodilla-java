package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger setLogger;

    @BeforeClass
    public static void openLogFile() {
        Logger.getInstance().log("simple lastLog");
    }

    @Test
    public void testGetLastLog() {
        String lastLog = Logger.getInstance().getLastLog();
        Assert.assertEquals("simple lastLog", lastLog);
    }
}
