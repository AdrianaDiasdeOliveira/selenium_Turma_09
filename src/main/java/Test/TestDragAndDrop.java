package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestDragAndDrop {

    @Test

    public void testDradAndDrop() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Static.html");

        // https://www.selenium.dev/documentation/webdriver/actions_api/mouse/#drag-and-drop-on-element

        WebElement draggable = driver.findElement(By.xpath("//img[@id='node']")); // Elemento Inicial
        WebElement droppable = driver.findElement(By.xpath("//div[@id='droparea']"));  // Quadro onde o elemento vai ser arrastado

        new Actions(driver)  // Mover para o elemento
                .dragAndDrop(draggable, droppable)
                .perform();


//        WebElement draggable2 = driver.findElement(By.xpath("//img[@id='mongo']")); // Elemento Inicial
//        WebElement droppable2 = driver.findElement(By.xpath("//div[@id='droparea']"));  // Quadro onde o elemento vai ser arrastado
//
//        new Actions(driver)  // Mover para o elemento
//                .dragAndDrop(draggable2, droppable2)
//                .perform();
    }


}
