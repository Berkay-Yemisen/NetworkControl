import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage  {

    SearchBox searchBox;

    By BasketContainerLocator = By.className("header__basketTrigger js-basket-trigger -desktop");
    //WebElement clickCookie = driver.findElement(By.id("onetrust-accept-btn-handler"));
    //WebElement basketIcon = driver.findElement(By.cssSelector("header__icon -shoppingBag"));
    //WebElement network_Button = driver.findElement(By.className("header__logo"));
   // WebElement hoverUserButton = driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[3]"));
    public HomePage(WebDriver driver) {

        super(driver);
        searchBox = new SearchBox(driver);

    }

    public SearchBox searchBox(){
        return this.searchBox;
    }



    public void goBasket() {

        //basketIcon.click();
    }

   /*public void networkButton(){

        network_Button.click();
    }



    public void hover(){
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverUserButton).perform();
    }

    */




}
