package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BStackLocalTest extends SeleniumTest {

    @Test
    public void test() throws Exception {
        driver.get("http://datwin64/");

        Assert.assertTrue(driver.getTitle().contains("ZEUS WebServices - Login"));
    }
}
