package Pages;

import org.openqa.selenium.By;

public class BookRecommend extends BasePage{

    By searchBox = By.xpath("//input[@data-placeholder='Search by Title, Author, Item # or Keyword']");
    By searchButton = By.xpath("//i[@class='fa fa-search']");
    By notification = By.xpath("//span[@class='tooltipster-close ']");
    By quick = By.xpath("//a[@title='Harry Potter and the Order of the Phoenix']/following-sibling::a[@class='quickview']");
    By star = By.xpath("//i[@class='fa fa-star-o fa-2x']");
    By recBox = By.xpath("//input[@class='wishlist-dialog-checkbox recommended']/parent::label");
    By closeBox = By.xpath("//span[@class='tooltipster-close ']");
    By closeQuickLookBox = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");
    By lists = By.xpath("//span[@class='fa-arrowdown']/preceding-sibling::span[text()='My Lists']");
    By rec= By.xpath("//li[@class='recommend']");
    By bookImage = By.xpath("//img[@title='Harry Potter and the Order of the Phoenix']");
    By bookName = By.xpath("//a[@class='quickview']/parent::div[@class='name ']");
    By notif2 = By.xpath("//span[@class='tooltipster-close ']");
    By bookImg = By.xpath("//img[@title='Harry Potter and the Order of the Phoenix']");

    public void enterTextIntoSearch(String value){
        waitUntilClickable(notification);
        typeText(searchBox,value);
    }

    public void search(){
        waitUntilClickable(notif2);
        clickThis(searchButton);
    }

    public void quickLook(){
        scrollMiddle();
        hoverOver(bookImg);
        waitUntilClickable(quick);
    }

    public void recommendStar(){
        clickThis(star);
    }

    public void recommendBox(){
        waitUntilClickable(recBox);
    }

    public void closeAddBox(){
        waitUntilClickable(closeBox);
    }

    public void closeQLBox(){
        waitUntilClickable(closeQuickLookBox);
    }

    public void MyLists(){
        scrollUp();
        clickThis(lists);
    }

    public void recommendationsOption(){
        clickThis(rec);
    }

    public void verifyBookImageIsPresent(){
        isElementDisplayed(bookImage);
    }

    public String verifyBookNamePresent(){
        return getTextValue(bookName);
    }

}
