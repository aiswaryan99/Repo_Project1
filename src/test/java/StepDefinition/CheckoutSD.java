package StepDefinition;

import Pages.Checkout;
import Pages.StudentFlyerOrder;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class CheckoutSD {
    StudentFlyerOrder spage = new StudentFlyerOrder();
    Checkout cpage = new Checkout();

    @Then("^I verify the student name are same as '(.+)' gets added under SFO$")
    public void verifySameStudentNamePresent(String name){
        spage.sameNames(name);
    }

    @Then("^I verify the item number '(.+)' gets added under SFO$")
    public void verifyItemNum1(String item) {
        spage.sameItemNums(item);
    }

    @Then("^I verify the qty number '(.+)' gets added under SFO$")
    public void verifyQtyNum(String num) {
        spage.sameQtyNums(num);
    }

    @Then("^I enter '(.+)' in qty box on SFO page$")
    public void enterQty1(String qty) {
        spage.enterQBox1(qty);
    }

    @Then("^I enter '(.+)' in qty box for box 1 on SFO page$")
    public void enterQty2(String qty) {
        spage.enterQBox2(qty);
    }

    @Then("^I enter '(.+)' in qty box for box 2 on SFO page$")
    public void enterQty3(String qty) {
        spage.enterQBox3(qty);
    }

    @Then("^I enter '(.+)' in qty box for box 6$")
    public void enterQty4(String qty){
        spage.enterJBox2(qty);
    }

    @Then("^I verify item number '(.+)' is 1st present on 'Review Your Cart' Page$")
    public void verifyItemNum1Present(String item) {
        Assert.assertEquals(cpage.getItemNum1(),item,
                "The item number 16B3 is not present!");
    }

    @Then("^I verify the item number '(.+)' is 2nd present on 'Review Your Cart' Page$")
    public void verifyItemNum2Present(String item) {
        Assert.assertEquals(cpage.getItemNum2(),item,
                "The item number 35N3 is not present!");
    }

    @Then("^I verify the item number '(.+)' is present 3rd on 'Review Your Cart' Page$")
    public void verifyItemNum3Present(String item) {
        Assert.assertEquals(cpage.getItemNum3(),item,
                "The item number 35J3 is not present!");
    }

    @Then("^I verify the qty number '(.+)' is present for book 16B3$")
    public void verifyQtyNum1IsPresent(String qty) {
        Assert.assertEquals(cpage.getQtyNum1(),qty,
                "Same quantity is not present as input!");
    }

    @Then("^I verify the qty number '(.+)' is present for book 35N3$")
    public void verifyQtyNum2IsPresent(String qty) {
        Assert.assertEquals(cpage.getQtyNum2(),qty,
                "Same quantity is not present as input!");
    }

    @Then("^I verify the qty number '(.+)' is present for book 35J3$")
    public void verifyQtyNum3IsPresent(String qty) {
        Assert.assertEquals(cpage.getQtyNum3(),qty,
                "Same quantity is not present as input!");
    }

    @Then("^I verify price for book 16B3 is present$")
    public void verifyPrice1Present() {
        Assert.assertTrue(cpage.isPrice1Displayed(),
                "Price for 16B3 is not present!");
    }

    @Then("^I verify price for book 35N3 is present$")
    public void verifyPrice2Present() {
        Assert.assertTrue(cpage.isPrice2Displayed(),
                "Price for 35N3 is not present!");
    }

    @Then("^I verify price for book 35J3 is present$")
    public void verifyPrice3Present() {
        Assert.assertTrue(cpage.isPrice3Displayed(),
                "Price for 35J3 is not present!");
    }

    @Then("^I verify the qty total is correct as present$")
    public void verifyQtyTotalAmount() {
        Assert.assertEquals(cpage.totalQuantity(),cpage.calculateTotalQty(),
                "The displayed quantity total is not correct!");
    }

    @Then("^I verify number of students is correct as present$")
    public void verifyNumOfStudents() {
        Assert.assertEquals(cpage.numStDis(),cpage.calculateNumSt(),
                "Incorrect number of student is displayed!");
    }

    @And("^I verify student total is correct as present$")
    public void verifyCorrectStudentTotal() {
        Assert.assertEquals(cpage.presentStudentTotal(),cpage.calculateSumValue(),
                "Incorrect Student Total is present on checkout page!");
    }

    @Then("^I verify total amount is correct as present$")
    public void verifyCorrectTotalPresent() {
        Assert.assertEquals(cpage.calculateSumValue(),cpage.actualTotalSummary(),
                "Incorrect Summary Total present on checkout page!");
        Assert.assertEquals(cpage.actualTotalPresent(),cpage.calculateSumValue(),
                "Incorrect Total present on checkout page!");
    }

    @Then("^I verify all students names are present after adding them$")
    public void verifyAllStudentNamesPresent() {
        cpage.stNames();
    }

    @Then("^I verify all item numbers are present after adding them$")
    public void verifyAllItemNumbersArePresent() {
        cpage.itemNums();
    }

    @Then("^I verify all quantity numbers are present after adding them$")
    public void verifyAllQuantityNumbersArePresent() {
        cpage.quantityNums();
    }

    @Then("^I verify summary total is correct as present$")
    public void verifySummaryTotalIsCorrect() {
        Assert.assertEquals(cpage.actualTotalSummary(),cpage.calculateSumValue(),
                "The Summary Total that is present is incorrect!");
    }
}
