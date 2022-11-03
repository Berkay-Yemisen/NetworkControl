
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;

public class AddProductTest extends BaseTest{

    HomePage homePage;
    ProductPage productPage;
    NextPage nextPage;
    BasketIcon basketIcon;
    HoverUserIcon hoverUserIcon;
    EnterUserInfo enterUserInfo;
    NetworkIcon networkIcon;
    SelectSize selectSize;
    GoBasket goBasket;



    @Test
    @Order(1)
    public void search_product(){
        homePage = new HomePage(driver);
        homePage.searchBox.search("Ceket");

    }

    @Test
    @Order(2)
    public void select_product(){
        productPage = new ProductPage(driver);
        nextPage = new NextPage(driver);
        nextPage.next();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        productPage.selectProduct(0);


    }

    @Test
    @Order(3)
    public void select_Size(){
        selectSize = new SelectSize(driver);
        selectSize.clickSize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(4)
    public void add_product(){
        goBasket = new GoBasket(driver);
        goBasket.clickBasket();

    }


    @Test
    @Order(5)
    public void hoverIcon(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hoverUserIcon = new HoverUserIcon(driver);
        hoverUserIcon.UserIcon();
    }
    @Test
    @Order(6)
    public void userInfo(){
        enterUserInfo = new EnterUserInfo(driver);
        enterUserInfo.enterInfo();
    }

    @Test
    @Order(7)
    public void clickNetworkIcon(){
        networkIcon = new NetworkIcon(driver);
        networkIcon.network();
    }

    @Test
    @Order(8)
    public void clickBasketIcon(){
        basketIcon = new BasketIcon(driver);
        basketIcon.basketIcon();
    }





}


