import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkBoxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        boolean isCheckboxSelected = checkboxes.get(0).isSelected();
        assertFalse(isCheckboxSelected, "Message 1");
        checkboxes.get(0).click();
        isCheckboxSelected = checkboxes.get(0).isSelected();
        assertTrue(isCheckboxSelected, "Message 2");

        isCheckboxSelected = checkboxes.get(1).isSelected();
        assertTrue(isCheckboxSelected, "Message 3");
        checkboxes.get(1).click();
        isCheckboxSelected = checkboxes.get(1).isSelected();
        assertFalse(isCheckboxSelected, "Message 4");
    }
}