import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTEst2 {

    @Test
    public void webTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://market.yandex.by");
        driver.findElements(By.xpath("//div[starts-with(@data-id,'model-')]")).get(0).click();
//        new WebDriverWait(driver, 30).until(ExpectedConditions.textToBePresentInElement(webElement, "Samsung"));
    }

}
