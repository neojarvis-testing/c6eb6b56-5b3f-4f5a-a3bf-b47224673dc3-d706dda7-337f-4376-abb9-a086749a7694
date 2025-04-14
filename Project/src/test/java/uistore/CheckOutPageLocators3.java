package uistore;

import org.openqa.selenium.By;

public class CheckOutPageLocators3 {

    public static By verifySelectAddress = By.xpath("//p[contains(text(),'Select Address')]");
    public static By verifyPriceDetails = By.xpath("//h1[contains(text(),'Price Details')]");
    public static By verifySelectPaymentMethod = By.xpath("//p[contains(text(),'Select Payment Method')]");
    public static By verifyBackToCart = By
            .xpath("//button[contains(text(),'Back to cart')]");

}

