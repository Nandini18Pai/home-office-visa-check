package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
 * void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
 * 'void clickNextStepButton()'
 */


public class DurationOfStayPage extends Utility {

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                break;
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
        }
    }


    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }







}
