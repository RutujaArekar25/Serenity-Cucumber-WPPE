package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import starter.Task.ScheduledListTask;

public class ScheduledListDefination {

    @Given("{actor} is on Scheduled List")
    public void userIsOnScheduledList(Actor actor) {
        actor.attemptsTo(ScheduledListTask.ScheduledList());
    }

    @And("{actor} Search Booking List by userName")
    public void userSearchBookingListByUserName(Actor actor) {
        actor.attemptsTo(ScheduledListTask.BookingList());
    }

    @And("{actor} Search Retrieval List by userName")
    public void userSearchRetrievalListByUserName(Actor actor) {
        actor.attemptsTo(ScheduledListTask.RetrievalList());
    }
}
