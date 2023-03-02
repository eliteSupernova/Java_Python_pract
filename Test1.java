import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://mapi.3i-infotech.com/mail#3");
        driver.findElement(By.id("zb__NEW_MENU_title")).click();
        driver.findElement(By.id("zb__COMPOSE-1__TO_title")).sendKeys("rohan jakkan"+Keys.ENTER);
        } 
        // driver.navigate().to("https://google.com//");
        // driver.findElement(By.name("q")).sendKeys("honohr 3i"+Keys.ENTER);
    }
    
