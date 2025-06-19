import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class digitalPracticeUnitFrom {

    WebDriver driver;

    @BeforeAll

    public void setup() {
        ChromeOptions ops = new ChromeOptions();
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    @DisplayName("Check if form is submitting properly")
    public void submitFrom() throws InterruptedException {

        driver.get("https://www.digitalunite.com/practice-webform-learners");

        //accept all cookies
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        // name, number, date, email, tell us yourself elements
        List<WebElement> textBox = driver.findElements(By.className("form-control"));
        textBox.get(0).sendKeys("Prantika");
        textBox.get(1).sendKeys("013047548475");
        textBox.get(2).sendKeys("12/05/2028");
        textBox.get(3).sendKeys("pp@gmail.com");
        textBox.get(4).sendKeys("I'm a curious mind who loves solving problems and learning new things.\n" +
                "With a background in tech, I enjoy making systems better and more reliable.\n" +
                "Outside work, I’m all about growth, good vibes, and meaningful conversations.\n" +
                "Driven, detail-oriented, and always ready for a new challenge");
        Utils.scroll(driver, 400);

        //upload Image
        WebElement imageUploadELement = driver.findElement(By.id("edit-uploadocument-upload"));
        imageUploadELement.sendKeys(System.getProperty("user.dir") + "/src/test/resources/Titan.jpg");
        Thread.sleep(4000);

        //check box
        WebElement clickCheckBoxELement = driver.findElement(By.id("edit-age"));
        clickCheckBoxELement.click();
        Thread.sleep(4000);

        //submit Button
        WebElement submitButtonElement = driver.findElement(By.id("edit-submit"));
        submitButtonElement.click();
        Thread.sleep(5000);

        //After successful submission, assert the expected message.
        WebElement resultElement = driver.findElement(By.tagName("h1"));
        String ActualResult = resultElement.getText();
        String ExpectedResult = "Thank you for your submission!";
        Assertions.assertTrue(ActualResult.contains(ExpectedResult));


    }






    @AfterAll
    public void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}


