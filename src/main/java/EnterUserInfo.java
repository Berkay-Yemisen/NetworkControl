import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterUserInfo extends BasePage {
    public EnterUserInfo(WebDriver driver) {
        super(driver);
    }

    WebElement clickPasswordArea = driver.findElement(By.id("n-input-password"));
    WebElement clickMailArea = driver.findElement(By.id("n-input-email"));
    WebElement enterButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));


    public void enterInfo(){
        clickMailArea.sendKeys("yemisenberkay@gmail.com");
        clickPasswordArea.sendKeys("B1e2R3k4.");
        enterButton.click();
    }
}
