package starter.Task;

import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.pages.UserManagementPage;

public class UserManagementTask {
    public static AnonymousTask UserManagementPage() {
        return Task.where("The user is on user management page",
                Click.on(UserManagementPage.USER_MANAGEMENT)
                );
    }

    public static AnonymousTask WebUsers(String user) {
        return Task.where("Get List of Web Users",
                Click.on(UserManagementPage.LIST_USER),
                Click.on(UserManagementPage.WEB_USERS),
                Click.on(UserManagementPage.SEARCH),
                Enter.theValue(user).into(UserManagementPage.SEARCH_FIELD).thenHit(Keys.ENTER),
                Click.on(UserManagementPage.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask MobileUsers(String user1) {
        return Task.where("Get List of Mobile Users",
                Click.on(UserManagementPage.LIST_USER),
                Click.on(UserManagementPage.MOBILE_USERS),
                Click.on(UserManagementPage.SEARCH),
                Enter.theValue(user1).into(UserManagementPage.SEARCH_FIELD1).thenHit(Keys.ENTER),
                Click.on(UserManagementPage.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask VisitorUsers(String user2) {
        return Task.where("Get List of Visitor Users",
                Click.on(UserManagementPage.LIST_USER),
                Click.on(UserManagementPage.VISITOR_USERS),
                Click.on(UserManagementPage.SEARCH),
                Enter.theValue(user2).into(UserManagementPage.SEARCH_FIELD2).thenHit(Keys.ENTER),
                Click.on(UserManagementPage.SEARCH_BUTTON)
        );
    }
}
