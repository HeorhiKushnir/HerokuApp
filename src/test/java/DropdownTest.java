import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdown() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        List<WebElement> options = new Select(driver.findElement(By.id("dropdown"))).getOptions();
        String optionTextFirst = options.get(0).getText();
        assertEquals(optionTextFirst, "Please select an option", "Wrong element 1");
        String optionTextSecond = options.get(1).getText();
        assertEquals(optionTextSecond, "Option 1", "Wrong element 2");
        String optionTextThird = options.get(2).getText();
        assertEquals(optionTextThird, "Option 2", "Wrong element 3");

        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 1");
        assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 1", "Wrong option 1");
        dropdown.selectByVisibleText("Option 2");
        assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 2", "Wrong option 2");
    }
}
