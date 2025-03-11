package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.Task.OngoingQueueTask;

public class ongoingQueueDefinations {

    @Given("{actor} is on Ongoing Queue status")
    public void userIsOnOngoingQueueStatus(Actor actor) {
        actor.attemptsTo(OngoingQueueTask.OngoingQueue());

    }

    @And("{actor} add Retrieval Request")
    public void userAddRequest(Actor actor) {
        actor.attemptsTo(OngoingQueueTask.AddRetrievalRequest("2044"));
    }

    @And("{actor} add Booking Request")
    public void userAddBookingRequest(Actor actor) {
        actor.attemptsTo(OngoingQueueTask.AddBookingRequest("2044"));
    }

    @And("{actor} cancel the request")
    public void userCancelTheRequest(Actor actor) {
        actor.attemptsTo(OngoingQueueTask.CancelRequst("Rutuja"));
    }
}
