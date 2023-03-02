
import java.nio.channels.NotYetBoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
public class Tst1 {
    public static void main(String[] args) throws InterruptedException{
    System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    // String tagname="";
    String base="https://3i.honohr.com/login/user_login_process";
    String username="1003647";
    String pass="Justin@78";
    // String expectedTitle="Google";
    // String actualTilte="";

    driver.get(base);
    driver.findElement(By.id("Usernameid")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(pass);
    driver.findElement(By.xpath("/html/body/div/div/div/form/div[2]/div[5]/button")).click();
    Thread.sleep(10000);
    // driver.findElement(By.linkText("Mark-Out")).click();
    // Thread.sleep(10000);
    driver.findElement(By.xpath("//*[@id='ulid']/li[2]")).click();
    // driver.findElement(By.xpath("//*[@id='ulid']/li[2]/a")).click();
    // driver.findElement(By.xpath("//*[@id='ulid']/li[2]/div/ul/li[3]")).click();
    // Actions builder=new Actions(driver);
    // Action mouseOver= builder.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/div/ul/li[2]"))).build();
    // mouseOver.perform();
    driver.findElement(By.xpath("//*[@id='ulid']/li[2]/div/ul/li[3]")).click();
    // String actualTitle = driver.getTitle();
    // System.out.println("title: "+actualTitle);//*[@id="ulid"]/li[2]/a/img
    // tagname=driver.findElement(By.id("aiFlag")).getTagName();
    // System.out.println("tagname :"+tagname);
    // if (actualTitle.contentEquals(expectedTitle)){
    //     System.out.println("Passed");

    // }else{
    //     System.out.println("failed");
    }



    // driver.get("https://www.testandquiz.com/selenium/testing.html");




    // driver.findElement(By.name("q")).sendKeys("javatpoint"+Keys.ENTER);
    // driver.findElement(By.linkText("Java Tutorial")).click();
    // driver.findElement(By.name("btnk")).Keys.ENTER;
}
    
