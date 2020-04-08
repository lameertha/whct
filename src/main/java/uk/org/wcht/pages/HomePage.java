package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {
    By yourHomePageLink= By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your home')]");
    By yourCommunityLink=By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your community')]");
    By findAHomeLink=By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Find a home')]");
    By findAboutUsLink=By.xpath("//a[@class='header__nav-area-title'][contains(text(),'About us')]");
    By findHelpAndSupportLink=By.xpath("//a[contains(text(),'Help & support')]");

    public void setYourHomePageLink(){
        clickOnElement(yourHomePageLink);
    }
    public void setYourCommunityLink(){
        clickOnElement(yourCommunityLink);
    }
    public void setFindAHomeLink(){
        clickOnElement(findAHomeLink);
    }
    public void setFindAboutUsLink(){
        clickOnElement(findAboutUsLink);
    }
    public void setFindHelpAndSupportLink(){
        clickOnElement(findHelpAndSupportLink);
    }
}
