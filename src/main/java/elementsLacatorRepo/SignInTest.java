package elementsLacatorRepo;

import org.openqa.selenium.By;
import org.testng.Assert;

public interface SignInTest {	
	
	By yourTrips=By.linkText("Your trips");
	By signIn=By.id("SignIn");
	By signInButton=By.id("signInButton");
	By loginFrame=By.id("modal_window");
	By errorMessage=By.cssSelector("#errors1 > span");
	
	
	     
}
