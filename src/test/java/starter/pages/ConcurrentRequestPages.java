package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConcurrentRequestPages extends PageObject {

    public static final Target CONCURRENT_PAGE = Target.the("concurrent")
            .located(By.xpath("//span[text()=\"Concurrent Request\"]"));

//Add Concurrent Request--

    public static final Target CUSTOMER_ID = Target.the("customer_id")
            .located(By.xpath("//input[@id=\"customerId\"]"));

    public static final Target CUSTOMER = Target.the("customer")
            .located(By.xpath("//div[text()=\"Test customer\"]"));

    public static final Target LOCATION_ID = Target.the("location_id")
            .located(By.xpath("//input[@id=\"locationName\"]"));

    public static final Target LOCATION =Target.the("location")
            //.located(By.xpath("//div[@class='ant-select-item-option-content' and contains(text(), 'Bavdhan Pune')]")) ;
            .located(By.xpath("//div[@class='ant-select-item-option-content' and contains(text(), 'Kalpataru-Santacruz East')]")) ;

    public static final Target BOOKING_FIELD =Target.the("submit")
            .located(By.xpath("//input[@id=\"bookingKeyFobs\"]"));

    public static final Target RETRIEVAL_FIELD =Target.the("submit")
            .located(By.xpath("//input[@id=\"retrievalKeyFobs\"]"));

    public static final Target SUBMIT_CONCURRENT = Target.the("submit")
            .located(By.xpath("//span[text()=\"Submit\"]"));

}
