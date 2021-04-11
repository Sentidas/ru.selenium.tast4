package steps;

import pages.InsurancePage;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceSteps  {


    @Step("нажата кнопка - {0}")
    public void selectInsurance(String menuItem){
        new InsurancePage().selectInsurance(menuItem);
    }

    @Step("нажата кнопка - {0}")
    public void selectButton(String menuItem){
        new InsurancePage().selectButton(menuItem);
    }
}
