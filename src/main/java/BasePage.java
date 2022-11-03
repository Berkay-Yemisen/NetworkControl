import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public class BasePage {

    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> findAll(By flag){
        return driver.findElements(flag);
    }
}


