import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandlesAssign {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        String parentWindow = it.next();
        String childWindow = it.next();

        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());

        driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());
    }
}
