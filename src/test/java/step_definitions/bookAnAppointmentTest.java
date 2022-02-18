 package step_definitions;

import io.cucumber.java.en.*;


public class bookAnAppointmentTest {


	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("hi");
	}

	@When("I complete action1")
	public void i_complete_action1() {
	    System.out.println("hekko");
	}

	@Then("I complete action")
	public void i_complete_action() {
	   System.out.println("jhjhk");
	}

	
}

