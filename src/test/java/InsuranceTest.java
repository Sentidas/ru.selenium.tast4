//import org.junit.Test;
//import ru.yandex.qatools.allure.annotations.Title;
//import steps.*;
//import java.util.HashMap;
//
//public class InsuranceTest extends BaseSteps {
//
//    MainPageSteps mainPageSteps = new MainPageSteps();
//    ClickOnlineButtonSteps clickOnlineButtonSteps = new ClickOnlineButtonSteps();
//    InsuranceSteps insuranceSteps = new InsuranceSteps();
//    SelectOptionInsuranceSteps selectOptionInsuranceSteps = new SelectOptionInsuranceSteps();
//    SendAppSteps sendAppSteps = new SendAppSteps();
//
//    HashMap<String, String> testData = new HashMap<>();
//
//
//    @Title("Заявка на страховку для путешественников")
//    @Test
//    public void Test(){
//        testData.put("Дата рождения страхователя","10.05.1990");
//        testData.put("Фамилия застрахованного","Макаров");
//        testData.put("Дата рождения застрахованного","15.10.1990");
//        testData.put("Имя страхователя","Пафнуций");
//        testData.put("Когда выдан","01.05.2018");
//        testData.put("Серия паспорта","0124");
//        testData.put("Имя","Аркадий");
//        testData.put("Номер паспорта","456789");
//        testData.put("Кем выдан","УВД района Зюзино г. Москва 125-154");
//        testData.put("Отчество страхователя","Васильевич");
//        testData.put("Фамилия страхователя","Араруев");
//        System.out.println("Вывод списка" + testData);
//
//        mainPageSteps.waitSendAppClickable();
//        mainPageSteps.selectMainMenu("Страхование");
//        mainPageSteps.selectSubMenu("Перейти в каталог");
//
//        insuranceSteps.selectButton("Путешествия");
//        insuranceSteps.selectInsurance("Страхование для путешественников");
//
//        clickOnlineButtonSteps.checkPageTitle("Страхование путешественников");
//        clickOnlineButtonSteps.sendButton("Оформить онлайн");
//
//        selectOptionInsuranceSteps.checkPageTitle("Страхование путешественников");
//        selectOptionInsuranceSteps.selectType("Минимальная");
//        selectOptionInsuranceSteps.selectType("Защита багажа");
//        selectOptionInsuranceSteps.sendButton("Оформить");
//
//        sendAppSteps.fillFields(testData);
//        sendAppSteps.checkFillFields(testData);
//        sendAppSteps.sendButton("Продолжить");
//
//        sendAppSteps.checkErrorMessageField("Мобильный телефон", "Поле не заполнено.");
//        sendAppSteps.checkErrorMessageField("Электронная почта", "Поле не заполнено.");
//        sendAppSteps.checkErrorMessageField("Повтор электронной почты", "Поле не заполнено.");
//    }
//}
