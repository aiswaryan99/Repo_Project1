package StepDefinition;

import DriverWrapper.Web;
import Pages.AfterLoginPage;
import Pages.BookRecommend;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ScholasticBookSD {

    LoginPage lpage = new LoginPage();
    BookRecommend bpage = new BookRecommend();
    AfterLoginPage apage = new AfterLoginPage();

    @Given("^I am on Login Page$")
        public void verifyLandingPage() {
        Assert.assertEquals(Web.getDriver().getTitle(), "Scholastic Book Clubs | Children's Books for Parents and Teachers");
    }

    @Then("^I enter scholastic account email as '(.+)'$")
         public void enterEmailAdd(String email){
         lpage.enterEmail(email);
    }

    @Then("^I enter scholastic password as '(.+)'$")
        public void enterPass(String pass){
        lpage.enterPassword(pass);
    }

    @Then("^I click on sign in button$")
        public void clickOnSignIn(){
        lpage.clickSignIn();
    }

    @Then("^I search '(.+)' in Search by Title, Author, Item # or Keyword Box$")
        public void typeInSearch(String value){
        bpage.enterTextIntoSearch(value);
    }

    @Then("^I click on magnifying glass button$")
        public void clickOnSearch(){
        bpage.search();
    }

    @Then("^I click on 'Quick Look' on 'Harry Potter and the Order of the Phoenix'$")
        public void clickQuickLook(){
        bpage.quickLook();
    }

    @Then("^I click on the star button$")
    public void clickOnStar(){
        bpage.recommendStar();
    }

    @Then("^I click on the Recommendations to Students Box$")
    public void clickRecommendBox(){
        bpage.recommendBox();
    }

    @Then("^I click on x button to close$")
    public void closeAddRecBox(){
        bpage.closeAddBox();
    }

    @Then("^I click on x to close quick look$")
    public void closeQuickLook(){
        bpage.closeQLBox();
    }

    @Then("^I scroll up and click on My Lists$")
    public void clickOnMyLists(){
        bpage.MyLists();
    }

    @Then("^I click on Recommendations to Students from the dropdown$")
    public void clickRecommendationsForStudents(){
        bpage.recommendationsOption();
    }

    @Then("^I verify the book is displayed to Recommendations for Students List$")
    public void verifyBookAdded(){
        bpage.verifyBookImageIsPresent();
        Assert.assertEquals(bpage.verifyBookNamePresent(),"Harry Potter and the Order of the Phoenix",
                "Wrong Book is Added to Recommendations for Students");
    }


}
