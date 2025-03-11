package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import starter.Task.DashboardTask;
import starter.Task.LogInTask;
import starter.navigation.NavigateTo;

public class LogIn_DashboardDefination {

    @Steps
    DashboardTask dashboardTask;

    @Given("{actor} is on HomePage to LogIn")
    public void userIsOnHomePageToLogIn(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} LogIn with valid Credentials")
    public void userLogInWithValidCredentials(Actor actor) {
        actor.attemptsTo(LogInTask.withCred("1005", "Test@1234"));
    }

    @Then("{actor} is should be on Dashboard")
    public void userIsShouldBeOnDashboard(Actor actor) {
        actor.attemptsTo(DashboardTask.DashboardPage());
    }

    @And("{actor} Should select customer")
    public void userShouldSelectCustomer(Actor actor) {
        actor.attemptsTo(DashboardTask.selectCustomer());
    }

    @And("{actor} should select Location")
    public void userShouldSelectLocation(Actor actor) {
        actor.attemptsTo(DashboardTask.selectLocation());
    }

    @And("{actor} added Visitor")
    public void userAddedVisitor(Actor actor) {
        actor.attemptsTo(DashboardTask.AddVisitor("kalpataru-Santacruz East", "102 - SUV - 4,680 mm x 1,850 mm x 1,670 mm", "SamsanAkash123", "9921870968", "Akash", "Vatane"));
    }

    @When("{actor} Expand the sections")
    public void userExpandTheSections(Actor actor) {
        actor.attemptsTo(DashboardTask.Expand());
    }

    @When("User LogIn with valid Credentials {string} and {string}")
    public void userLogInWithValidCredentials(String username, String password) {
        LogInTask.withCred(username, password);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @Steps
    LogInTask logInTask;

    @Given("the user navigates to the login page")
    public void navigateToLoginPage() {
        NavigateTo.theSearchHomePage();
    }

    @When("the user enters username {string} and password {string}")
    public void enterCredentials(String username, String password) {
        logInTask.EnterCred(username , password);
    }

//    @When("user matches the values of parking status with Pie chart")
//    public void userMatchesTheValuesOfParkingStatusWithPieChart() {
//        DashboardTask.getParkingStatus();
////        DashboardTask.getParked();
////        DashboardTask.getEmpty();
////        DashboardTask.getDead();
////        DashboardTask.getBooked();
//    }
//

    @When("User expands parking status")
    public void userExpandsParkingStatus() {
        DashboardTask.ExpandParkingStatus();
    }

    @And("User Count Parking status of Parked-Booked-Dead-Empty")
    public void userCountParkingStatusOfParkedBookedDeadEmpty() {
        DashboardTask.CountParkingStatus();
    }

    @Then("User Close the parking status")
    public void userCloseTheParkingStatus() {
        DashboardTask.CloseParkingStatus();
    }

    @And("User count occupancy status of Parked-Booked-Dead-Empty")
    public void userCountOccupancyStatusOfParkedBookedDeadEmpty() {
        DashboardTask.CountOccupancyStatus();
    }

    @Then("user verifies the background colors for All allocations")
    public void userVerifiesTheBackgroundColorsForALLAllocations() {
        DashboardTask.CountAllocations();
    }

    @And("User compare the values of Parking status and occupancy")
    public void userCompareTheValuesOfParkingStatusAndOccupancy() {
        DashboardTask.assertion();
    }

}
