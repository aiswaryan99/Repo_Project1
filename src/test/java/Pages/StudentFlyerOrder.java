package Pages;

import org.openqa.selenium.By;

public class StudentFlyerOrder extends BasePage{

    By Sname = By.id("student-name");
    By item= By.id("item-number");
    By add = By.xpath("//button[@class='btn-add']");
    By popUp = By.xpath("//span[@id='error-message-tooltip']");
    By jQtyBox1 = By.xpath("//input[@class='input-qty numericenteronly']");
    By hQtyBox1 = By.xpath("//input[@class='input-qty numericenteronly'][1]");
    By hQtyBox2 = By.xpath("(//input[@class='input-qty numericenteronly'])[1]");
    By mQtyBox1 = By.xpath("(//input[@class='input-qty numericenteronly'])[1]");
    By mQtyBox2 = By.xpath("(//input[@class='input-qty numericenteronly'])[1]");
    By jQtyBox2 = By.xpath("(//input[@class='input-qty numericenteronly'])[1]");
    By qtyBox1 = By.xpath("//td[@class=' hidden-xs price' and contains(text(),'$4.00')]/following-sibling::td[@class=' item-qty']/input[@class='input-qty numericenteronly']");
    By qtyBox2 = By.xpath("//td[@class=' hidden-xs price' and contains(text(),'$5.00')]/following-sibling::td[@class=' item-qty']/input[@class='input-qty numericenteronly']");
    By qtyBox3 = By.xpath("//td[@class=' hidden-xs price' and contains(text(),'$9.00')]/following-sibling::td[@class=' item-qty']/input[@class='input-qty numericenteronly']");
    By reviewCartBox= By.xpath("//button[@class='secondary']");
    By pCheckOut = By.id("dwfrm_cart_checkoutCart");
    By pCheckOutAgain = By.xpath("//i[@class='fa fa-chevron-right']/parent::button");
    By sameStudName=By.xpath("//td[@class=' studentName']");
    By sameItem = By.xpath("//a/parent::td[@class=' itemNum details-control']");
    By sameItemNum = By.xpath("//input[@class='input-qty numericenteronly']");
    By xButton = By.xpath("//i[@class='fa fa-times-circle remove'][1]");
    By qTotal = By.xpath("//li[@class='std-total-label' and contains(text(),'Harry Total')]/following-sibling::li[@class='std-total-qty']/span");
    By HarryTable = By.xpath("//tr[@data-name='Harry']");

    public void studentName(String name){
        typeText(Sname,name);
    }

    public void itemNumber(String num){
        typeText(item,num);
    }

    public void addButton() throws InterruptedException {
        clickThis(add);
        Thread.sleep(3000);
    }

    public void popUpMessageIsPresent(){
        isElementDisplayed(popUp);
    }

    public String popUpText(){
        return getTextValue(popUp);
    }

    public void enterJBox1(String qty){
        enterQtyInBox(jQtyBox1,qty);
    }

    public void enterHBox1(String qty){
        enterQtyInBox(hQtyBox1,qty);
    }

    public void enterHBox2(String qty){
        enterQtyInBox(hQtyBox2,qty);
    }

    public void enterMBox1(String qty){
        enterQtyInBox(mQtyBox1,qty);
    }

    public void enterMBox2(String qty){
        enterQtyInBox(mQtyBox2,qty);
    }

    public void enterQBox1(String qty){
        enterQtyInBox(qtyBox1,qty);
    }

    public void enterQBox2(String qty){
        enterQtyInBox(qtyBox2,qty);
    }
    public void enterJBox2(String qty){
        enterQtyInBox(jQtyBox2,qty);
    }

    public void enterQBox3(String qty){
        enterQtyInBox(qtyBox3,qty);
    }

    public void reviewCart(){
        scrollMiddle();
        clickThis(reviewCartBox);
    }

    public void proceedCheckOut(){
        clickThis(pCheckOut);
    }

    public void proceedCheckOutAgain(){
        clickThis(pCheckOutAgain);
    }

    public void sameNames(String name){
        verifySame(sameStudName,name);
    }

    public void sameItemNums(String item){
        verifySame(sameItem,item);
    }

    public void sameQtyNums(String num){
        verifySame(sameItemNum,num);
    }

    public void clickX(){
        clickThis(xButton);
    }

    public int getPreviousQuantity(){
        String a = getTextValue(qTotal);
        return Integer.parseInt(a);
    }

    public int actualQuantityBefore(){
      return getElementsSize(HarryTable);
    }

    public int getAfterQuantity(){
        String c = getTextValue(qTotal);
        return Integer.parseInt(c);
    }

    public int actualQuantityAfter(){
        return getElementsSize(HarryTable)-1;
    }

}
