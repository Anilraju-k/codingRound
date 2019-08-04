package elementsLacatorRepo;

import org.openqa.selenium.By;

public interface HotelBooking {	
	By hotelLink=By.linkText("Hotels");
	By localityTextBox=By.id("Tags");
    By searchHotels=By.id("SearchHotelsButton");
    By travellerSelection=By.id("travellersOnhome");   
}
