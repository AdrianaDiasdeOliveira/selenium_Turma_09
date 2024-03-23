package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SeleniumPrimeiraClasse {
    @Test
    public void testSelenium() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        // Mapeamento do campo FirstName
        driver.findElement(By.xpath("  //*[@ng-model='FirstName']")).sendKeys("Adriana");

        // Mapeamento do campo LastName
        driver.findElement(By.xpath(" //*[@ng-model='LastName']")).click();
        driver.findElement(By.xpath(" //*[@ng-model='LastName']")).sendKeys("Dias ");

        // Mapeamento do campo Endereço
        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).click();
        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Rua efigênia Siqueira Gonçalvez, Nº 628");

        // Mapeamento do campo email
        driver.findElement(By.xpath(" //input[@type='email']")).click();
        driver.findElement(By.xpath(" //input[@type='email']")).sendKeys("adriana.dias3003@gmail.com");

        // Mapeamento do campo Phone
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).click();
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("(11) 960719945 ");

        // Mapeamento do campo Sexo
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();

        // Mapeamento do campo Hobbies
        driver.findElement(By.xpath("//input[@value='Movies']")).click();

        // Mapeamento do campo Linguage
        driver.findElement(By.xpath("//div[@id='msdd']")).click();


        //Expandir lista languages
        driver.findElement(By.xpath("//div[@id='msdd']")).click();

        //Clica na linguagem
        driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();

        // Mapeamento do campo Skills

        Select select = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
        select.selectByVisibleText("Java");

        //Lista Paises

        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'United States of America')]")).click();

        //Lista Select Data de nascimento

        WebElement elementAno = driver.findElement(By.xpath("//select[@id='yearbox']"));
        Select selectAno = new Select(elementAno);
        selectAno.selectByVisibleText("2009");

        WebElement elementMes = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
        Select selectMes = new Select(elementMes);
        selectMes.selectByVisibleText("December");

        WebElement elementDia = driver.findElement(By.xpath("//select[@id='daybox']"));
        Select selectDia = new Select(elementDia);
        selectDia.selectByVisibleText("25");

        //Preenchemos a senhas
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("QA Academy");
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("QA Academy");

               //Clicamos em submit
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();


        //Finalizar

        driver.quit();

    }


}
