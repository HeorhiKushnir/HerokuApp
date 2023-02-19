import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class SortableDataTablesTest extends BaseTest {
    @Test
    public void cellContent() {
        driver.get("http://the-internet.herokuapp.com/tables");
        String cell1 = driver.findElement(By.xpath("//table//tr[1]//td[1]")).getText();
        assertEquals(cell1, "Smith", "Wrong last name");
        String cell2 = driver.findElement(By.xpath("//table//tr[2]//td[2]")).getText();
        assertEquals(cell2, "Frank", "Wrong name");
        String cell3 = driver.findElement(By.xpath("//table//tr[3]//td[3]")).getText();
        assertEquals(cell3, "jdoe@hotmail.com", "Wrong email");
    }
}
