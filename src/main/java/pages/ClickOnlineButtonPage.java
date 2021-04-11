package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ClickOnlineButtonPage extends BasePage  {


        @FindBy(xpath = "//h1[contains(text(), 'Страхование путешественников')]")
        public WebElement title;

        @FindBy(xpath = "//*[contains(text(), 'Оформить онлайн')]")
        public WebElement sendButton;

    public ClickOnlineButtonPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

        public void sendButton(String itemName) {
            BaseSteps.getDriver().findElement(By.xpath("//span[text() = '" + itemName + "']")).click();
        }
}
