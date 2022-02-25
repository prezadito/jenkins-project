package io.jenkins.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchField;

    @FindBy(css = "#nav-search-submit-button")
    WebElement searchBtn;

    public void searchItem(String item) {
        searchField.sendKeys(item);
        searchBtn.click();
    }
}
