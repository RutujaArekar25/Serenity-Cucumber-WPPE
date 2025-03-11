package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import starter.Task.MessagingTask;

public class MessagingStepDefination {
    @Given("{actor} is on Messaging Page")
    public void userIsOnMessagingPage(Actor actor) {
        actor.attemptsTo(MessagingTask.MessagePage());
    }

    @And("{actor} is able to send Messages")
    public void userIsAbleToSendMessages(Actor actor) {
        actor.attemptsTo(MessagingTask.SendMessages("9325745837","other","Having issue related testing"));
    }
}
