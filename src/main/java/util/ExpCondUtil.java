package util;

import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpCondUtil {

    public static WebElement x(final String s) {
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 20);
        return wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(s))));
    }

    public static WebElement id(final String s) {
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 20);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.id(s)) != null;
            }
        });
        return WebDriverSingleton.getInstance().findElement(By.id(s));
    }

    public static WebElement css(final String s) {
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 20);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.cssSelector(s)) != null;
            }
        });
        return WebDriverSingleton.getInstance().findElement(By.cssSelector(s));
    }

    public static WebElement name(final String s) {
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 20);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.name(s)) != null;
            }
        });
        return WebDriverSingleton.getInstance().findElement(By.name(s));
    }

}
