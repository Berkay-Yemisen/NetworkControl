import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectSize extends BasePage {
    public SelectSize(WebDriver driver) {
        super(driver);
    }

    WebElement clickSizeButton = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div[2]/div[2]/div/div[5]/div[3]/div[3]"));

    public void clickSize(){
        clickSizeButton.click();
    }
}
