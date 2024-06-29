package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.id("APjFqb")).sendKeys("Places to visit in London");
//        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
//        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
          driver.findElement(By.className("gNO89b")).click();
          driver.navigate().back();
          Thread.sleep(3000);
          driver.navigate().forward();
          Thread.sleep(3000);
          driver.navigate().refresh();
          Thread.sleep(5000);
          driver.close();



    }
}
