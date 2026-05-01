package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {

        FileInputStream fis = new FileInputStream(
            System.getProperty("user.dir") + "/src/test/resources/grow.properties"
        );

        Properties p = new Properties();
        p.load(fis);

        String URL = p.getProperty("url");
        String browser = p.getProperty("browser");

        if (driver == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();

                driver = new ChromeDriver();
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(URL);

            driver.manage().window().maximize();
            
        }

        return driver;
    }
}