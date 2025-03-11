package starter.Task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import starter.pages.DashboardPage;

import java.util.List;

public class DashboardTask {

    static DashboardPage dashboardPage;

    public static int allParked;
    public static int allEmpty;
    public static int allDead;
    public static int allBooked;

    public static int parkedFromPie ;
    public static int emptyFromPie ;
    public static int deadFromPie ;
    public static int bookedFromPie ;

    public static int ParkedNumber ;
    public static int EmptyNumber ;
    public static int BookedNumber ;
    public static int DeadNumber ;

    private static final String EXPECTED_GREEN = "#008000";
    private static final String EXPECTED_WHITE = "#ffffff";
    private static final String EXPECTED_YELLOW = "#f4cc07";

    public static AnonymousTask DashboardPage() {
        return Task.where("{0} The User is on Dashboard Page",
                Click.on(DashboardPage.DASHBOARD_BUTTON)
                );
    }

    public static AnonymousTask selectCustomer() {
        return Task.where("{0} The User is able to select Customer",
                Click.on(DashboardPage.DASHBOARD_TEXT),
                Click.on(DashboardPage.CUSTOMER));
    }

    public static AnonymousTask selectLocation() {
        return Task.where("{0} The User is able to select Location",
                Click.on(DashboardPage.LOCATION_TEXT),
                Click.on(DashboardPage.LOCATION)
        );
    }

    public static AnonymousTask AddVisitor(String customer, String keyFob, String id, String number, String visitorFNm, String visitorLNm) {
        return Task.where("{0} The user is able to add Visitor",
                Click.on(DashboardPage.ADD_BUTTON),

                Click.on(DashboardPage.SELECT_CUSTOMER),
                Enter.theValue(customer).into(DashboardPage.SELECT_CUSTOMER).thenHit(Keys.ENTER),

                Click.on(DashboardPage.SELECT_KEYFOB),
                Enter.theValue(keyFob).into(DashboardPage.SELECT_KEYFOB).thenHit(Keys.ENTER),

                Click.on(DashboardPage.ID),
                Enter.theValue(id).into(DashboardPage.ID),

                Click.on(DashboardPage.NUMBER),
                Enter.theValue(number).into(DashboardPage.NUMBER),

                Click.on(DashboardPage.VERIFY),

//                Click.on(DashboardPage.FIRSTNAME),
//               Enter.theValue(visitorFNm).into(DashboardPage.FIRSTNAME),
//
//                Click.on(DashboardPage.LASTNAME),
//                Enter.theValue(visitorLNm).into(DashboardPage.LASTNAME),

                Click.on(DashboardPage.ISVISITOR),

                Click.on(DashboardPage.CLOSE)

                 //Click.on(DashboardPage.SUBMIT)
        );
    }

    public static AnonymousTask Expand() {
        return Task.where("{0} The user is able to expand the page",
                Click.on(DashboardPage.EXPAND1),
                Click.on(DashboardPage.EXPAND2)
        );
    }

    public static AnonymousTask ExpandParkingStatus() {
        return Task.where("{0} The user is able to expand the Parking Status",
                Click.on(DashboardPage.PARKING_STATUS)
        );
    }

    public static AnonymousTask CloseParkingStatus() {
        return Task.where("{0} The user is able to close the Parking Status ",
                Click.on(DashboardPage.PARKING_STATUS_CLOSE)
        );
    }

    @Step("Count parking status for SEDAN/XUV/SUV")
    public static void CountParkingStatus() {

        //For Sedan--
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            // Wait for the element containing sedanParked value to be present
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("your_sedan_parked_xpath")));

        int sedanParked = Integer.parseInt(dashboardPage.getSedanParkedValue());
        int sedanEmpty = Integer.parseInt(dashboardPage.getSedanEmptyValue());
        int sedanDead = Integer.parseInt(dashboardPage.getSedanDeadValue());
        int sedanBooked = Integer.parseInt(dashboardPage.getSedanBookedValue());

        //For SUV
        int SUVParked = Integer.parseInt(dashboardPage.getParkedValueSUV());
        int SUVEmpty = Integer.parseInt(dashboardPage.getEmptyValueSUV());
        int SUVDead = Integer.parseInt(dashboardPage.getDeadValueSUV());
        int SUVBooked = Integer.parseInt(dashboardPage.getBookedValueSUV());

        //For XUV--
        int XUVParked = Integer.parseInt(dashboardPage.getParkedValueXUV());
        int XUVEmpty = Integer.parseInt(dashboardPage.getEmptyValueXUV());
        int XUVDead = Integer.parseInt(dashboardPage.getDeadValueXUV());
        int XUVBooked = Integer.parseInt(dashboardPage.getBookedValueXUV());

        allParked = (sedanParked+XUVParked+SUVParked);
        allEmpty = (sedanEmpty+XUVEmpty+SUVEmpty);
        allDead = (sedanDead+XUVDead+SUVDead);
        allBooked = (sedanBooked+XUVBooked+SUVBooked);

//        allParked = (sedanParked+SUVParked);
//        allEmpty = (sedanEmpty+SUVEmpty);
//        allDead = (sedanDead+SUVDead);
//        allBooked = (sedanBooked+SUVBooked);

    }

    @Step("Count occupancy status for SEDAN/XUV/SUV")
    public static void CountOccupancyStatus() {

        //Values from PIE--
         parkedFromPie = Integer.parseInt(dashboardPage.getParkedFromPie());
         emptyFromPie = Integer.parseInt(dashboardPage.getEmptyFromPie());
         deadFromPie = Integer.parseInt(dashboardPage.getDeadFromPie());
         bookedFromPie = Integer.parseInt(dashboardPage.getBookedFromPie());

    }

    @Step("Count keyFob Allocations for SEDAN/XUV/SUV")
    public static void CountAllocations() {

        int[] sedan = {2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,40,44,
                45,50,55,60,66,73,78,79,80, 81,82,83,84,85,86,87,88,96,97,98,
                120,122,133,200,201,202,203,204,205, 206,207,208,209,210,767,801,
                802,803,804,805,806,807,808, 809,810,811, 812,813,814,815,816,817,818,
                819,820,1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1129,1199,2001,
                2010,2011,2012,2013,2014,2015,2016, 2017,2018,2019,2020,2044};

        int[] suv ={65,1000};

        int[] xuv ={2030,2031,2032,2033,2034,2035,2036,2037,2038,2039,2041,2042,2043,2045};

//        int[] sedan = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
//        31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54};
//
//        //int[] sedan={1,6,9,33,57,59,108};
//
//        int[] suv={55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,
//        84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108};

        int TotalAllocations = ( sedan.length + suv.length + xuv.length );
        // int TotalAllocations = ( sedan.length + suv.length );
       // int TotalAllocations = ( sedan.length );

        System.out.println("The total numbers of allocations are " +TotalAllocations);

        int greenCount = 0;
        int whiteCount = 0;
        int yellowCount = 0;

        int greenCount1 = 0;
        int whiteCount1 = 0;
        int yellowCount1 = 0;

        int greenCount2 = 0;
        int whiteCount2 = 0;
        int yellowCount2 = 0;

        for (int keyFob : sedan) {
            List<WebElement> elements = dashboardPage.findKeyFobElements(keyFob);

            for (WebElement element : elements) {
                String bgColor = element.getCssValue("background-color");
                String actualColor = Color.fromString(bgColor).asHex();

                if (EXPECTED_GREEN.equals(actualColor)) {
                    greenCount++;
                    System.out.println("The KeyFOB " + keyFob + " is Parked of SEDAN");
                } else if (EXPECTED_YELLOW.equals(actualColor)) {
                    yellowCount++;
                    System.out.println("The KeyFOB " + keyFob + " is Booked of SEDAN");
                } else if (EXPECTED_WHITE.equals(actualColor)) {
                    whiteCount++;
                    System.out.println("The KeyFOB " + keyFob + " is Empty of SEDAN");
                } else {
                    System.out.println("The KeyFOB " + keyFob + " is not Allocated of SEDAN");
                }
            }
        }

        for (int keyFob : xuv) {
            List<WebElement> elements = dashboardPage.findKeyFobElements(keyFob);

            for (WebElement element : elements) {
                String bgColor = element.getCssValue("background-color");
                String actualColor = Color.fromString(bgColor).asHex();

                if (EXPECTED_GREEN.equals(actualColor)) {
                    greenCount1++;
                    System.out.println("The KeyFOB " + keyFob + " is Parked of XUV");
                } else if (EXPECTED_YELLOW.equals(actualColor)) {
                    yellowCount1++;
                    System.out.println("The KeyFOB " + keyFob + " is Booked of XUV");
                } else if (EXPECTED_WHITE.equals(actualColor)) {
                    whiteCount1++;
                    System.out.println("The KeyFOB " + keyFob + " is Empty of XUV");
                } else {
                    System.out.println("The KeyFOB " + keyFob + " is not Allocated of XUV");
                }
            }
        }

        for (int keyFob : suv) {
            List<WebElement> elements = dashboardPage.findKeyFobElements(keyFob);

            for (WebElement element : elements) {
                String bgColor = element.getCssValue("background-color");
                String actualColor = Color.fromString(bgColor).asHex();

                if (EXPECTED_GREEN.equals(actualColor)) {
                    greenCount2++;
                    System.out.println("The KeyFOB " + keyFob + " is Parked of SUV");
                } else if (EXPECTED_YELLOW.equals(actualColor)) {
                    yellowCount2++;
                    System.out.println("The KeyFOB " + keyFob + " is Booked of SUV");
                } else if (EXPECTED_WHITE.equals(actualColor)) {
                    whiteCount2++;
                    System.out.println("The KeyFOB " + keyFob + " is Empty of SUV");
                } else {
                    System.out.println("The KeyFOB " + keyFob + " is not Allocated of SUV");
                }
            }
        }

         ParkedNumber =(greenCount+greenCount1+greenCount2);
         EmptyNumber=(whiteCount+whiteCount1+whiteCount2);
         BookedNumber=(yellowCount+yellowCount1+yellowCount2);
         DeadNumber=(TotalAllocations -(ParkedNumber+EmptyNumber+BookedNumber));

//        ParkedNumber =(greenCount);
//        EmptyNumber=(whiteCount);
//        BookedNumber=(yellowCount);
//        DeadNumber=(TotalAllocations -(ParkedNumber+EmptyNumber+BookedNumber));

    }

    public static void assertion(){

        //Parking Status--
        System.out.println("The total number of parked from parking status is " +allParked);
        System.out.println("The total number of Empty from parking status is " +allEmpty);
        System.out.println("The total number of Dead from parking status is " +allDead);
        System.out.println("The total number of booked from parking status is " +allBooked);

        //Occupancy Status--
        System.out.println("The total number of parked from Pie chart is " +parkedFromPie);
        System.out.println("The total number of empty from Pie chart is " +emptyFromPie);
        System.out.println("The total number of dead from Pie chart is " +deadFromPie);
        System.out.println("The total number of booked from Pie chart is " +bookedFromPie);

        //KeyFob Allocations--
        System.out.println("Total Parked from key fob allocations (Green): " + ParkedNumber );
        System.out.println("Total Booked from key fob allocations (Yellow): " + BookedNumber );
        System.out.println("Total Empty from key fob allocations (White): " + EmptyNumber );
        System.out.println("Total Dead from key fob allocations (Grey): " + DeadNumber );

    }

}