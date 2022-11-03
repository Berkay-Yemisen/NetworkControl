import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

import java.util.List;

public class ProductPage extends BasePage {
    JavascriptExecutor js = (JavascriptExecutor) driver;


    By productNameLocator = new By.ByCssSelector("div.product__imageList");
    WebElement selectSizeButton = driver.findElement(By.id("size_50/6n"));
    //WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"pagedListContainer\"]/div[2]/div[2]/button"));




    public ProductPage(WebDriver driver) {
        super(driver);
    }

    /*public void next(){
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nextButton.click();

    }

     */


    public void selectSize(){
        selectSizeButton.click();
    }


    public void selectProduct(int i) {


        getAllProducts().get(i).click();
    }


    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}


