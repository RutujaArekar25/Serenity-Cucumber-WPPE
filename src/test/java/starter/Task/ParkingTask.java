package starter.Task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import starter.pages.DashboardPage;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParkingTask extends PageObject {
    WebDriver driver;
    WebDriverWait wait;
    static DashboardPage dashboardPage;

    // Wipro PARI (ParkEzy) Login Locators
    private final By username = By.xpath("//input[@id='basic_username']");
    private final By password = By.xpath("//input[@id='basic_password']");
    private final By loginButton = By.xpath("//button[@type='submit']");
    private final By dashboardTab = By.xpath("//span[text()='Dashboard']");

    // Parking Status Locators
    @FindBy(xpath = "(//span[contains(@class, 'index-module__parked-status-color__lCugE')]/parent::div)[1]")
    WebElementFacade parkedElement;

    @FindBy(xpath = "(//span[contains(@class, 'index-module__empty-status-color__HX7j1')]/parent::div)[1]")
    WebElementFacade emptyElement;

    @FindBy(xpath = "(//span[contains(@class, 'index-module__dead-status-color__ddZbI')]/parent::div)[1]")
    WebElementFacade deadElement;

    @FindBy(xpath = "(//span[contains(@class, 'index-module__booked-status-color__AUMvD')]/parent::div)[1]")
    WebElementFacade bookedElement;

    public ParkingTask(WebDriver driver) {
        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void openLogInPage() {
        driver.get("https://carparking.wipropari.com/");
        driver.manage().window().maximize();
    }

    public void WriteCredentials() {
        driver.findElement(username).sendKeys("1005");
        driver.findElement(password).sendKeys("Test@1234");
        driver.findElement(loginButton).click();

        // Validate Login Success
        String expectedTitle = "Wipro PARI-ParkEZY";
        //wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    public void CheckVisibility() {
        try {
            Thread.sleep(2000);
            //driver.findElement(dashboardTab).click();
            //wait.until(ExpectedConditions.elementToBeClickable(dashboardTab)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void CountParkingStatus() {

        driver.navigate().refresh();
        try {
            //Thread.sleep(2000);
            //driver.findElement(dashboardTab).click();
            //wait.until(ExpectedConditions.elementToBeClickable(dashboardTab)).click();

            Thread.sleep(2000);
        String parkedText = driver.findElement(By.xpath("//div[contains(@class, 'index-module__status-container__')][.//span[text()='Parked']]/following-sibling::span[contains(@class, 'index-module__count__')]")).getText();
        int parkedCount = extractNumberFromText(parkedText);

            Thread.sleep(2000);
        String emptyText = driver.findElement(By.xpath("(//span[contains(@class, 'index-module__empty-status-color__HX7j1')]/parent::div)[1]")).getText();
        int emptyCount = extractNumberFromText(emptyText);

        Thread.sleep(2000);
        String deadText = driver.findElement(By.xpath("(//span[contains(@class, 'index-module__dead-status-color__ddZbI')]/parent::div)[1]")).getText();
        int deadCount = extractNumberFromText(deadText);

        Thread.sleep(2000);
        String bookedText = driver.findElement(By.xpath("(//span[contains(@class, 'index-module__booked-status-color__AUMvD')]/parent::div)[1]")).getText();
        int bookedCount = extractNumberFromText(bookedText);

            // Print or store the counts
            System.out.println("Parked: " + parkedCount);
            System.out.println("Empty: " + emptyCount);
            System.out.println("Dead: " + deadCount);
            System.out.println("Booked: " + bookedCount);

            // You can also use assertions or further logic if needed
            // Example: Assert.assertTrue(parkedCount > 0); // For test validation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

    private int extractNumberFromText(String text) {
        // Remove non-numeric characters and return 0 if the result is empty
        String number = text.replaceAll("[^0-9]", "");
        return number.isEmpty() ? 0 : Integer.parseInt(number);
    }
//
//    public void CountParkingStatus() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        String parkedText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class, 'index-module__parked-status-color__lCugE')]/parent::div)[1]"))).getText();
//        String emptyText = driver.findElement(By.xpath("(//span[contains(@class, 'index-module__empty-status-color__HX7j1')]/parent::div)[1]")).getText();
//        String deadText = driver.findElement(By.xpath("(//span[contains(@class, 'index-module__dead-status-color__ddZbI')]/parent::div)[1]")).getText();
//        String bookedText = driver.findElement(By.xpath("(//span[contains(@class, 'index-module__booked-status-color__AUMvD')]/parent::div)[1]")).getText();
//
//        // Extract numeric values using regex
//        int parked = extractNumber(parkedText);
//        int empty = extractNumber(emptyText);
//        int dead = extractNumber(deadText);
//        int booked = extractNumber(bookedText);
//
//        System.out.println("Parked: " + parked);
//        System.out.println("Empty: " + empty);
//        System.out.println("Dead: " + dead);
//        System.out.println("Booked: " + booked);
//    }
//
//    // Utility function to extract numbers from text
//    private int extractNumber(String text) {
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(text);
//        return matcher.find() ? Integer.parseInt(matcher.group()) : 0;
//    }

}