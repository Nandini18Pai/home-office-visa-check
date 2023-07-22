package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {

    @FindBy(css = "h2[class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;

    @FindBy(xpath = " //h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessage1;

    @FindBy(xpath = " //h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement resultMessage2;



    //ResultPage - resultMessage locator and create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)

    public String getResultMessage() {
        return getTextFromElement(resultMessage);
    }


    public void confirmResultMessage(String expectedMessage) {
        Assert.assertTrue(getResultMessage().equalsIgnoreCase(expectedMessage));
    }


    public String getResultTextMessage() {
        return getTextFromElement(resultMessage1);
    }


    public String getResultTextMessages() {
        return getTextFromElement(resultMessage2);
    }


}
