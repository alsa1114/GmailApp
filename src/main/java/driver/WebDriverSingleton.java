package driver;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriverSingleton {

    private static WebDriver driver;

    private static final String SITE = "https://gmail.com";


    public static WebDriver getInstance() {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(SITE);
        }
        return driver;
    }
    public static WebDriver init(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        if (driver==null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(SITE);
        }
        return driver;
    }
}
