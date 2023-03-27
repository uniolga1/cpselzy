import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


public class SelzyLog {

    @Test
    public void selzyLog(){
        open("https://cp.selzy.com/ua/v5/login");
        $x("//div[@class='newAuth_inputContainer']//input[@placeholder='Enter email']")
                .setValue("test@gmail.com").shouldBe(Condition.value("test@gmail.com"));

        $x("//div[@class='newAuth_inputContainer']//input[@placeholder='Enter password']")
                .setValue("password").shouldBe(Condition.value("password"));

        $x( "//div[@class='loader loader_gray newAuth_loader']//input[@type='submit']")
                .shouldBe(Condition.visible).click();
    }
}