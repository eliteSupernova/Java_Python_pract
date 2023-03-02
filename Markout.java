import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Markout {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://3i.honohr.com/");
    driver.findElement(By.id("Usernameid")).sendKeys("1003647");
    driver.findElement(By.id("password")).sendKeys("Justin@78"+Keys.ENTER);
    driver.navigate().to("https://3i.honohr.com/attendance/calendar");
    // driver.findElement(By.linkText("Mark-Out")).click();
    // driver.navigate().to("https://3i.honohr.com/attendance/calendar");
    }
}
