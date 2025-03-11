package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import starter.Task.ParkingStatusTask;

public class ParkingStatusDefination {
    @Given("{actor} is on parking status Page")

    public void userIsOnParkingStatusPage(Actor actor) {
        actor.attemptsTo(ParkingStatusTask.ParkingStatus());
    }

    @And("{actor} Search parking history by inputs")
    public void userSearchParkingHistoryByInputs(Actor actor) {
        actor.attemptsTo(ParkingStatusTask.BookingHistory("20 - Sedan","CANCELLED","5003: Request Cancelled: Acknowledgement Not Received.","17-12-2024 18:21","11-12-2024 15:39"));
    }

    @And("{actor} Search Retrieval history by inputs")
    public void userSearchRetrievalHistoryByInputs(Actor actor) {
        actor.attemptsTo(ParkingStatusTask.RetrievalHistory("20 - Sedan","CANCELLED","5002: Request Cancelled: No confirmation received by user.","03-01-2025 16:10","03-01-2025 16:05"));
    }

    @And("{actor} Search Storage history by inputs")
    public void userSearchStorageHistoryByInputs(Actor actor) {
        actor.attemptsTo(ParkingStatusTask.StorageHistory("20 - Sedan","CANCELLED","5002: Request Cancelled: No confirmation received by user.","03-01-2025 16:10","03-01-2025 16:10"));

    }

}
