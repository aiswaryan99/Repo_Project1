package Pages;

import org.openqa.selenium.By;

public class ShippingPayment extends BasePage{

    By conCheckout = By.id("btn-continue-checkout");
    By checkoutAgain = By.id("billingContinueButton");
    By payment = By.xpath("//div[@class='selected-option']");
    By creditCard = By.xpath("//li[@class='custom-option CREDIT_CARD']/span");
    By selectC = By.xpath("//div[@class='selected-option input-select selected-active' and contains(text(),'Select a Card')]");
    By newCard = By.xpath("//li[@data-label='add a new card']/span");
    By submit = By.xpath("//button[@value='Submit Order' and contains(text(),'Submit Order')][1]");
    By thankYou = By.xpath("//div[@class='col order-instruction']/h2");
    By orderNum = By.xpath("//div[@class='sec-info-module sec-rco-content cart-section-header']/h2/b");

    public void clickCheckoutCont(){
        scrollDown();
        clickThis(conCheckout);
    }

    public void clickSelectPayment(){
        clickThis(payment);
    }

    public void clickCreditCard(){
        clickThis(creditCard);
    }

    public void clickSelectCard(){
        clickThis(selectC);
    }

    public void clickAddNew(){
        clickThis(newCard);
    }

    public void clickOnCheckoutAgain(){
        clickThis(checkoutAgain);
    }

    public void submitOrder(){
        clickThis(submit);
    }

    public String thankYouMessage(){
        return getTextValue(thankYou);
    }

    public boolean thankYouMsgIsPresent(){
         isElementDisplayed(thankYou);
        return false;
    }

    public boolean orderReceiptNumIsDisplayed(){
        isElementDisplayed(orderNum);
        return false;
    }

}
