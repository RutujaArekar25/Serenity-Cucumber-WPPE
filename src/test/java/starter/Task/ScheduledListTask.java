package starter.Task;

import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.pages.ScheduledListPages;

public class ScheduledListTask {

    public static AnonymousTask ScheduledList() {
        return Task.where("Get Scheduled List ",
                Click.on(ScheduledListPages.SCHEDULED_BUTTON)
        );
    }

    public static AnonymousTask BookingList() {
        return Task.where("Get Scheduled List of Booking ",
                Click.on(ScheduledListPages.BOOKING_BUTTON)
        );
    }

    public static AnonymousTask RetrievalList() {
        return Task.where("Get Scheduled List of Retrieval ",
                Click.on(ScheduledListPages.RETRIEVAL_BUTTON)
        );
    }
}
