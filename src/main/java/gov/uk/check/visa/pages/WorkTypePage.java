package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkTypePage extends Utility {


    /**
     * WorkTypePage - nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
     * and 'void clickNextStepButton()'
     */

    @FindBy(xpath = "//label[normalize-space()='Health and care professional']")
    List<WebElement> selectJobTypeList;
        
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    
    public void selectJobType(String job) {
        for (WebElement jobType: selectJobTypeList)
              {if (jobType.getText().equalsIgnoreCase(job)){
                  clickOnElement(jobType);
                  break;
              }
        }

    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }



}
