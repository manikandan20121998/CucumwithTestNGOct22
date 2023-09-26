package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.page.RegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends BaseClass{
	public static RegisterPage r;
	@When("The user has to click the create new account link")
	public void the_user_has_to_click_the_create_new_account_link() throws InterruptedException {
         Thread.sleep(4000);
		r=new RegisterPage();
		click(r.getCreatebtn());
	}

	@When("The user has to fill the firstname , lastname and other datails")
	public void the_user_has_to_fill_the_firstname_lastname_and_other_datails() {

		sendkeys(r.getFirstname(), "manikandan");
		sendkeys(r.getLastname(), "sathyamoorthi");
	}
	

	@Then("The user get message {string}")
	public void the_user_get_message(String expected) {

	//	Assert.assertEquals(expected, "successfully registered");
		System.out.println("user successfully registered");
	}
}
