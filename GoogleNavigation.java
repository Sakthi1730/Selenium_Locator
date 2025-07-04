package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleNavigation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.navigate().refresh();
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        driver.quit();
    }
}
