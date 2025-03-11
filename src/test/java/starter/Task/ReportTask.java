package starter.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.pages.ReportPages;

public class ReportTask {


    public static AnonymousTask Report() {
        return Task.where("{0} User is on Report page",
                Click.on(ReportPages.REPORT_PAGES_BUTTON)
                );
    }

    public static AnonymousTask GetReport(String Date) {
        return Task.where("{0} User is able to get report of request per hour",
                Click.on(ReportPages.REPORT_PER_HOUR),
                Click.on(ReportPages.DATE_FIELD),
                Clear.field(ReportPages.DATE_FIELD),
                Enter.theValue(Date).into(ReportPages.DATE_FIELD).thenHit(Keys.ENTER),
                Click.on(ReportPages.GO_BUTTON)
        );
    }

    public static AnonymousTask GetReportOfRequest(String Date) {
        return Task.where("{0} User is able to download report of request per hour",
                Click.on(ReportPages.REPORT_PER_HOUR),
                Click.on(ReportPages.DATE_FIELD),
                Clear.field(ReportPages.DATE_FIELD),
                Enter.theValue(Date).into(ReportPages.DATE_FIELD).thenHit(Keys.ENTER),
                Click.on(ReportPages.GO_BUTTON),
                Click.on(ReportPages.PDF_DOWNLOAD),
                Click.on(ReportPages.PDF_DOWNLOAD)
        );
    }

    public static AnonymousTask GetVisitorsReport() {
        return Task.where("{0} User is able to get report of visitors",
                Click.on(ReportPages.REPORT_VISITORS),
                Click.on(ReportPages.ONE_DAY),
                Click.on(ReportPages.SEVEN_DAYS),
                Click.on(ReportPages.FIFTEEN_DAYS),
                Click.on(ReportPages.THIRTY_DAYS),
                Click.on(ReportPages.GO_BUTTON)
        );
    }

    public static AnonymousTask GetReportForNDays() {
        return Task.where("{0} User is able to get report of visitors for n days",
                Click.on(ReportPages.REPORT_VISITORS),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.N_DAYS),
                Click.on(ReportPages.ONE_DAY),
                Click.on(ReportPages.SEVEN_DAYS),
                Click.on(ReportPages.FIFTEEN_DAYS),
                Click.on(ReportPages.THIRTY_DAYS),
                Click.on(ReportPages.GO_BUTTON)
                );
    }

    public static AnonymousTask GetReportCustomDates(String StartDate, String EndDate) {
        return Task.where("{0} User is able to get report of visitors using custom date",
                Click.on(ReportPages.REPORT_VISITORS),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.CUSTOME_DATE),
                Click.on(ReportPages.START_DATE),
                Enter.theValue(StartDate).into(ReportPages.START_DATE).thenHit(Keys.ENTER),
//                Click.on(ReportPages.OK_BUTTON),
                Click.on(ReportPages.END_DATE),
                Enter.theValue(EndDate).into(ReportPages.END_DATE).thenHit(Keys.ENTER),
                Click.on(ReportPages.GO_BUTTON)
                );
    }

    public static AnonymousTask GetReportForAllMonths(String month) {
        return Task.where("{0} User is able to get report of visitors using month",
                Click.on(ReportPages.REPORT_VISITORS),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.ALL_MONTHS),
                Click.on(ReportPages.SELECT_MONTH),
                Enter.theValue(month).into(ReportPages.END_DATE).thenHit(Keys.ENTER),
                Click.on(ReportPages.GO_BUTTON)
        );
    }

    public static AnonymousTask GetAllUserParkingReportForNDays() {
        return Task.where("{0} User is able to get report of All user Parking data for n days",
                Click.on(ReportPages.REPORT_All_USER),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.N_DAYS),
                Click.on(ReportPages.ONE_DAY),
                Click.on(ReportPages.SEVEN_DAYS),
                Click.on(ReportPages.FIFTEEN_DAYS),
                Click.on(ReportPages.THIRTY_DAYS),
                Click.on(ReportPages.GO_BUTTON)
        );
    }

    public static AnonymousTask GetAllUserParkingReportCustomDates(String StartDate, String EndDate) {
        return Task.where("{0} User is able to get report of All user Parking data using custom date",
                Click.on(ReportPages.REPORT_All_USER),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.CUSTOME_DATE),
                Click.on(ReportPages.START_DATE),
                Enter.theValue(StartDate).into(ReportPages.START_DATE).thenHit(Keys.ENTER),
//                Click.on(ReportPages.OK_BUTTON),
                Click.on(ReportPages.END_DATE),
                Enter.theValue(EndDate).into(ReportPages.END_DATE).thenHit(Keys.ENTER),
                Click.on(ReportPages.GO_BUTTON)
        );
    }

    public static AnonymousTask GetAllUserParkingReportForAllMonths(String month) {
        return Task.where("{0} User is able to get report of All user Parking data using month",
                Click.on(ReportPages.REPORT_All_USER),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.ALL_MONTHS),
                Click.on(ReportPages.SELECT_MONTH),
                Enter.theValue(month).into(ReportPages.END_DATE).thenHit(Keys.ENTER),
                Click.on(ReportPages.GO_BUTTON)
        );
    }

    public static AnonymousTask GetParkingDataCountReportForNDays() {
        return Task.where("{0} User is able to get report of Parking data count for n days",
                Click.on(ReportPages.REPORT_PARKING_DATA),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.N_DAYS),
                Click.on(ReportPages.ONE_DAY),
                Click.on(ReportPages.SEVEN_DAYS),
                Click.on(ReportPages.FIFTEEN_DAYS),
                Click.on(ReportPages.THIRTY_DAYS),
                Click.on(ReportPages.GO_BUTTON)
        );
    }

    public static AnonymousTask GetParkingDataCountReportCustomDates(String StartDate, String EndDate) {
        return Task.where("{0} User is able to get report of Parking data count using custom date",
                Click.on(ReportPages.REPORT_PARKING_DATA),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.CUSTOME_DATE),
                Click.on(ReportPages.START_DATE),
                Enter.theValue(StartDate).into(ReportPages.START_DATE).thenHit(Keys.ENTER),
//                Click.on(ReportPages.OK_BUTTON),
                Click.on(ReportPages.END_DATE),
                Enter.theValue(EndDate).into(ReportPages.END_DATE).thenHit(Keys.ENTER),
                Click.on(ReportPages.GO_BUTTON)
        );
    }

    public static AnonymousTask GetParkingDataCountReportForAllMonths(String month) {
        return Task.where("{0} User is able to get report of Parking data count using month",
                Click.on(ReportPages.REPORT_PARKING_DATA),
                Click.on(ReportPages.SELECT_OPTION),
                Click.on(ReportPages.ALL_MONTHS),
                Click.on(ReportPages.SELECT_MONTH),
                Enter.theValue(month).into(ReportPages.END_DATE).thenHit(Keys.ENTER),
                Click.on(ReportPages.GO_BUTTON)
        );
    }
}