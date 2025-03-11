package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UserManagementPage extends PageObject {

    public static final Target USER_MANAGEMENT = Target.the("user_management")
            .located(By.xpath("//span[@class=\"ant-menu-title-content\" and contains(text(),\"User Management\")]"));

//Web Users--
    public static final Target LIST_USER = Target.the("user_list")
        .located(By.xpath("//div[@class=\"ant-select index-module__select-master-dropdown__yfRF6 ant-select-single ant-select-show-arrow ant-select-show-search\"]"));

    public static final Target WEB_USERS = Target.the("web_users")
            .located(By.xpath("//div[text()=\"Web Users\"]"));

    public static final Target MOBILE_USERS =Target.the("mobile_users")
            .located(By.xpath("//div[text()=\"Mobile Users\"]"));

    public static final Target VISITOR_USERS =Target.the("visitor_users")
            .located(By.xpath("//div[text()=\"Visitor Users\"]"));

    public static final Target SEARCH = Target.the("search")
            .located(By.xpath("//input[@placeholder=\"Search...\"]"));

    public static final Target SEARCH_FIELD = Target.the("search_field")
            .located(By.xpath("//input[@placeholder=\"Search...\"]"));

    public static final Target SEARCH_FIELD1 = Target.the("search_field")
            .located(By.xpath("//input[@placeholder=\"Search...\"]"));

    public static final Target SEARCH_FIELD2 = Target.the("search_field")
            .located(By.xpath("//input[@placeholder=\"Search...\"]"));

    public static final Target SEARCH_BUTTON = Target.the("search_button")
            .located(By.xpath("//button[@type=\"button\" and @class=\"ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button\"]"));

}
