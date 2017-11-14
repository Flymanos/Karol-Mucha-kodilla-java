package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLastLog(){
        //given
        String log = "log";
        //when
        Logger.getInstance().log(log);
        //then
        Assert.assertEquals(log, Logger.getInstance().getLastLog());
    }
}
