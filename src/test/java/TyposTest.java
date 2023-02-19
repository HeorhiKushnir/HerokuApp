import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {
    @Test
    public void typosText() {
        driver.get("http://the-internet.herokuapp.com/typos");
        for (int i = 0; i < 10; i++) {
            driver.navigate().refresh();
            List<WebElement> typoText = driver.findElements(By.tagName("p"));
            String correctOrNotTypoText = typoText.get(1).getText();
            assertEquals(correctOrNotTypoText, "Sometimes you'll see a typo, other times you won't.",
                    "Wrong typo text");
        }
    }
}
