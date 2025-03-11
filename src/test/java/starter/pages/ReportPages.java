package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReportPages {
    public static final Target REPORT_PAGES_BUTTON = Target.the("report_pages_button")
            .located(By.xpath("//span[text()=\"Reports\"]"));

    public static final Target DATE_FIELD = Target.the("date_field")
            .located(By.xpath("//input[@Placeholder=\"Select date\"]"));

    public static final Target GO_BUTTON = Target.the("go_button")
            .located(By.xpath("//span[text()=\"Go\"]"));

    public static final Target PDF_DOWNLOAD =Target.the("download_pdf")
            .located(By.xpath("//div[@class=\"ant-tooltip-open\"]"));

    public static final Target REPORT_PER_HOUR =Target.the("report_per_hour")
            .located(By.xpath("//span[text()=\"Request/Hour Report\"]"));

    public static final Target REPORT_VISITORS = Target.the("report_visitor")
            .located(By.xpath("//span[text()=\"Visitors Report\"]"));

    public static final Target ONE_DAY = Target.the("one_day")
            .located(By.xpath("//div[text()=\"1\"]"));

    public static final Target SEVEN_DAYS = Target.the("seven_days")
            .located(By.xpath("//div[text()=\"7\"]"));

    public static final Target FIFTEEN_DAYS = Target.the("fifteen_days")
            .located(By.xpath("//div[text()=\"15\"]"));

    public static final Target THIRTY_DAYS = Target.the("thierty_days")
            .located(By.xpath("//div[text()=\"30\"]"));

    public static final Target SELECT_OPTION = Target.the("select")
            .located(By.xpath("(//span[text()=\"Last N Days\"])[1]"));

    public static final Target N_DAYS =Target.the("n_days")
            .located(By.xpath("(//span[text()=\"Last N Days\"])[2]"));

    public static final Target CUSTOME_DATE =Target.the("custome_date")
            .located(By.xpath("//span[text()=\"Custom Date Filter\"]"));

    public static final Target ALL_MONTHS =Target.the("all_months")
            .located(By.xpath("//span[text()=\"All Months\"]"));

    public static final Target START_DATE = Target.the("start_date")
            .located(By.xpath("//input[@Placeholder=\"Start date\"]"));

    public static final Target END_DATE =Target.the("end_date")
            .located(By.xpath("//input[@Placeholder=\"End date\"]"));

    public static final Target SELECT_MONTH =Target.the("select_month")
            .located(By.xpath("//input[@class=\"ant-select-selection-search-input\"])[3]"));

    public static final Target OK_BUTTON =Target.the("ok_button")
            .located(By.xpath("//span[text()=\"OK\"]"));

    public static final Target REPORT_PARKING_DATA =Target.the("parking_data")
            .located(By.xpath("//span[text()=\"Parking Data Counts\"]"));

    public static final Target REPORT_All_USER =Target.the("all_user")
            .located(By.xpath("//span[text()=\"All Users Parking Report\"]"));

}




