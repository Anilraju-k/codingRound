package elementsLacatorRepo;

import org.openqa.selenium.By;

public interface FlightBookingTest {
	
	By oneWayCheckBox=By.cssSelector("#OneWay");
	//String oneWayCheckBox="css:#OneWay";
	By originAirport=By.name("origin");
	By firstOriginOption=By.xpath("//ul[@id='ui-id-1']/li/a");
	By destinationAirport=By.name("destination");
	By firstDestinationOption=By.xpath("//ul[@id='ui-id-2']/li/a");
	By upcomingMonth1stDate=By.xpath("(//div[@class='monthBlock last']/table/tbody/tr/td/a)[text()='1']");
	By searchButton=By.id("SearchBtn");
	
}
