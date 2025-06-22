import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class GuestRegistrationForm {


    WebDriver driver;

    @BeforeAll
    public void setup() {

        ChromeOptions ops = new ChromeOptions();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @Test
    @DisplayName("Check if form is submitting properly")

    public void submitForm() throws InterruptedException {

        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");


        List<WebElement> textBox = driver.findElements(By.className("ur-frontend-field"));


        //Firstname, Lastname, UserEmail, password, Gender
        textBox.get(0).sendKeys("Prantika");

        textBox.get(3).sendKeys("Sneha");

        textBox.get(1).sendKeys("ppp10@gmail.com");

        textBox.get(5).click(); // gender : female
        Thread.sleep(2000);

        textBox.get(2).sendKeys("praN65@tikaa");
        Thread.sleep(1000);

        // date of birth
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement datePickerElement = driver.findElement(By.className("ur-flatpickr-field"));
        js.executeScript("arguments[0].value= '20/02/2002';", datePickerElement);


        // Nationality, Phone
        textBox.get(10).sendKeys("Bangladeshi");

        textBox.get(8).sendKeys("014654883783");

        Utils.scroll(driver, 300);


        //country
        // click and drop down to select country

        textBox.get(11).click();

        Actions action = new Actions(driver);
        for (int i = 0; i < 18; i++) {
            action.sendKeys(Keys.ARROW_DOWN).perform();
        }
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        Utils.scroll(driver, 1200);
        Thread.sleep(1000);

        textBox.get(28).click();
        Thread.sleep(3000);


        //submit btn

        WebElement submitBtnElement = driver.findElement(By.className("btn"));
        submitBtnElement.click();

        Thread.sleep(2000);

    }


    //After successful submission, assert the expected message
    public void submissionMessage() {


        // After filling and submitting the form...
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(), 'User successfully registered.')]")));


        String actualResultElement = successMsg.getText();
        String expectedResultElement = "User successfully registered.";
        Assertions.assertTrue(actualResultElement.contains(expectedResultElement));

    }

    @AfterAll
    public void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
