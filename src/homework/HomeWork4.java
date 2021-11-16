package homework;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class HomeWork4 extends BaseClass{
    @Before
    public void start() {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        openBrowser(baseUrl);

    }
    @Test
    public void Login(){
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));

    }
}