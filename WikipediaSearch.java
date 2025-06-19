package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();        
        driver.get("https://www.wikipedia.org/");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("Artificial Intelligence");
        searchBox.sendKeys(Keys.RETURN);
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        try {
            WebElement historySection = driver.findElement(By.id("History"));
            System.out.println("Title of the section: " + historySection.getText());
        } catch (Exception e) {
            System.out.println("History section not found.");
        }
        driver.quit();
    }
}
