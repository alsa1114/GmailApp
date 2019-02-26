import org.junit.Test;

import static util.ExpCondUtil.css;
import static util.ExpCondUtil.x;

public class Authorization extends Suite{


    /*Login Page*/
    @Test
    public void testLogIn() {

        css(MAIL_ID).sendKeys(SET_MAIL_ADDRESS);
        css(NEXT_BTN).click();
        x(FIND_PASSWORD_FIELD).sendKeys(PASSWORD);
        css(PASSWORD_BUTTON).click();
    }

    /*Logout Page*/
    @Test
    public void testLogOut() {

        css(FIND_ICON).click();
        x(EXIT_BUTTON).click();
    }
}
