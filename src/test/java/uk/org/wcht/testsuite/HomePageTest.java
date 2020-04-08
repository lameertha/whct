package uk.org.wcht.testsuite;

import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

public class HomePageTest extends TestBase {
    HomePage homePage=new HomePage();
    @Test
    public void verifyUserShouldNavigateToYourHomePage(){
        homePage.setYourHomePageLink();
    }
    @Test
    public void verifyUserShouldNavigateToYourCommunityPage(){
        homePage.setYourCommunityLink();
    }
    @Test
    public void verifyUserShouldNavigateToFindAHomePage(){
        homePage.setFindAHomeLink();
    }
    @Test
    public void verifyUserShouldNavigateToAboutUsPage(){
        homePage.setFindAboutUsLink();
    }
    @Test
    public void verifyUserShouldNavigateToHelpAndSupportPage(){
        homePage.setFindHelpAndSupportLink();
    }
}
