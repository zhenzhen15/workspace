package mail.test.publics;

import org.openqa.selenium.*;
import mail.test.page.LoginPage;

public class LoginUser {
	// ��¼����
	public static void login(WebDriver driver, String username, String password) {
		LoginPage.login_UserName(driver).clear();
		LoginPage.login_UserName(driver).sendKeys(username);
		LoginPage.login_Password(driver).clear();
		LoginPage.login_Password(driver).sendKeys(password);
		LoginPage.login_Button(driver).click();
	}

	// ��¼�û�
	public static String login_user_info(WebDriver driver) {
		String text = LoginPage.login_User(driver).getText();
		return text;
	}

	public static String login_error_info(WebDriver driver) {
		String text = LoginPage.login_Error_Hint(driver).getText();
		return text;
	}

	// �˳�����
	public static void logout(WebDriver driver) {
		LoginPage.logout_Button(driver).click();
	}
}