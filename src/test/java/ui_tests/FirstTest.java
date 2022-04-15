package ui_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void checkYandexStartPage() {
        driver.get("https://yandex.ru/");
        driver.findElement(By.xpath("//input[@class='input__control input__input mini-suggest__input']")).sendKeys("купить телефон");
        driver.findElement(By.xpath("//div[@class='search2__button']//button")).click();
    }

    @Test
    public void checkGoogleStartPage() {
        driver.get("https://www.google.ru/");
    }
}
