package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import starter.Task.ConcurrentRequestTask;

public class ConcurrentRequestDefination {

    @Given("{actor} is on Concurrent Request Page")
    public void userIsOnConcurrentRequestPage(Actor actor) {
        actor.attemptsTo(ConcurrentRequestTask.ConcurrentPage());
    }

    @And("{actor} is able to send Concurrent Request")
    public void userIsAbleToSendConcurrentRequest(Actor actor) {
        actor.attemptsTo(ConcurrentRequestTask.AddConcurrentRequest("44","60"));
    }
}
