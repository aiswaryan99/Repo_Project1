package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Checkout extends BasePage {

    By taxAmount = By.xpath("//div[@class='tooltip-salestax-help hide']/following-sibling::span[@class='or-inner-data']");
    By bookPrice1 = By.xpath("//td[@class='flyer hidden-xs' and contains(text(),'Early Childhood November')]/following-sibling::td[@class='price']/span");
    By bookPrice2 = By.xpath("//td[@class='flyer hidden-xs' and contains(text(),'Kindergartners November')]/following-sibling::td[@class='price']/span");
    By bookPrice3 = By.xpath("//td[@class='flyer hidden-xs' and contains(text(),'Firefly November')]/following-sibling::td[@class='price']/span");
    By itemNum1 = By.xpath("//tr[@id='16B3']/td[@class='itemNum details-control']/a");
    By itemNum2 = By.xpath("//tr[@id='35N3']/td[@class='itemNum details-control']/a");
    By itemNum3 = By.xpath("//tr[@id='35J3']/td[@class='itemNum details-control']/a");
    By qtyNum1 = By.xpath("//td[@class='flyer hidden-xs' and contains(text(),'Early Childhood November')]/following-sibling::td[@class='item-qty']/input");
    By qtyNum2 = By.xpath("//td[@class='flyer hidden-xs' and contains(text(),'Kindergartners November')]/following-sibling::td[@class='item-qty']/input");
    By qtyNum3 = By.xpath("//td[@class='flyer hidden-xs' and contains(text(),'Firefly November')]/following-sibling::td[@class='item-qty']/input");
    By totalItemNum = By.xpath("//li[@class='std-total-qty']/span[@class='total-qty sfoSubTotalQty']");
    By numStudDisplayed = By.xpath("//span[@id='student_flyer_orders_num']");
    By numStuds = By.xpath("//div[@class='each-review-order']");
    By actStTotal = By.xpath("//li[@class='std-total-label' and contains(text(),'Harry Total')]/following-sibling::li[@class='std-total-price stdPriceTotal']");
    By actualTotal = By.xpath("//li[@class='std-total-price sfoSubTotalPrice']");
    By summaryTotal = By.xpath("//span[@id='student_flyer_orders']");
    By studentNames = By.xpath("//div[@class='each-review-order']/h2/span/i");
    By itemNumbers = By.xpath("//td[@class='itemNum details-control']/a");
    By qNums = By.xpath("//td[@class='item-qty']/input[@class='input-qty input-qty-sfo numericenteronly']");
    By allPrices = By.xpath("//td[@class='coupon hidden-xs']/following-sibling::td[@class='price']/span");

    public String verifyNoTax() {
        String aTax = getTextValue(taxAmount);
        return aTax.substring(1);
    }

    public boolean verifyTax() {
        String aTax = getTextValue(taxAmount);
        String taxAmount = aTax.substring(1);
        double amt = Double.parseDouble(taxAmount);
        return amt > 0.00;
    }

    public String getItemNum1(){
        return getTextValue(itemNum1);
    }

    public String getItemNum2(){
        return getTextValue(itemNum2);
    }

    public String getItemNum3(){
        return getTextValue(itemNum3);
    }

    public String getQtyNum1(){
        return getTextValue(qtyNum1);
    }

    public String getQtyNum2(){
        return getTextValue(qtyNum2);
    }

    public String getQtyNum3(){
        return getTextValue(qtyNum3);
    }

    public boolean isPrice1Displayed(){
        isElementDisplayed(bookPrice1);
        return false;
    }

    public boolean isPrice2Displayed(){
        isElementDisplayed(bookPrice2);
        return false;
    }

    public boolean isPrice3Displayed(){
        isElementDisplayed(bookPrice3);
        return false;
    }

    public int totalQuantity(){
        String t = getTextValue(totalItemNum);
        return Integer.parseInt(t);
    }
    public int calculateTotalQty(){
        String t1= getTextValue(qtyNum1);
        int qty1 = Integer.parseInt(t1);

        String t2 = getTextValue(qtyNum2);
        int qty2 = Integer.parseInt(t2);

        String t3 = getTextValue(qtyNum3);
        int qty3 = Integer.parseInt(t3);

        return qty1+qty2+qty3;
    }

    public int numStDis(){
        String s = getTextValue(numStudDisplayed);
        return Integer.parseInt(s);
    }

    public int calculateNumSt(){
        List<WebElement> suggestions = Web.getDriver().findElements(numStuds);
        return suggestions.size();
    }

    public double calculateStudentTotal(){
        double p1 = getDoubleValue(bookPrice1);
        double p2 = getDoubleValue(bookPrice2);
        double p3 = getDoubleValue(bookPrice3);

        int q1 = getIntValue(qtyNum1);
        int q2 = getIntValue(qtyNum2);
        int q3 = getIntValue(qtyNum3);

        double t1 = (p1*q1);
        double t2 = (p2*q2);
        double t3 = (p3*q3);

        return (t1+t2+t3);
    }

    public double presentStudentTotal(){
        return getDoubleValue(actStTotal);
    }

    public Double actualTotalPresent(){
        return getDoubleValue(actualTotal);
    }

    public Double actualTotalSummary(){
        return getDoubleValue(summaryTotal);
    }

    public void stNames(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Harry");
        names.add("John");
        names.add("Michael");
        iterateAndVerifyList(studentNames,names);
        }

    public void itemNums(){
        ArrayList<String> items = new ArrayList<>();
        items.add("35J3");
        items.add("16B3");
        items.add("35N3");
        items.add("42J4");
        items.add("34B4");
        iterateAndVerifyList(itemNumbers,items);
        }

    public void quantityNums(){
        ArrayList<String> quantities = new ArrayList<>();
        quantities.add("2");
        quantities.add("5");
        quantities.add("4");
        quantities.add("1");
        quantities.add("10");
        iterateAndVerifyList(qNums,quantities);
    }

    public double calculateSumValue(){
        return getTotal(qNums,allPrices);
    }

}

