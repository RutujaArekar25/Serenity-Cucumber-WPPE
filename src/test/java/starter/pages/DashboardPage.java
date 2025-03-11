package starter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class DashboardPage extends PageObject {

    //Selection of Customer---
    public static final Target DASHBOARD_BUTTON = Target.the("dashboard_field")
            .located(By.xpath("//span[text()=\"Dashboard\"]"));

    public static final Target DASHBOARD_TEXT = Target.the("dashboard_text")
            .located(By.xpath("//div[@class='ant-select index-module__dropdown__selector__hQO9_ ant-select-single ant-select-show-arrow ant-select-show-search'][1]"));

    public static final Target CUSTOMER = Target.the("customer")
            .located(By.xpath("//div[@class='ant-select-item-option-content'][1]"));

    //Selection of Location---
    public static final Target LOCATION_BUTTON = Target.the("location_field")
            .located(By.xpath("//span[text()=\"Dashboard\"]"));

    public static final Target LOCATION_TEXT = Target.the("location__text")
            .located(By.xpath("//div[@class='ant-select index-module__dropdown__selector__hQO9_ ant-select-single ant-select-allow-clear ant-select-show-arrow ant-select-show-search'][1]"));

    public static final Target LOCATION = Target.the("location")
           // .located(By.xpath("//div[@class='ant-select-item-option-content' and contains(text(),'Bavdhan Pune')]"));
            .located(By.xpath("(//div[@class=\"ant-select-item-option-content\"])[2]"));

    //Add Visitor---
    public static final Target ADD_BUTTON = Target.the("Add")
            .located(By.xpath("//span[text()=\"Add Visitor\"]"));

    public static final Target SELECT_CUSTOMER = Target.the("customer")
            .located(By.xpath("//input[@id=\"register_customer_client_id\"]"));


    public static final Target SELECT_KEYFOB = Target.the("keyFob")
            .located(By.xpath("//input[@id=\"register_key_fob_id\"]"));

    public static final Target ID = Target.the("id")
            .located(By.xpath("//input[@name=\"employee_id\"]"));

    public static final Target NUMBER = Target.the("contact")
            .located(By.xpath("//input[@name=\"mobile_number\"]"));

    public static final Target VERIFY = Target.the("verify")
            .located(By.xpath("//span[text()=\"Verify\"]"));

    public static final Target FIRSTNAME = Target.the("firstname")
            .located(By.xpath("//input[@name=\"first_name\"]"));

    public static final Target LASTNAME = Target.the("lastname")
            .located(By.xpath("//input[@name=\"last_name\"]"));

    public static final Target ISVISITOR = Target.the("isvisitor")
            .located(By.xpath("//input[@id=\"register_is_visitor\"]"));

    public static final Target CLOSE = Target.the("close")
            .located(By.xpath("//span[text()=\"Close\"]"));

    public static final Target SUBMIT = Target.the("submit")
            .located(By.xpath("//button[@type=\"submit\"]"));

    //Count Allocations using background color---
    public static final Target FULL_SCREEN = Target.the("full_screen")
            .located(By.xpath("(//span[contains(@class, 'index-module__maximize-icon__')])[2]"));

    public static final Target EXPAND1 = Target.the("expand1")
            .located(By.xpath("(//div[@class=\"ant-collapse-expand-icon\"])[2]"));

//    public static final Target EXPAND1 = Target.the("expand1")
//        .located(org.openqa.selenium.By.xpath("(//div[@class=\"ant-collapse-header\"])[5]"));

    public static final Target EXPAND2 = Target.the("expand2")
            .located(By.xpath("(//div[@class=\"ant-collapse-expand-icon\"])[3]"));

//    public static final Target EXPAND2 = Target.the("expand2")
//            .located(org.openqa.selenium.By.xpath("(//div[@class=\"ant-collapse-header\"])[6]"));

    public static final Target CLOSE_SCREEN = Target.the("close_screen")
            .located(By.xpath("//span[@class=\"anticon anticon-close ant-modal-close-icon\"]"));

    public static final Target PARKING_STATUS =Target.the("parking_status")
            .located(By.xpath("(//span[@class=\"anticon anticon-fullscreen index-module__maximize-icon__NPihT\"])[2]"));

    public static final Target PARKING_STATUS_CLOSE =Target.the("parking_status_close")
            .located(By.xpath("//span[@class=\"ant-modal-close-x\"]"));

    public List<WebElement> findKeyFobElements(int keyFobNumber) {
        String dynamicXPath = "//span[text()='" + keyFobNumber + "']";
        List<WebElementFacade> webElementFacades = findAll(dynamicXPath);
        // Convert List<WebElementFacade> to List<WebElement>
        return webElementFacades.stream()
                .map(WebElementFacade::getWrappedElement)
                .collect(Collectors.toList());
    }

    // ✅ Sedan
    public String getSedanParkedValue() {
        return extractNumericValue("(//span[contains(@class, 'index-module__parked-status-color__lCugE')]/parent::div)[1]");
    }

    public String getSedanEmptyValue() {
        return extractNumericValue("(//span[contains(@class, 'index-module__empty-status-color__HX7j1')]/parent::div)[1]");
    }

    public String getSedanDeadValue() {
        return extractNumericValue("(//span[contains(@class, 'index-module__dead-status-color__ddZbI')]/parent::div)[1]");
    }

    public String getSedanBookedValue() {
        return extractNumericValue("(//span[contains(@class, 'index-module__booked-status-color__AUMvD')]/parent::div)[1]");
    }

    // ✅ SUV
    public String getParkedValueSUV() {
        return extractNumericValue("(//span[contains(@class, 'index-module__parked-status-color__lCugE')]/parent::div)[2]");
    }

    public String getEmptyValueSUV() {
        return extractNumericValue("(//span[contains(@class, 'index-module__empty-status-color__HX7j1')]/parent::div)[2]");
    }

    public String getDeadValueSUV() {
        return extractNumericValue("(//span[contains(@class, 'index-module__dead-status-color__ddZbI')]/parent::div)[2]");
    }

    public String getBookedValueSUV() {
        return extractNumericValue("(//span[contains(@class, 'index-module__booked-status-color__AUMvD')]/parent::div)[2]");
    }

//    // ✅ XUV
    public String getParkedValueXUV() {
        return extractNumericValue("(//span[contains(@class, 'index-module__parked-status-color__lCugE')]/parent::div)[3]");
    }

    public String getEmptyValueXUV() {
        return extractNumericValue("(//span[contains(@class, 'index-module__empty-status-color__HX7j1')]/parent::div)[3]");
    }

    public String getDeadValueXUV() {
        return extractNumericValue("(//span[contains(@class, 'index-module__dead-status-color__ddZbI')]/parent::div)[3]");
    }

    public String getBookedValueXUV() {
        return extractNumericValue("(//span[contains(@class, 'index-module__booked-status-color__AUMvD')]/parent::div)[3]");
    }

    // ✅ Pie Chart
    public String getParkedFromPie() {
        return extractNumericValue("//div[contains(@class, 'index-module__status-container__')][.//span[text()='Parked']]/following-sibling::span[contains(@class, 'index-module__count__')]");
    }

    public String getEmptyFromPie() {
        return extractNumericValue("//div[contains(@class, 'index-module__status-container__')][.//span[text()='Empty']]/following-sibling::span[contains(@class, 'index-module__count__')]");
    }

    public String getDeadFromPie() {
        return extractNumericValue("//div[contains(@class, 'index-module__status-container__')][.//span[text()='Dead']]/following-sibling::span[contains(@class, 'index-module__count__')]");
    }

    public String getBookedFromPie() {
        return extractNumericValue("//div[contains(@class, 'index-module__status-container__')][.//span[text()='Booked']]/following-sibling::span[contains(@class, 'index-module__count__')]");
    }

    // ✅ Generic method to extract numeric value
    private String extractNumericValue(String xpath) {
        String rawText = find(By.xpath(xpath))
               // .waitUntilVisible()
                .getText()
                .trim();
        return rawText.replaceAll("[^0-9]", ""); // Remove non-numeric characters
    }
}