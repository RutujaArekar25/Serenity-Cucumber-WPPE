package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OngoingQueuePages extends PageObject {

    //Ongoing Queue---
    public static final Target ONGOING_QUEUE = Target.the("Ongoing_Queue")
            .located(By.xpath("//span[text()=\"Ongoing Queue\"]"));

    public static final Target REFRESH = Target.the("refresh")
            .located(By.xpath("//span[text()=\"Refresh\"]"));

    //Add Request--
    public static final Target ADD_REQUEST = Target.the("AddRequest")
            .located(By.xpath("//span[text()=\"Add Request\"]"));

    public static final Target REQUEST_TYPE = Target.the("RequestType")
            .located(By.xpath("//input[@id=\"request_type_id\"]"));

    public static final Target RETRIEVAL = Target.the("Retrieval")
            .located(By.xpath("//div[text()=\"Retrieval\"]"));

    public static final Target BOOKING = Target.the("Booking")
            .located(By.xpath("//div[text()=\"Booking\"]"));

    public static final Target KEY_FOB = Target.the("KeyFob")
            .located(By.xpath("//input[@name=\"keyFOB\"]"));

    public static final Target VERIFY_KEY_FOB = Target.the("verifyKeyFob")
            .located(By.xpath("//span[text()=\"Verify KeyFob\"]"));

    public static final Target USERNAME = Target.the("UserName")
            .located(By.xpath(""));

    public static final Target SUBMIT_REQUEST = Target.the("Submit")
            .located(By.xpath("//span[text()=\"Submit\"]"));

//Cancel Requst---
    public static final Target SEARCH_FIELD = Target.the("search_field")
            .located(By.xpath("//input[@class=\"ant-input\"]"));

    public static final Target SEARCH_BUTTON =  Target.the("search_button")
            .located(By.xpath("//span[@aria-label=\"search\"]"));

    public static final Target CANCEL_BUTTON = Target.the("cancel_button")
            .located(By.xpath("//span[text()=\"Cancel\"]"));

    public static final Target YES_BUTTON = Target.the("Confirmation")
            .located(By.xpath("//span[text()=\"Yes\"]"));

}