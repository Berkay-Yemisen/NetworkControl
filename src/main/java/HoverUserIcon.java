import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HoverUserIcon extends BasePage {


    WebElement userIcon = driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[3]"));
    public HoverUserIcon(WebDriver driver) {
        super(driver);
    }

    public void UserIcon(){
        userIcon.click();

    }

}
