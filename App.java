import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");
        
        driver.findElement(By.name("Sign in")).sendKeys("3i infotech"+Keys.ENTER);
        driver.navigate().to("https://www.3i-infotech.com/");
        // driver.findElement(By.name("btnk")).click();
        //driver.findElement(By.name("btnK")).click();
    }
}
