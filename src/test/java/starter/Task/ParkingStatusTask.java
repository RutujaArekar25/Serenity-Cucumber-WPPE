package starter.Task;

import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.pages.ParkingStatusPage;

public class ParkingStatusTask {
    public static AnonymousTask ParkingStatus() {
        return Task.where("{0} user is on parking status",
                Click.on(ParkingStatusPage.PARKING_STATUS)
        );
    }

    public static AnonymousTask BookingHistory(String keyFob, String reqType, String reqAckType, String startDate, String endDate) {
                return Task.where("{0} Get List of Booking History",
                Click.on(ParkingStatusPage.BOOKING_HISTORY),

                Click.on(ParkingStatusPage.KEY_FOB),
                Enter.theValue(keyFob).into(ParkingStatusPage.KEY_FOB).thenHit(Keys.ENTER),
                        //Click.on(ParkingStatusPage.KEY_FOB),

                Click.on(ParkingStatusPage.REQ_FIELD),
                Enter.theValue(reqType).into(ParkingStatusPage.REQ_FIELD).thenHit(Keys.ENTER),
                //Click.on(ParkingStatusPage.REQ_TYPE),

                Click.on(ParkingStatusPage.REQ_ACK),
                Enter.theValue(reqAckType).into(ParkingStatusPage.REQ_ACK).thenHit(Keys.ENTER),
                //Click.on(ParkingStatusPage.REQ_ACK_TYPE),

                Click.on(ParkingStatusPage.START_DATE),
                Enter.theValue(startDate).into(ParkingStatusPage.START_DATE).thenHit(Keys.ENTER),

                Click.on(ParkingStatusPage.END_DATE),
                Enter.theValue(endDate).into(ParkingStatusPage.END_DATE).thenHit(Keys.ENTER),

                Click.on(ParkingStatusPage.OKAY_BUTTON),
                Click.on(ParkingStatusPage.GO_BITTON)
                );
     }

    public static AnonymousTask RetrievalHistory(String keyFob, String reqType, String reqAckType, String startDate, String endDate) {
        return Task.where("{0} Get List of Retrieval History",
                Click.on(ParkingStatusPage.RETRIEVAL_HISTORY),

                Click.on(ParkingStatusPage.KEY_FOB),
                Enter.theValue(keyFob).into(ParkingStatusPage.KEY_FOB).thenHit(Keys.ENTER),
                //Click.on(ParkingStatusPage.KEY_FOB),

                Click.on(ParkingStatusPage.REQ_FIELD),
                Enter.theValue(reqType).into(ParkingStatusPage.REQ_FIELD).thenHit(Keys.ENTER),
                //Click.on(ParkingStatusPage.REQ_TYPE),

                Click.on(ParkingStatusPage.REQ_ACK),
                Enter.theValue(reqAckType).into(ParkingStatusPage.REQ_ACK).thenHit(Keys.ENTER),
                //Click.on(ParkingStatusPage.REQ_ACK_TYPE),

                Click.on(ParkingStatusPage.START_DATE),
                Enter.theValue(startDate).into(ParkingStatusPage.START_DATE).thenHit(Keys.ENTER),

                Click.on(ParkingStatusPage.END_DATE),
                Enter.theValue(endDate).into(ParkingStatusPage.END_DATE).thenHit(Keys.ENTER),

                Click.on(ParkingStatusPage.OKAY_BUTTON),
                Click.on(ParkingStatusPage.GO_BITTON)
        );
    }

    public static AnonymousTask StorageHistory(String keyFob, String reqType, String reqAckType, String startDate, String endDate) {
        return Task.where("{0} Get List of Storage History",
                Click.on(ParkingStatusPage.STORAGE_HISTORY),

                Click.on(ParkingStatusPage.KEY_FOB),
                Enter.theValue(keyFob).into(ParkingStatusPage.KEY_FOB).thenHit(Keys.ENTER),
                //Click.on(ParkingStatusPage.KEY_FOB),

                Click.on(ParkingStatusPage.REQ_FIELD),
                Enter.theValue(reqType).into(ParkingStatusPage.REQ_FIELD).thenHit(Keys.ENTER),
                //Click.on(ParkingStatusPage.REQ_TYPE),

                Click.on(ParkingStatusPage.REQ_ACK),
                Enter.theValue(reqAckType).into(ParkingStatusPage.REQ_ACK).thenHit(Keys.ENTER),
                //Click.on(ParkingStatusPage.REQ_ACK_TYPE),

                Click.on(ParkingStatusPage.START_DATE),
                Enter.theValue(startDate).into(ParkingStatusPage.START_DATE).thenHit(Keys.ENTER),

                Click.on(ParkingStatusPage.END_DATE),
                Enter.theValue(endDate).into(ParkingStatusPage.END_DATE).thenHit(Keys.ENTER),

                Click.on(ParkingStatusPage.OKAY_BUTTON),
                Click.on(ParkingStatusPage.GO_BITTON)
        );
    }
}
