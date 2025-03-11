package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ScheduledListPages extends PageObject {
    public static final Target SCHEDULED_BUTTON =Target.the("scheduled_button")
            .located(By.xpath("//span[text()=\"Scheduled List\"]"));

    public static final Target BOOKING_BUTTON =Target.the("booking_button")
            .located(By.xpath("//span[text()=\"Booking\"]"));

    public static final Target RETRIEVAL_BUTTON =Target.the("button_retrieval")
            .located(By.xpath("//span[text()=\"Retrieval\"]"));

}
