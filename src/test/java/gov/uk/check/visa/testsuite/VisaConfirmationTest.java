package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VisaConfirmationTest extends BaseTest {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;


    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }

    @Test(groups = {"Smoke", "Sanity", "Regression"})
    public void anAustralianComingToUKForTourism() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clickNextStepButton();
        //verify result 'You will not need a visa to come to the UK'

        String expectedResult = "You will not need a visa to come to the UK";
        String actualResult = resultPage.getResultMessage();
        Assert.assertEquals(actualResult, expectedResult);


    }

    //Click on start button
    //Select a Nationality 'Australia'
    // Click on Continue button
    // Select reason 'Tourism'
    // Click on Continue button
    // verify result 'You will not need a visa to come to the UK'

    @Test(groups = {"Regression"})

    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {

        startPage.clickStartNow();   // Click on start button
        selectNationalityPage.selectNationality("Chile");   //Select a Nationality 'Chile'
        selectNationalityPage.clickNextStepButton();   // Click on Continue button
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");  // Select reason 'Work, academic visit or business'
        reasonForTravelPage.clickNextStepButton();   //  Click on Continue button
        durationOfStayPage.selectLengthOfStay("longer than 6 months");  // Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.clickNextStepButton();          // Click on Continue button
        workTypePage.selectJobType("Health and care professional");           //  Select have planning to work for 'Health and care professional'
        workTypePage.clickNextStepButton(); // Click on Continue button
        // verify result 'You need a visa to work in health and care'
        String expectedResult = "You need a visa to work in health and care";
        String actualResult = resultPage.getResultTextMessage();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test(groups = {"Sanity", "Regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        startPage.clickStartNow();   // Click on start button
        selectNationalityPage.selectNationality("Comoros");   //Select a Nationality ''Colombia''
        selectNationalityPage.clickNextStepButton();   // Click on Continue button
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickNextStepButton();
        //Select state My partner of family member have uk immigration status 'yes'
        familyImmigrationStatusPage.selectImmigrationStatus("Yes");
        familyImmigrationStatusPage.clickNextStepButton();

        String expectedResult = "You’ll need a visa to join your family or partner in the UK";
        String actualResult =  resultPage.getResultTextMessages();
        Assert.assertEquals(expectedResult, actualResult);

    }


}
