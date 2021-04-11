package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ClickOnlineButtonPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class ClickOnlineButtonSteps {


    @FindBy(xpath = "//h2[contains(text(), 'Страхование путешественников')]")
    public WebElement title;

    @Step("заголовок страницы -  равен {0}")
    public void checkPageTitle(String expectedTitle) {
        String actualTitle = new ClickOnlineButtonPage().title.getText();
        String expectedTitle2 = "Страхование путешественников";
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle2));
    }

    @Step("нажата кнопка {0}")
    public void sendButton() {
        new ClickOnlineButtonPage().sendButton.click();
    }
}
