package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ParkingStatusPage {

    public static final Target PARKING_STATUS = Target.the("parking_status")
            .located(By.xpath("//span[text()=\"Parking History\"]"));

//Booking/Retrieval/Storage History--
    public static final Target BOOKING_HISTORY = Target.the("booking_history")
            .located(By.xpath("//span[text()=\"Booking\"]"));

    public static final Target RETRIEVAL_HISTORY =Target.the("retrieval_history")
            .located(By.xpath("//span[text()=\"Retrieval\"]"));

    public static final Target STORAGE_HISTORY =Target.the("storage_history")
            .located(By.xpath("//span[text()=\"Storage\"]"));

    public static final Target KEY_FOB = Target.the("key_fob")
            .located(By.xpath("//input[@ id =\"rc_select_2\"]"));

    public static final Target KEY_FOB_FIELD = Target.the("key_fob_field")
            .located(By.xpath("(//div[@class=\"ant-select-item-option-content\"])[1]"));

    public static final Target REQ_FIELD = Target.the("req_field")
            .located(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Request Status']]//input[@type='search']"));

    public static final Target REQ_TYPE = Target.the("req_type")
            .located(By.xpath("(//div[@class=\"ant-select-item-option-content\"])[1]"));

    public static final Target REQ_ACK =Target.the("req_ack")
            .located(By.xpath("//div[@class='ant-select-selector' and .//span[text()='Select Req ACK Status']]//input[@type='search']"));

    public static final Target REQ_ACK_TYPE = Target.the("req_ack_type")
            .located(By.xpath(""));

    public static final Target START_DATE =Target.the("start_date")
            .located(By.xpath("//input[@placeholder=\"Start date\"]"));

    public static final Target END_DATE = Target.the("end_date")
            .located(By.xpath("//input[@placeholder=\"End date\"]"));

    public static final Target GO_BITTON = Target.the("ok_button")
            .located(By.xpath("//span[text()=\"OK\"]"));

    public static final Target OKAY_BUTTON = Target.the("go_button")
            .located(By.xpath("//span[text()=\"Go\"]"));

}
