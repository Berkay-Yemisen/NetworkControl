import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasketIcon extends BasePage{
    public BasketIcon(WebDriver driver) {
        super(driver);
    }


    WebElement basketIconButton = driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[2]"));
    WebElement continuationShopping = driver.findElement(By.id("basketModalClose"));

    public void basketIcon(){
        basketIconButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        continuationShopping.click();
    }
}
