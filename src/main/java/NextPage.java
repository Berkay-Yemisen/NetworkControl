import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextPage extends BasePage {


    WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"pagedListContainer\"]/div[2]/div[2]/button"));
    public NextPage(WebDriver driver) {
        super(driver);
    }


    public void next(){
        nextButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
