package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
 * (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
 */


public class FamilyImmigrationStatusPage extends Utility {


    @CacheLookup

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement statusYes;

    @FindBy(xpath = "//input[@id='response-1'] ")
    WebElement statusNo;


    public void selectImmigrationStatus(String immigrationStatus) {

        switch (immigrationStatus) {
            case "Yes":
                clickOnElement(statusYes);
                break;
            case "No":
                clickOnElement(statusNo);
                break;

        }

    }

    public void clickNextStepButton() {
        clickOnElement(continueButton);

    }


}
