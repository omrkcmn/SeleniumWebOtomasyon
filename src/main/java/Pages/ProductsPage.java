package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {
    By productNameLocator = new By.ByCssSelector("a.a_model_item");
    By moreButton = new By.ByCssSelector("a.lazy-load-button");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }


    public List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }

    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
    }

    public void clickMore(){
        click(moreButton);
    }

}
