package tests;
import common.Helper;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HotelBookingTest extends Helper {

  

    
    @Test
    public void shouldBeAbleToSearchForHotels() {    

        clickOn(hotelLink);
        enterTex(localityTextBox, "Indiranagar, Bangalore");
        waitFor(3000);
        selectByVisibleText(travellerSelection,"1 room, 2 adults");
        waitFor(3000);
        clickOn(searchHotels);
        waitFor(5000); 

    }

	
	
}