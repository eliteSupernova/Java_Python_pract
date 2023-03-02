import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;
public class selni{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.findElement(By.name("q")).sendKeys("tcs"+Keys.ENTER);
        driver.findElement(By.linkText("TCS NextStep")).click();
        driver.findElement(By.linkText("Register Now")).click();
        driver.findElement(By.id("btnSlctIT")).click();
        
    }
    
}
