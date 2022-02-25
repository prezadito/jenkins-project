package io.jenkins.test;

import io.jenkins.base.SetUp;
import io.jenkins.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends SetUp {

    @Test
    public void searchComputer() {
        Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
        BasePage basePage = new BasePage(driver);
        basePage.searchItem("computer");
        Assert.assertEquals(driver.getTitle(), "Amazon.com : computer");
    }


}
