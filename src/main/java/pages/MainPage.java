package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;


public class MainPage extends BasePage {

    @FindBy(xpath = "//ul[contains(@class,'list_center')]")
    WebElement mainMenu;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMainMenu(String itemName) {
        mainMenu.findElement(By.xpath(".//a[text()='" + itemName + "']")).click();
    }

    public void selectSubMenu(String itemName) {
        BaseSteps.getDriver().findElement(By.xpath("//*[contains(text(), '" + itemName + "')]")).click();
    }
}