package Test;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

import java.time.Duration;

public class SeleniunAlert {

    WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();


    }

    @Test
    public void testAlertasSimples() {
        driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();

        //Instancia do alerta e a mudança de contexto
        Alert alert = driver.switchTo().alert();
        //Pego o texto do alerta e guardo na variavel
        String text = alert.getText();
        alert.accept();

        //Validar o conteudo
        Assert.assertEquals("I am an alert box!", text);

        //Fechamento  o alerta
        alert.dismiss();
        driver.quit();





    }
}