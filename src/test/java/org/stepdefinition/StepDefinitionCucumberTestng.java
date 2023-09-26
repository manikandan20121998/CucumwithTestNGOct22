package org.stepdefinition;

import java.util.NoSuchElementException;

import org.base.BaseClass;
import org.page.LoginPage;
import org.page.RegisterPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinitionCucumberTestng extends BaseClass {
	public static LoginPage l;
	@Given("The user should be in facebook page")
	public void the_user_should_be_in_facebook_page() {
	 
	}

	@When("The user has enter the {string} and {string}")
	public void the_user_has_enter_the_and(String user, String pass) {
		 l=new LoginPage();
		sendkeys(l.getTxtusername(), user);
		sendkeys(l.getPassword(), pass);
		
	}

	@When("The user has to click the {string} button")
	public void the_user_has_to_click_the_button(String button) throws InterruptedException {
    if(button.equals("login")) {
    	click(l.getBtnlogin());
    }
    else if(button.equals("signup")) {
    	click(RegisterSteps.r.getSignup());
    }
    else {
    	NoSuchElementException e=new NoSuchElementException();
    	throw e;
    }
      Thread.sleep(3000);
	}

	@Then("The user should be in invalid login page")
	public void the_user_should_be_in_invalid_login_page() throws InterruptedException {
		waitforurl("privacy", 20);
		Assert.assertTrue("verify url",currenturl().contains("privacy"));
		System.out.println("user invalid page");
     System.out.println("done");
	}
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
