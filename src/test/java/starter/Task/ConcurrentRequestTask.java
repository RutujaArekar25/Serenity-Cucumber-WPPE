package starter.Task;

import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.pages.ConcurrentRequestPages;

public class ConcurrentRequestTask {
    public static AnonymousTask ConcurrentPage() {
        return Task.where("{0} The user is on Concurrent Request",
                Click.on(ConcurrentRequestPages.CONCURRENT_PAGE)
        );

    }

    public static AnonymousTask AddConcurrentRequest(String Booking, String Retrieval) {
            return Task.where("{0} The user is able to send Concurrent Request",
                    Click.on(ConcurrentRequestPages.CUSTOMER_ID),
                    Click.on(ConcurrentRequestPages.CUSTOMER),
                    Click.on(ConcurrentRequestPages.LOCATION_ID),
                    Click.on(ConcurrentRequestPages.LOCATION),
                    Enter.theValue(Booking).into(ConcurrentRequestPages.BOOKING_FIELD).thenHit(Keys.ENTER),
                    Enter.theValue(Retrieval).into(ConcurrentRequestPages.RETRIEVAL_FIELD).thenHit(Keys.ENTER)
                   // Click.on(ConcurrentRequestPages.SUBMIT_CONCURRENT)
            );
    }
}
