import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String base= "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
        
        driver.get(base);
        
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='post-2646']/div[2]/div/div/div/p/select"));
        //System.out.println("hi");
        Select drop = new Select(dropdown);
        
        for(int i=0;i<120;i++){
        System.out.println(i);
            drop.selectByIndex(i);
        }
    }

    
}