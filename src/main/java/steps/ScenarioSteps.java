package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    ClickOnlineButtonSteps clickOnlineButtonSteps = new ClickOnlineButtonSteps();
    InsuranceSteps insuranceSteps = new InsuranceSteps();
    SelectOptionInsuranceSteps selectOptionInsuranceSteps = new SelectOptionInsuranceSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();



    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName) {
        mainPageSteps.selectMainMenu(menuName);
    }

    @When("^выбран подпункт меню  \"(.+)\"$")
    public void selectSubMenu(String itemName) {
        mainPageSteps.selectSubMenu(itemName);
    }

    @When("^выбран подраздел  \"(.+)\"$")
    public void selectButton(String item) {
        insuranceSteps.selectButton(item);
    }

    @When("^выбрано направление \"(.+)\"$")
    public void checkTitleDMSPage(String item) {
        insuranceSteps.selectInsurance(item);
    }

    @Then("^заголовок страницы  -   \"(.+)\"$")
    public void checkTitleSendAppPage(String title) {
        clickOnlineButtonSteps.checkPageTitle(title);
    }

    @When("^выполнено нажатие на кнопку 'Оформить онлайн'$")
    public void sendButton() {
        clickOnlineButtonSteps.sendButton();
    }

    @Then("^заголовок страницы -  равен \"(.+)\"$")
    public void checkPageTitle(String title) {
        selectOptionInsuranceSteps.checkPageTitle(title);
    }

    @When("^выбран тип страхования min \"(.+)\"$")
    public void selectTypeMin(String item) {
        selectOptionInsuranceSteps.selectType(item);
    }

    @When("^выбран тип страхования \"(.+)\"$")
    public void selectType(String item) {
        selectOptionInsuranceSteps.selectType(item);
    }

    @When("^выполнено нажатие на кнопку 'Оформить'$")
    public void sendButtonInsurance() {
        selectOptionInsuranceSteps.sendButton();
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.fillField(field, value));
    }

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.checkFillField(field, value));
    }

    @When("^выполнено нажатие на кнопку 'Продолжить'$")
    public void sendButtonEnd() {
        sendAppSteps.sendButton();
    }

    @Then("^в поле \"(.+)\" присутствует сообщение об ошибке \"(.+)\"$")
    public void checkErrorMessage(String field, String errorMessage) {
        sendAppSteps.checkErrorMessageField(field, errorMessage);
    }
}