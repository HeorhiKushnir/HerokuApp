import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {
    @Test
    public void inputDigitsAndChars() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputElement = driver.findElement(By.tagName("input"));
        inputElement.sendKeys("A5");
        inputElement.sendKeys(Keys.ARROW_UP);
        String currentValue1 = inputElement.getAttribute("value");
        assertEquals(currentValue1, "6", "Wrong value");
        inputElement.sendKeys(Keys.ARROW_DOWN);
        String currentValue2 = inputElement.getAttribute("value");
        assertEquals(currentValue2, "5", "Wrong value");
    }
}
