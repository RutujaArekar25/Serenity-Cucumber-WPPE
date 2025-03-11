package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import starter.Task.UserManagementTask;

public class UserManagementDefination {

    @Given("{actor} is on user management Page")
    public void userIsOnUserManagementPage(Actor actor) {
        actor.attemptsTo(UserManagementTask.UserManagementPage());
    }

    @And("{actor} Search Web users by userName")
    public void userSearchWebUsersByUserName(Actor actor) {
        actor.attemptsTo(UserManagementTask.WebUsers("Mahesh Shitut"));
    }

    @And("{actor} Search mobile users by userName")
    public void userSearchMobileUsersByUserName(Actor actor) {
        actor.attemptsTo(UserManagementTask.MobileUsers("Mahesh Shitut"));
    }

    @And("{actor} Search visitor users by userName")
    public void userSearchVisitorUsersByUserName(Actor actor) {
        actor.attemptsTo(UserManagementTask.VisitorUsers("Mahesh Shitut"));
    }
}

