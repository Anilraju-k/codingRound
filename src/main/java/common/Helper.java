package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import elementsLacatorRepo.ObjectRepo;

public class Helper  extends Hooks implements ObjectRepo {
	
	WebDriverWait wait;
	public void clickOn(By locator){
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
		driver.findElement(locator).click();		
	}
	
	public void enterTex(By locator, String text){
		clear(locator);
		driver.findElement(locator).sendKeys(text);;		
	}
	
	public void clear(By locator){
		driver.findElement(locator).clear();		
	}
	
	@SuppressWarnings("unused")
	protected void selectByVisibleText(By travellerselection, String string) {
		// TODO Auto-generated method stub
		new Select(driver.findElement(travellerselection)).selectByVisibleText(string);
	}

	@SuppressWarnings("unused")
	protected void enterTex(By locator,Keys enter) {
		// TODO Auto-generated method stub
		driver.findElement(locator).sendKeys(enter);
	}

	
	protected String getText(By locator) {
		// TODO Auto-generated method stub
		return driver.findElement(locator).getText();
	}

	

    protected void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
}
    
    protected void switchTo(By locator) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(driver.findElement(locator));
	}
}
