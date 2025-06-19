package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeTitleCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("STORE")) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }
        driver.quit();
    }
}

