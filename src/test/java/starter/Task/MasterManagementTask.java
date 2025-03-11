package starter.Task;

import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.pages.MasterManagementPages;

public class MasterManagementTask {

    public static AnonymousTask MasterManagement() {
        return Task.where("{0} User is on customer Master Page",
                Click.on(MasterManagementPages.MASTERMANAGEMENT)
        );
    }

    public static AnonymousTask CustomerMaster(String userName) {
        return Task.where("{0} Get the list of customer Master",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.CUSTOMER_OPTION),
                Click.on(MasterManagementPages.SEARCH_BOX),
                Enter.theValue(userName).into(MasterManagementPages.SEARCH_BOX),
                Click.on(MasterManagementPages.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask CustomerLocationMaster(String userName) {
        return Task.where("{0} Get the list of customer Location Master",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.CUSTOMER_LOCATION_OPTION),
                Click.on(MasterManagementPages.SEARCH_BOX),
                Enter.theValue(userName).into(MasterManagementPages.SEARCH_BOX),
                Click.on(MasterManagementPages.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask NotificationMaster(String notificationKey) {
        return Task.where("{0} Get the notification details",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.NOTIFICATION_MASTER),
                Click.on(MasterManagementPages.SEARCH_BOX),
                Enter.theValue(notificationKey).into(MasterManagementPages.SEARCH_BOX),
                Click.on(MasterManagementPages.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask FAQMaster(String question) {
        return Task.where("{0} Get the list of FAQ",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.FAQ_MASTER),
                Click.on(MasterManagementPages.SEARCH_BOX),
                Enter.theValue(question).into(MasterManagementPages.SEARCH_BOX),
                Click.on(MasterManagementPages.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask CustomerClientMaster(String userName) {
        return Task.where("{0} Get the list of customer client Master",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.CUSTOMER_CLIENT_MASTER),
                Click.on(MasterManagementPages.SEARCH_BOX),
                Enter.theValue(userName).into(MasterManagementPages.SEARCH_BOX),
                Click.on(MasterManagementPages.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask AddCustomerClientMaster(String client, String allocation, String name, String number, String email) {
        return Task.where("{0} User is able to add customer client",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.CUSTOMER_CLIENT_MASTER),
                Click.on(MasterManagementPages.ADD_BUTTON),
                Enter.theValue(client).into(MasterManagementPages.CLEINT_NAME),
                Enter.theValue(allocation).into(MasterManagementPages.ALLOCATION_PARKING),
                Enter.theValue(name).into(MasterManagementPages.CONTACT_NAME),
                Enter.theValue(number).into(MasterManagementPages.CLEINT_NUMBER),
                Enter.theValue(email).into(MasterManagementPages.CLIENT_EMAIL)
               // Click.on(MasterManagementPages.SUBMIT_BUTTON)
                );
    }

    public static AnonymousTask UpdateCustomerClientMaster(String userName1, String client, String name, String allocation, String number, String email){
        return Task.where("{0} User is able to update customer client",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.CUSTOMER_CLIENT_MASTER),
                //Click.on(MasterManagementPages.SEARCH_BOX),
                Enter.theValue(userName1).into(MasterManagementPages.SEARCH_BOX),
                Click.on(MasterManagementPages.SEARCH_BUTTON),
                Click.on(MasterManagementPages.UPDATE),
                Clear.field(MasterManagementPages.CLEINT_NAME),
                Enter.theValue(client).into(MasterManagementPages.CLEINT_NAME),
                Clear.field(MasterManagementPages.ALLOCATION_PARKING),
                Enter.theValue(allocation).into(MasterManagementPages.ALLOCATION_PARKING),
                Enter.theValue(name).into(MasterManagementPages.CONTACT_NAME),
                Enter.theValue(number).into(MasterManagementPages.CLEINT_NUMBER),
                Enter.theValue(email).into(MasterManagementPages.CLIENT_EMAIL)
                // Click.on(MasterManagementPages.SUBMIT_BUTTON)
        );
    }

    public static AnonymousTask KeyFob(String userName) {
        return Task.where("{0} User is able to get key fob allocation",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.KEY_FOB_MASTER),
                Click.on(MasterManagementPages.SEARCH_BOX),
                Enter.theValue(userName).into(MasterManagementPages.SEARCH_BOX),
                Click.on(MasterManagementPages.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask AddKeyFob(String keyFobToken, String carType) {
        return Task.where("{0} User is able to add key fob",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.KEY_FOB_MASTER),
                Click.on(MasterManagementPages.ADD_KEY_FOB),
                Enter.theValue(keyFobToken).into(MasterManagementPages.KEYFOB_FIELD),
                Enter.theValue(carType).into(MasterManagementPages.CAR_TYPE)
                //Click.on(MasterManagementPages.SUBMIT_KEYFOB)
        );

    }

    public static AnonymousTask KeyFoballocations(String keyFob) {
        return Task.where("{0} User is able to get key fob allocation",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.KEY_FOB_ALLOCATIONS),
                Click.on(MasterManagementPages.SEARCH_BOX),
                Enter.theValue(keyFob).into(MasterManagementPages.SEARCH_BOX),
                Click.on(MasterManagementPages.SEARCH_BUTTON)
        );
    }

    public static AnonymousTask AddKeyFoballocations(String customer, String keyFob, String id, String number, String visitorFNm, String visitorLNm) {
        return Task.where("{0} User is able to add key fob allocations",
                Click.on(MasterManagementPages.DROPDOWN_MENU),
                Click.on(MasterManagementPages.KEY_FOB_ALLOCATIONS),
                Click.on(MasterManagementPages.ADD_KEY_FOB_ALLOCATIONS),

                Click.on(MasterManagementPages.SELECT_CUSTOMER),
                Enter.theValue(customer).into(MasterManagementPages.SELECT_CUSTOMER).thenHit(Keys.ENTER),

                Click.on(MasterManagementPages.SELECT_KEYFOB),
                Enter.theValue(keyFob).into(MasterManagementPages.SELECT_KEYFOB).thenHit(Keys.ENTER),

//                Click.on(MasterManagementPages.ID),
//                Enter.theValue(id).into(MasterManagementPages.ID),

                Click.on(MasterManagementPages.NUMBER),
                Enter.theValue(number).into(MasterManagementPages.NUMBER),

                Click.on(MasterManagementPages.VERIFY),

//                Click.on(MasterManagementPages.FIRSTNAME),
//                Enter.theValue(visitorFNm).into(MasterManagementPages.FIRSTNAME),

//                Click.on(MasterManagementPages.LASTNAME),
//                Enter.theValue(visitorLNm).into(MasterManagementPages.LASTNAME),

                Click.on(MasterManagementPages.ISVISITOR)

                // Click.on(MasterManagementPages.SUBMIT)

        );
    }
}