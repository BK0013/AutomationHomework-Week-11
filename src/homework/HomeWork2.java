package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWork2 extends BaseClass{
    @Before
    public void start() {
        String baseUrl = "https://demo.nopcommerce.com/";
        openBrowser(baseUrl);
       /* driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        WebElement one = driver.findElement(By.xpath("//input[@name='q']"));
        one.sendKeys("demo nopCommerce store", Keys.ENTER);*/
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    }
    @Test
    public void Register(){
        driver.findElement(By.xpath("//input[@id='gender-male' or @id='gender-male']")).click();
        driver.findElement((By.xpath("//input[@id='FirstName']"))).sendKeys("BK");
        driver.findElement((By.xpath("//input[@id='LastName']"))).sendKeys("Patel");
        driver.findElement((By.xpath("//select[@name='DateOfBirthDay']"))).sendKeys("30");
        driver.findElement((By.xpath("//select[@name='DateOfBirthMonth']"))).sendKeys("June");
        driver.findElement((By.xpath("//select[@name='DateOfBirthYear']"))).sendKeys("1990");
        driver.findElement((By.xpath("//input[@name='Email']"))).sendKeys("bk+13@yopmail.com");
        driver.findElement((By.xpath("//input[@id='Company']"))).sendKeys("Prime");
        driver.findElement((By.xpath("//input[@id='Newsletter']"))).click();
        driver.findElement((By.xpath("//input[@id='Password']"))).sendKeys("prime13");
        driver.findElement((By.xpath("//input[@id='ConfirmPassword']"))).sendKeys("prime13");
        driver.findElement((By.xpath("//button[@id='register-button']"))).click();

        String expectedMessage = "Your registration completed";

        WebElement message = driver.findElement (By.xpath ("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        System.out.println (message.getText ());
       


    }
    @After
    public void finished(){

    }

}