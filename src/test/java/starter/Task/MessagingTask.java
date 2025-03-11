package starter.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.pages.MessagePages;

public class MessagingTask {

    public static AnonymousTask MessagePage() {
        return Task.where("{0} User is on Messaging Page",
                Click.on(MessagePages.MESSAGE_PAGE)
        );
    }


    public static AnonymousTask SendMessages(String Contact, String messagingSet, String text){
        return Task.where("{0} User is able to send Messages",
                Click.on(MessagePages.SEND_MESSAGE_BUTTON),
                Click.on(MessagePages.SELECT_SMS),
                //Click.on(MessagePages.SELECT_PUSH),
                //Click.on(MessagePages.WEB_USER),
                Click.on(MessagePages.MOBILE_USER),
                Enter.theValue(Contact).into(MessagePages.CONTACT).thenHit(Keys.ENTER),
                Enter.theValue(Contact).into(MessagePages.MESSAGING_SET).thenHit(Keys.ENTER),
                Enter.theValue(Contact).into(MessagePages.TEXT).thenHit(Keys.ENTER),
                Click.on(MessagePages.NOW)
                //Click.on(MessagePages.LATER),
                // Click.on(MessagePages.PUBLISH)


                );
    }

}
