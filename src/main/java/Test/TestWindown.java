package Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestWindown {

    @Test
    public void testWindowns() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();

        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
        //Mapeamento das tabs abertas
        Object[] janelas = driver.getWindowHandles().toArray();
        //Troca a tab, passando a referencia
        driver.switchTo().window(janelas[1].toString());
        String textNovaTab = "Selenium automates browsers. That's it!";
        String paginaTotal = driver.getPageSource();
        Assert.assertTrue(paginaTotal.contains(textNovaTab));
        driver.quit();
    }
}