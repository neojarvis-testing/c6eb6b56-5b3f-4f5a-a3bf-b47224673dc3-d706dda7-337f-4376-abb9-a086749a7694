package uistore;

import org.openqa.selenium.By;

public class BusinessPageLocators3 {

    public static By verifyAvonLogo = By.cssSelector("img[class='avon-int-logo']");

    public static By verifyCertifications = By.xpath("//div[contains(text(),'Certifications')]");

    public static By clickEmailField = By.id("name");

    public static By verifyEmailField = By.xpath("//label[contains(text(),'Email ID (required)')]");

    public static By verifyPhNo = By.xpath("//label[contains(text(),'Ph. No (required)')]");

    public static By inputPhNoField = By.cssSelector(("input[name='phone']"));

    public static By verifyCountryLabel = By.xpath(("//label[contains(text(),'Country ')]"));

    public static By inputCountryField = By.cssSelector(("input[name='country']"));

    public static By inputCompanyName = By.cssSelector(("input[name='company_name']"));

    public static By inputAddress = By.cssSelector(("input[id='email'][class='form-control'][name ='address']"));

    public static By inputSubject = By.cssSelector(("input[class='form-control'][name='subject']"));

    public static By inputYourMsg = By.id(("message"));

    public static By clickSendButton = By.cssSelector(("input[class='btn btn-primary']"));
}
