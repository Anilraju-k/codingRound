package tests;

import common.Helper;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightBookingTest extends Helper{



	@Test
	public void testThatResultsAppearForAOneWayJourney() {

		clickOn(oneWayCheckBox);
		enterTex(originAirport, "Bangalore");
		//wait for the auto complete options to appear for the origin
		waitFor(4000);
		//System.out.println(driver.findElement(firstOriginOption).getText());
		clickOn(firstOriginOption);
		enterTex(destinationAirport, "Delhi");
		waitFor(4000);
		//select the first item from the destination auto complete list
		clickOn(firstDestinationOption);
		// wait for id=ui-datepicker-div
		clickOn(upcomingMonth1stDate);
		clickOn(searchButton);
		waitFor(5000);
		//verify that result appears for the provided journey search
		Assert.assertTrue(isElementPresent(By.className("searchSummary")));
	}


}



