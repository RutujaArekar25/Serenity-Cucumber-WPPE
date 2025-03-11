package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogInPages extends PageObject {

    public static final Target USERNAME_FIELD = Target.the("username field")
            .located(By.xpath("//input[@id=\"basic_username\"]"));

    public static final Target PASSWORD_FIELD =Target.the("password field")
            .located(By.xpath("//input[@id=\"basic_password\"]"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//button[@type=\"submit\"]"));;

}
