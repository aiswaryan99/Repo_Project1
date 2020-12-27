package StepDefinition;

import Pages.AfterLoginPage;
import Pages.YourTeacherOrder;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TeacherOrderSD {

    AfterLoginPage apage = new AfterLoginPage();
    YourTeacherOrder ypage = new YourTeacherOrder();

    @Then("^I click on 'Your Teacher Order' under 'Enter Orders' tab$")
    public void clickOnYourTeacherOrder() {
        apage.clickOnYTO();
    }

    @Then("^I click on one of the qty boxes$")
    public void clickOnQtyBox() {
        ypage.clickQtyBox();
    }

    @Then("^I verify 'Heading - IMPORTANT'$")
    public void verifyImportantHeading() {
        ypage.headingPresent();
        Assert.assertEquals(ypage.headingText(),"!IMPORTANT",
                "Different heading is displayed!");
    }

    @Then("^I verify pop-up message 'All student paper flyer orders MUST be entered in the Student Flyer Orders tab\\.'$")
    public void verifyPopUpText() {
        ypage.popUpMsgIsPresent();
        Assert.assertEquals(ypage.popUpText(),
                "All student paper flyer orders MUST be entered in the Student Flyer Orders tab.",
                "Different message is displayed!");
    }

    @Then("^I enter '(.+)' in qty box$")
    public void enterValueInQtyBox(String qty) {
        ypage.enterQtyNum(qty);
    }

    @And("^I close the pop-up message$")
    public void closePopUpMsg() {
        ypage.close();
    }

    @Then("^I verify the pop-up message no longer appears$")
    public void popUpMsgNotPresent() {
        ypage.otherQtyBox();
    }
}
