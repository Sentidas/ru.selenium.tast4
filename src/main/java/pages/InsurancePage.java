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

public class InsurancePage extends BasePage{


    @FindBy(xpath = "//*[@aria-label='Фильтрация карт']")
    public WebElement listButton;

    @FindBy(xpath = "//*[contains(text(), 'Закрыть')][contains(@class,'cookie')]")
    public WebElement closeCookie;

    @FindBy(xpath = "//div[@class = 'uc-form__wrapper-full uc-form__wrapper-full_no-grouping']/div[1]//h3[contains(text(), 'Страхование для путешественников')] ")
    public WebElement title;

    @FindBy(xpath = "//div[contains(@class,'uc-full__button-wrap')]")
    public WebElement sendInsuranceBtn;

    public InsurancePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectButton(String itemName){
        listButton.findElement(By.xpath("./label[contains(text(), '"+itemName+"')]")).click();
    };

    public void selectInsurance(String itemName){
        BaseSteps.getDriver().findElement(By.xpath("//h3[text() =  '"+itemName+"']")).click();
    }
}
