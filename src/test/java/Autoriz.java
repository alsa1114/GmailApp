import org.testng.annotations.BeforeMethod;

import static util.ExpCondUtil.css;
import static util.ExpCondUtil.x;

public class Autoriz extends Suite {

    @BeforeMethod
    public void testLogIn() {

        css(MAIL_ID).sendKeys(SET_MAIL_ADDRESS);
        css(NEXT_BTN).click();
        x(FIND_PASSWORD_FIELD).sendKeys(PASSWORD);
        css(PASSWORD_BUTTON).click();
    }
}
