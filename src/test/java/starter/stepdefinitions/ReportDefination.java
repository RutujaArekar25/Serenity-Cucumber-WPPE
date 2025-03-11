package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import starter.Task.ReportTask;

public class ReportDefination {
    @Then("{actor} is should be on Report")
    public void userIsShouldBeOnReport(Actor actor ) {
        actor.attemptsTo(ReportTask.Report());
    }

    @And("{actor} is able to get report of request per hour")
    public void userIsAbleToGetReportOfRequestPerHour(Actor actor) {
        actor.attemptsTo(ReportTask.GetReport("05-02-2025"));
    }

    @And("{actor} is able to download the RequestPerHour report")
    public void userIsAbleToDownloadTheRequestHourReport(Actor actor) {
        actor.attemptsTo(ReportTask.GetReportOfRequest("05-02-2025"));
    }

    @And("{actor} is able to get data dateWise")
    public void userIsAbleToGetDataDateWise(Actor actor) {
        actor.attemptsTo(ReportTask.GetReportForNDays());
        actor.attemptsTo(ReportTask.GetReportCustomDates("01-02-2025 04:40","05-02-2025 04:40"));
        actor.attemptsTo(ReportTask.GetReportForAllMonths("February 2025"));
    }

    @And("{actor} is able to get All users Parking report")
    public void userIsAbleToGetAllUsersParkingReport(Actor actor) {
        actor.attemptsTo(ReportTask.GetAllUserParkingReportForNDays());
        actor.attemptsTo(ReportTask.GetAllUserParkingReportCustomDates("01-02-2025 04:40","05-02-2025 04:40"));
        actor.attemptsTo(ReportTask.GetAllUserParkingReportForAllMonths("February 2025"));
    }

    @And("{actor} is able to get Parking data count report")
    public void userIsAbleToGetParkingDataCountReport(Actor actor) {
        actor.attemptsTo(ReportTask.GetParkingDataCountReportForNDays());
        actor.attemptsTo(ReportTask.GetParkingDataCountReportCustomDates("01-02-2025 04:40","05-02-2025 04:40"));
        actor.attemptsTo(ReportTask.GetParkingDataCountReportForAllMonths("February 2025"));
    }
}
