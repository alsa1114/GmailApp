import org.junit.Test;

import static util.ExpCondUtil.css;
import static util.ExpCondUtil.name;
import static util.ExpCondUtil.x;

public class WriteMessage extends Suite{


    @Test
    public void testWriteMessage() {

        css(FIND_WRITE_BUTTON).click();
        x(TO).sendKeys(SET_MAIL_ADDRESS);
        name(SUBJECT_BOX).sendKeys(SUBJECT_BOX_ADD);
        css(FIND_MESSAGE_FIELD).sendKeys(TEXT_OF_MESSAGE);
        x(SEND_MESSAGE_BUTTON).click();


    }

}


