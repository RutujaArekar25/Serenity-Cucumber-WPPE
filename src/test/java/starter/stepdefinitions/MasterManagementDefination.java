package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.Task.MasterManagementTask;

public class MasterManagementDefination {
    @Given("{actor} is on Master management page")
    public void userIsOnMasterManagementPage(Actor actor) {
        actor.attemptsTo(MasterManagementTask.MasterManagement());
    }

    @And("{actor} search customer master by username")
    public void userSearchCustomerMasterByUsername(Actor actor) {
        actor.attemptsTo(MasterManagementTask.CustomerMaster("Amar Patil"));
    }

    @And("{actor} search customer Location master by username")
    public void userSearchCustomerLocationMasterByUsername(Actor actor) {
        actor.attemptsTo(MasterManagementTask.CustomerLocationMaster("Amar Patil"));
    }

    @And("{actor} search Notification by input")
    public void userSearchNotificationByInput(Actor actor) {
        actor.attemptsTo(MasterManagementTask.NotificationMaster("REJECTED_CANCEL_BOOKING_REQUEST"));
    }

    @And("{actor} search FAQ by input")
    public void userSearchFAQByInput(Actor actor) {
        actor.attemptsTo(MasterManagementTask.FAQMaster("What if I want to remove a family member?"));
    }

    @And("{actor} search customer client master by username")
    public void userSearchCustomerClientMasterByUsername(Actor actor) {
        actor.attemptsTo(MasterManagementTask.CustomerClientMaster("Diya Patel"));
    }

    @When("{actor} add customer client")
    public void userAddCustomerClient(Actor actor) {
        actor.attemptsTo(MasterManagementTask.AddCustomerClientMaster("Axis Bank","1000","Pooja Chavan","9373594172","poojachavan@1234"));
    }

    @When("{actor} update customer client")
    public void userUpdateCustomerClient(Actor actor) {
        actor.attemptsTo(MasterManagementTask.UpdateCustomerClientMaster("Diya Patel","Axis Bank","1000","Pooja Chavan","9373594172","poojachavan@1234"));
    }

    @When("{actor} get the all details using keyFob Token")
    public void userGetTheAllDetailsUsingKeyFobToken(Actor actor) {
        actor.attemptsTo(MasterManagementTask.KeyFob("3006"));
    }

    @When("{actor} add key fob")
    public void userAddKeyFob(Actor actor) {
        actor.attemptsTo(MasterManagementTask.AddKeyFob("5000", "Sedan - 1"));
    }

    @When("{actor} get the all details of key fob allocations using input")
    public void userGetTheAllDetailsOfKeyFobAllocationsUsingInput(Actor actor) {
        actor.attemptsTo(MasterManagementTask.KeyFoballocations("5000"));
    }

    @When("{actor} is able to add key fob allocations")
    public void userIsAbleToAddKeyFobAllocations(Actor actor) {
        actor.attemptsTo(MasterManagementTask.AddKeyFoballocations("Axis Bank","2044 - Sedan - 4,680 mm x 1,850 mm x 1,670 mm","Samsan123","9325745837","Rutuja","Arekar"));
    }

}
