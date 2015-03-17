package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class Guru99NewCustomer {
    WebDriver driver;
    By newCustomerPageHeading = By.className("heading3");

    public Guru99NewCustomer (WebDriver driver) {
        this.driver =driver;
    }

    //Get page heading
    public String getNewCustomerPageHeading () {
        System.out.println(driver.findElement(newCustomerPageHeading).getText());
        return driver.findElement(newCustomerPageHeading).getText();
    }
}
