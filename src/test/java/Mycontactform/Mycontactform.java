package Mycontactform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mycontactform {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mycontactform.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sample Forms")).click();
        Thread.sleep(2000);
//        driver.findElement(By.linkText("Features")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("About Us")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Resources")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Pricing")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Sample Forms")).click();
//        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='email_to[]'][@value='2']")).click();
        driver.findElement(By.xpath("//input[@name='email_to[]'][@value='0']")).click();
        driver.findElement(By.xpath("//input[@name='email_to[]'][@value='1']")).click();

        driver.findElement(By.name("subject")).sendKeys("Contact Enquiry");
        driver.findElement(By.id("email")).sendKeys("user1@test.com");
        driver.findElement(By.id("q1")).sendKeys("Request for details");
        driver.findElement(By.name("q2")).sendKeys("Please provide detail information for my enquiry which can be very helpful");

        driver.findElement(By.xpath("//input[@id='q4'][@value='Second Option']")).click();
        driver.findElement(By.xpath("//input[@id='q4'][@value='Fourth Option']")).click();
        driver.findElement(By.xpath("//input[@id='q4'][@value='First Option']")).click();

         }
}
