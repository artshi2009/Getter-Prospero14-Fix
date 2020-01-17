package sample;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Parser {
    private String textLine;

    Parser() {
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriver driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));

        driver.get("https://habr.com/ru/search/?q=java#h");
        System.out.println("done");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.className("post__title_link")).click();
        textLine = driver.findElement(By.xpath("//div[@class='post__body post__body_full']")).getText();
        driver.quit();
    }

    public String getTextLine(){
        return textLine;
    }

}
