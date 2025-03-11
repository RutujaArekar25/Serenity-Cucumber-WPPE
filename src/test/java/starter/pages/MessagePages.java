package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MessagePages {

    public static final Target MESSAGE_PAGE = Target.the("message_page")
            .located(By.xpath("//span[text()=\"Messaging\" and @class=\"ant-menu-title-content\"]"));

    public static final Target SEND_MESSAGE_BUTTON = Target.the("send_message")
            .located(By.xpath("//span[text()=\"Add Messaging\"]"));

    public static final Target SELECT_SMS =Target.the("select_sms")
            .located(By.xpath("//input[@value=\"SMS\"]"));

    public static final Target SELECT_PUSH = Target.the("select_push")
            .located(By.xpath("//input[@value=\"PUSH\"]"));

    public static final Target WEB_USER =Target.the("web_user")
            .located(By.xpath("//input[@value=\"Web User\"]")) ;

    public static final Target MOBILE_USER =Target.the("mobile_user")
            .located(By.xpath("//input[@value=\"Mobile User\"]"));

    public static final Target CONTACT = Target.the("add_contact")
            .located(By.xpath("//textarea[@id=\"mobile_numbers\"]"));

    public static final Target MESSAGING_SET =Target.the("add_set")
            .located(By.xpath("//input[@id=\"notification_id\"]")) ;

    public static final Target TEXT = Target.the("add_message_text")
            .located(By.xpath("//textarea[@id=\"notification_message\"]"));

    public static final Target NOW =Target.the("send_now")
            .located(By.xpath("//input[@value=\"Now\"]"));

    public static final Target LATER = Target.the("send_later")
            .located(By.xpath("//input[@value=\"Later\"]"));

    public static final Target PUBLISH = Target.the("Publishs")
            .located(By.xpath("//span[text()=\"Publish\"]"));

}
