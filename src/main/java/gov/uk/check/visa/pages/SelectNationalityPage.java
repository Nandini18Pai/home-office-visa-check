package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {

    @CacheLookup

    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;


      //.SelectNationalityPage -nationalityDropDownList, nextStepButton locators
     // and create methods  'void selectNationality(String nationality)'
    //   and 'void clickNextStepButton()'


    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }

    public void clickNextStepButton() {
    clickOnElement(continueButton);
    }



}
