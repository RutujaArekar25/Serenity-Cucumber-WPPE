package starter.Task;

import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.pages.OngoingQueuePages;

public class OngoingQueueTask {

    public static AnonymousTask OngoingQueue() {
        return Task.where("{0} User is on ongoing queue",
         Click.on(OngoingQueuePages.ONGOING_QUEUE),
         Click.on(OngoingQueuePages.REFRESH)
                );
    }

    public static AnonymousTask AddRetrievalRequest(String keyFob) {
        return Task.where("{0} Add Retrieval Request",
                Click.on(OngoingQueuePages.ADD_REQUEST),
                Click.on(OngoingQueuePages.REQUEST_TYPE),
                Click.on(OngoingQueuePages.RETRIEVAL),
                Enter.theValue(keyFob).into(OngoingQueuePages.KEY_FOB).thenHit(Keys.ENTER),
                Click.on(OngoingQueuePages.VERIFY_KEY_FOB)
                //Click.on(OngoingQueuePages.USERNAME)
                //Click.on(OngoingQueuePages.SUBMIT_REQUEST)
                );
    }

    public static AnonymousTask AddBookingRequest(String keyFob1) {
        return Task.where("{0} Add Booking Request",
                Click.on(OngoingQueuePages.ADD_REQUEST),
                Click.on(OngoingQueuePages.REQUEST_TYPE),
                Click.on(OngoingQueuePages.BOOKING),
                Enter.theValue(keyFob1).into(OngoingQueuePages.KEY_FOB).thenHit(Keys.ENTER),
                Click.on(OngoingQueuePages.VERIFY_KEY_FOB)
                //Click.on(OngoingQueuePages.USERNAME)
                //Click.on(OngoingQueuePages.SUBMIT_REQUEST)
        );

    }

    public static AnonymousTask CancelRequst(String userName) {
        return Task.where("{0} Cancel the Request",
                Enter.theValue(userName).into(OngoingQueuePages.SEARCH_FIELD).thenHit(Keys.ENTER),
                Click.on(OngoingQueuePages.SEARCH_BUTTON),
                Click.on(OngoingQueuePages.CANCEL_BUTTON),
                Click.on(OngoingQueuePages.YES_BUTTON)
        );

    }
}
