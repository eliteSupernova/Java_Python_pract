import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
    public static void main(String[] args) throws Exception{
        
        System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
        WebElement from = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
        WebElement to = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div"));
        Actions act = new Actions(driver);
        act.dragAndDrop(from, to).build().perform();
        Thread.sleep(3000);
        act.dragAndDrop(driver.findElement(By.linkText("5000")),driver.findElement(By.id("amt7"))).perform();
        act.dragAndDrop(driver.findElement(By.linkText("SALES")),driver.findElement(By.id("loan"))).perform();
        act.dragAndDrop(driver.findElement(By.linkText("5000")),driver.findElement(By.id("amt8"))).perform();
        
        driver.close();
        //

// }
}
}
