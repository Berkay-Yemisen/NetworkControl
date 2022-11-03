import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


public class SearchBox extends BasePage{

    //WebElement searchBoxLocator = driver.findElement(By.id("search"));
    WebElement clickCookie = driver.findElement(By.id("onetrust-accept-btn-handler"));
    WebElement searchBoxLocator = driver.findElement(By.id("search"));
    //By searchBoxLocator = By.id("search");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

   public void search(String text) {

        clickCookie.click();
        searchBoxLocator.sendKeys("ceket",Keys.ENTER);

    }


}
