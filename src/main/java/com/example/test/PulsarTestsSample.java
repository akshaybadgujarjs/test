package com.example.test;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Slf4jgit
public class PulsarTestsSample {

    public PulsarTestsSample() {
        log.info("PulsarTestsSample constructor");
    }

    @Test(description = "Add Restaurant Slot With No Holiday Slot And Verify")
    public void sampleTest() {
        log.info("sampleTest");
        Assert.assertEquals(true,true);
    }

}
