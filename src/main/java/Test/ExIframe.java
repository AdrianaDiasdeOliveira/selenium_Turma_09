package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExIframe {

    @Test
    public void testeFrames() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[@href='#Single']")).click();

        WebElement elementFrame = driver.findElement(By.xpath("//iframe[@id='singleframe'] "));
        driver.switchTo().frame(elementFrame);
        driver.findElement(By.tagName("input")).sendKeys("Teste Iframe");

        driver.quit();

    }
}



