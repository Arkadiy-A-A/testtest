import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class FirstTEst {
    public WebDriver driver1;


    @Before
    public void init() {
        driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver1.get("http://aplana.ru/");
        driver1.manage().window().maximize();
    }

    @Test
    public void webTest() throws InterruptedException {
        //a[@class = 'header-brand']
        WebElement headerIcon = driver1.findElement(By.xpath("//a[@class = 'header-brand']"));
        Assert.assertTrue("Страница не загрузилась http://aplana.ru/", headerIcon.isDisplayed());
        WebElement loupe = driver1.findElement(By.xpath("//div[@class='header-search']/i[@class='icon-zoom']"));
        Assert.assertTrue("Лупа не видна", loupe.isDisplayed());
        loupe.click();

        WebElement FindField = driver1.findElement(By.xpath("//div[@class='popup-input']/input"));
        sleep(3000);
        FindField.sendKeys("Партнерам");
        sleep(3000);
        Assert.assertEquals("Текст не введен", FindField.getAttribute("value"), "Партнерам");
        //div[@class='popup-close']

        WebElement panel = driver1.findElement(By.xpath("//div[@class='origin-toggle'][1]"));
        new Actions(driver1).moveToElement(panel).build().perform();
        sleep(3000);


    }
    @After
    public void finalize(){
        driver1.quit();

    }


}
