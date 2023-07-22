package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    @CacheLookup

    @FindBy(xpath = "//div[@class='govuk-radios']//label")
   List<WebElement> reasonForVisitList;

   // By reasonForVisitList = By.xpath("//input[@type='radio']");


    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickNextStepButton;

    // ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
    // and  'void clickNextStepButton()'


   public void selectReasonForVisit(String reason) {
       // List<WebElement> allOptions = reasonForVisitList;
        for (WebElement options : reasonForVisitList) {
            if (options.getText().equalsIgnoreCase(reason)) {
              clickOnElement(options);
                break;
            }
        }
    }

    public void clickNextStepButton() {
        clickOnElement(clickNextStepButton);

    }




}



