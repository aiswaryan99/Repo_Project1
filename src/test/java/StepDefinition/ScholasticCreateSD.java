package StepDefinition;

import DriverWrapper.Web;
import Pages.AfterLoginPage;
import Pages.BasePage;
import Pages.LandingPage;
import Pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ScholasticCreateSD extends BasePage {

    LandingPage lpage = new LandingPage();
    AfterLoginPage apage = new AfterLoginPage();
    MyAccountPage mpage = new MyAccountPage();

    @Given("^I am on landing page$")
    public void verifyLandingPage() {
        Assert.assertEquals(Web.getDriver().getTitle(),
                "Scholastic Book Clubs | Children's Books for Parents and Teachers");
    }

    @When("^I click on Create an Account$")
    public void clickOnCreate() {
        lpage.clickCreateAccount();
    }

    @And("^I click on Teacher/Administrator/Homeschooler$")
    public void clickTeachAdmin() {
        lpage.clickOnTeacherAdmin();
    }

    @And("^I click on Next Button$")
    public void clickOnNextButton() {
        lpage.setClickOnNextButton();
    }

    @Then("^I select '(.+\\.)' in Title dropdown$")
    public void selectTitle(String title) {
        lpage.selectTitleDropdown(title);
    }

    @And("^I enter first name as '(.+)'$")
    public void firstName(String name) {
        lpage.firstName(name);
    }

    @And("^I enter last name as '(.+)'$")
    public void lastName(String lname) {
        lpage.lastName(lname);
    }

    @And("^I enter email as '(.+)'$")
    public void enterEmailAdd(String email) {
        lpage.enterEmail(email);
    }

    @And("^I enter password as '(.+)'$")
    public void enterPassword(String pass) {
        lpage.enterPass(pass);
    }

    @And("^I click the box for terms and accept$")
    public void clickOnCheckBox() {
        lpage.clickBox();
    }

    @Then("^I click on Next button$")
    public void clickNextButton() {
        lpage.clickOnNextButton();
    }

    @Then("^I enter zipcode as '(.+)'$")
    public void enterZipCode(String zipcode) {
        lpage.enterZip(zipcode);
    }

    @And("^I click on search button$")
    public void clickOnSearchButton() {
        lpage.clickSearchButton();
    }

    @Then("^I enter '(.+)' School Name field$")
    public void searchSchool(String name) {
        lpage.typeSchoolName(name);
    }

    @And("^I click on '(.+)'$")
    public void clickSchool(String school) {
        lpage.selectSchoolName(school);
    }

    @Then("^I click on Next Button after selecting School$")
    public void clickNextAgain() {
        lpage.clickOnNextAgain();
    }

    @Then("^I select role as 'Teacher \\(by Grade\\)'$")
    public void selectByGrade() {
        lpage.pickRole();
    }

    @Then("^I select the grade as '(.+)'$")
    public void selectGrade(String grade){
        lpage.pickGrade(grade);
    }

    @And("^I enter number of students as '(.+)'$")
    public void enterNumStudents(String num){
        lpage.numS(num);
    }

    @And("^I click on the next button$")
    public void clickOnRoleNext(){
        lpage.nextAgainRole();
    }

    @Then("^I select '(.+)' as preferred reading level$")
    public void selectReadingLevel(String level) {
        lpage.selectRead(level);
    }

    @And("^I click on Continue to Site button$")
    public void clickContinueToSite(){
        lpage.continueToSiteButton();
    }

    @Then ("^I obtain class code after logging in$")
    public String  getClassCodeOnAfterLogin(){
        return apage.getClassCode();
    }

    @And("^I obtain class code from my account page$")
    public void verifyClassCodeMyAccount() {
        apage.myAccountBox();
        apage.myProfileBox();
        mpage.classCodeAccount();
    }

    @Then("^I verify the class code in the same on Login Page and My Account Page$")
    public void verifyClassCodeIsEqual(){
        Assert.assertEquals(getClassCodeOnAfterLogin(),mpage.classCodeAccount(),
                "The class codes on Home Page and My Account Page are different");
    }

    @And("^I verify the teacher's name is present and is the same as created$")
    public void verifyTeacherName(){
        mpage.teacherNameIsPresent();
        Assert.assertEquals(mpage.teacherName(),"Mrs. Aiswarya Nair","The teacher's name is not as created");
    }

    @And ("^I verify the school address is present and is the same as created$")
    public void verifySchoolAddress(){
        mpage.schoolAddressIsPresent();
        Assert.assertEquals(mpage.schoolAddressText(),
                "SCHOLASTIC+BOOK+CLUBS\n" +
                "568 Broadway # 2\n" +
                "New York, NY 10012","The address is not the same as when created");
    }

    @Then("^I click '(.+)' as state$")
    public void clickState(String state){
        lpage.searchByState(state);
    }

    @And("^I click on '(.+)' as city$")
    public void clickCity(String city){
        lpage.searchCity(city);
    }

    @And("^I click on Search Button$")
    public void clickOnSearch(){
        lpage.clickS();
    }

}
