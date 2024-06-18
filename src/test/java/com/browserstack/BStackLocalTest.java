package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BStackLocalTest extends SeleniumTest {

    @Test
    public void test() throws Exception {
        driver.get("https://gold.dat.de");

        Assert.assertTrue(driver.getTitle().contains("DAT - die Brancheninstitution"));
    }
}
