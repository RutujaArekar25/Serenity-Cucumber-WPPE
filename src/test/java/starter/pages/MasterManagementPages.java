package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MasterManagementPages extends PageObject {

    public static final Target MASTERMANAGEMENT = Target.the("master_management")
            .located(By.xpath("//span[text()=\"Master Management\" and @class=\"ant-menu-title-content\"]"));

    //Customer Master---
    public static final Target DROPDOWN_MENU = Target.the("dropdown_menu")
            .located(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__rxobb ant-select-single ant-select-show-arrow ant-select-show-search\"]"));

    public static final Target CUSTOMER_OPTION = Target.the("customer_option")
            .located(By.xpath("//div[text()=\"Customer Master\"]"));

    public static final Target SEARCH_BOX = Target.the("search_box")
            .located(By.xpath("//input[@placeholder=\"Search...\"]"));

    public static final Target SEARCH_BUTTON = Target.the("search_button")
            .located(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]"));

    public static final Target CUSTOMER_LOCATION_OPTION = Target.the("customer_location_option")
            .located(By.xpath("//div[text()=\"Customer Location Master\"]"));

    public static final Target NOTIFICATION_MASTER = Target.the("notification_master")
            .located(By.xpath("//div[text()=\"Notification Master\"]"));

    public static final Target FAQ_MASTER =Target.the("faq_master")
            .located(By.xpath("//div[text()=\"FAQ Master\"]"));

    //Customer client master---
    public static final Target CUSTOMER_CLIENT_MASTER = Target.the("customer_client_master")
            .located(By.xpath("//div[text()=\"Customer Client Master\"]"));

    //Add customer client---
    public static final Target ADD_BUTTON = Target.the("add_button")
            .located(By.xpath("//span[text()=\"Add\"]"));

    public static final Target CLEINT_NAME =Target.the("client_name")
            .located(By.xpath("//input[@id=\"register_client_name\"]"));

    public static final Target ALLOCATION_PARKING = Target.the("allocation_parking")
            .located(By.xpath("//input[@id=\"register_allocated_parking\"]"));

    public static final Target CONTACT_NAME = Target.the("contact_name")
            .located(By.xpath("//input[@id=\"register_client_contact\"]"));

    public static final Target CLEINT_NUMBER = Target.the("client_number")
            .located(By.xpath("//input[@id=\"register_mobile_number\"]"));

    public static final Target CLIENT_EMAIL =Target.the("client_email")
            .located(By.xpath("//input[@id=\"register_email_address\"]"));

    public static final Target SUBMIT_BUTTON =Target.the("submit_button")
            .located(By.xpath("//button[@type=\"submit\"]"));

    //update customer client---
    public static final Target UPDATE =Target.the("update_button")
            .located(By.xpath("//*[@id=\"root\"]/section/section/main/div/div/div/div/div[2]/div[1]/div/div/div/div/div/table/tbody/tr/td[10]/div/div[1]/i"));


    //Key fob master---

    public static final Target KEY_FOB_MASTER =Target.the("key_fob_master")
            .located(By.xpath("//div[text()=\"KeyFob Master\"]"));

    public static final Target ADD_KEY_FOB = Target.the("add_key_fob")
            .located(By.xpath("//button[@class=\"ant-btn ant-btn-default button-gradiant gx-mb-0 add-button\"]"));;

    public static final Target KEYFOB_FIELD = Target.the("key_fob_field")
            .located(By.xpath("//input[@id=\"register_key_fob_token\"]"));

    public static final Target CAR_TYPE = Target.the("car_type")
            .located(By.xpath("//input[@id=\"register_vehicle_type_id\"]"));

    public static final Target SUBMIT_KEYFOB = Target.the("key_fob_submit")
            .located(By.xpath("//span[text()=\"Submit\"]"));

    //key fob Allocations---
    public static final Target KEY_FOB_ALLOCATIONS = Target.the("key_fob_allocations")
            .located(By.xpath("//div[text()=\"KeyFob Allocation Master\"]"));

    //Add key fob---
    public static final Target ADD_KEY_FOB_ALLOCATIONS = Target.the("add_keyFob")
            .located(By.xpath("//button[@class=\"ant-btn ant-btn-default button-gradiant gx-mb-0 add-button\"]"));

    public static final Target SELECT_CUSTOMER = Target.the("customer")
            .located(org.openqa.selenium.By.xpath("//input[@id=\"register_customer_client_id\"]"));

    public static final Target SELECT_KEYFOB =Target.the("keyFob")
            .located(org.openqa.selenium.By.xpath("//input[@id=\"register_key_fob_id\"]"));

    public static final Target ID = Target.the("id")
            .located(org.openqa.selenium.By.xpath("//input[@name=\"employee_id\"]"));

    public static final Target NUMBER = Target.the("contact")
            .located(org.openqa.selenium.By.xpath("//input[@name=\"mobile_number\"]"));

    public static final Target VERIFY = Target.the("verify")
            .located(org.openqa.selenium.By.xpath("//span[text()=\"Verify\"]"));

    public static final Target FIRSTNAME = Target.the("firstname")
            .located(org.openqa.selenium.By.xpath("//input[@name=\"first_name\"]"));

    public static final Target LASTNAME = Target.the("lastname")
            .located(org.openqa.selenium.By.xpath("//input[@name=\"last_name\"]"));

    public static final Target ISVISITOR = Target.the("isvisitor")
            .located(org.openqa.selenium.By.xpath("//input[@id=\"register_is_visitor\"]"));

    public static final Target SUBMIT = Target.the("submit")
            .located(org.openqa.selenium.By.xpath("//button[@type=\"submit\"]"));

}
