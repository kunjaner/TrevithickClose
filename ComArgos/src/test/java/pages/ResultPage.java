package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends DriverManager {


    @FindBy(css = ".font-condensed.search-title__term")
    private WebElement selecteditem;

    public String headerText(){
        return selecteditem.getText ();
    }

}
