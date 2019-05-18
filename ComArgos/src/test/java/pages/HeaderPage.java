package pages;

import driver.DriverManager;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends DriverManager {
    public static String searchProduct;


    @FindBy(id="searchTerm")
    private WebElement searchTxtBox;

    @FindBy(css = "._1gqeQ")
    private WebElement searchButton;


    public String getCurrentUrl(){
        return driver.getCurrentUrl ();
    }


    public void doSearch(String item){

        searchProduct=item;
        searchTxtBox.sendKeys (item);
        searchButton.click ();
    }

}
