package tests;
import common.Helper;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends Helper{

   

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
		clickOn(yourTrips);
		clickOn(signIn);
		switchTo(loginFrame);
		clickOn(signInButton);
		Assert.assertEquals(getText(errorMessage), "There were errors in your submission");
		       
    }

	

	
}
