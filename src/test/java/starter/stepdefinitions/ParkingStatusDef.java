package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import starter.Task.ParkingTask;

public class ParkingStatusDef {

    public static WebDriver driver;
    ParkingTask parkingTask;

    @Given("{actor} is on LogIn Page")
    public void userIsOnLogInPage(Actor actor) {
        System.setProperty("WebDriver.chrome.driver", "src/test/resources/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        parkingTask = new ParkingTask(driver);
        parkingTask.openLogInPage();
    }

    @When("{actor} LogIn with valid Credential")
    public void userLogInWithValidCredential(Actor actor) {
        parkingTask.WriteCredentials();
    }

    @Then("{actor} is should be on Dashboard page")
    public void userIsShouldBeOnDashboardPage(Actor actor) {
        parkingTask.CheckVisibility();
    }

    @And("{actor} Count Parking status of all Parked-Booked-Dead-Empty")
    public void userCountParkingStatusOfAllParkedBookedDeadEmpty(Actor actor) {
        parkingTask.CountParkingStatus();
    }
}
