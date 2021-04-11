package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps {

    @Step("выбран пункт меню {0}")
    public void selectMainMenu(String itemName){
        new MainPage().selectMainMenu(itemName);
    }

    @Step("выбран пункт меню {0}")
    public void selectSubMenu(String itemName){
        new MainPage().selectSubMenu(itemName);
    }

}
