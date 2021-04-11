package steps;

import org.openqa.selenium.By;
import pages.SelectOptionInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class SelectOptionInsuranceSteps {

    @Step("заголовок страницы -  равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new SelectOptionInsurancePage().title.getText();
        String expectedTitle2 = "Страхование путешественников";
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle2));
    }

    @Step("нажата кнопка -  {0}")
    public void sendButton(){
        new SelectOptionInsurancePage().sendButton.click();

    }
    @Step("выбран тип страхования -  {0}")
    public void selectType(String itemName) {
        new SelectOptionInsurancePage().selectType(itemName);

    }

}