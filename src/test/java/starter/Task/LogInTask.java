package starter.Task;

import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.pages.LogInPages;

public class LogInTask {

    static LogInPages logInPages = new LogInPages();

    public static AnonymousTask withCred(String username, String password) {
        System.out.println("Username***: " + username);
        System.out.println("Password***: " + password);
        return Task.where("{0} logs in with valid credentials",
//                Enter.theValue(username).into(logInPages.USERNAME_FIELD),
//                Enter.theValue(password).into(logInPages.PASSWORD_FIELD),
//                Click.on(logInPages.LOGIN_BUTTON));

                WaitUntil.the(logInPages.USERNAME_FIELD, WebElementStateMatchers.isVisible()).forNoMoreThan(2).seconds(),
                Enter.theValue(username).into(logInPages.USERNAME_FIELD),
                WaitUntil.the(logInPages.PASSWORD_FIELD, WebElementStateMatchers.isVisible()).forNoMoreThan(2).seconds(),
                Enter.theValue(password).into(logInPages.PASSWORD_FIELD),
                WaitUntil.the(logInPages.LOGIN_BUTTON, WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(logInPages.LOGIN_BUTTON));
    }

    public void EnterCred(String username, String password) {
                Enter.theValue(username).into(logInPages.USERNAME_FIELD);
                Enter.theValue(password).into(logInPages.PASSWORD_FIELD);
                Click.on(logInPages.LOGIN_BUTTON);
    }

}
