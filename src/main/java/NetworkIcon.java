import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NetworkIcon extends BasePage{
    public NetworkIcon(WebDriver driver) {
        super(driver);
    }

    WebElement networkButton = driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[2]/a"));

    public void network(){
        networkButton.click();
    }
}
