import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoBasket extends BasePage {
    public GoBasket(WebDriver driver) {
        super(driver);
    }

    WebElement clickBasketButton = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div[2]/div[2]/div/div[7]/button[2]"));

    public void clickBasket(){
        clickBasketButton.click();
    }
}
