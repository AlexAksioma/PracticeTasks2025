package parallel_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel {
    WebDriver driver;

    @Test
    public void chromeTest() {
        System.out.println("Thread ID for Chrome --> "+Thread.currentThread().getId());
        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app/home");
    }

    @Test
    public void fireFoxTest() {
        System.out.println("Thread ID for FireFox --> "+Thread.currentThread().getId());
        driver = new FirefoxDriver();
        driver.get("https://telranedu.web.app/home");
    }
}
