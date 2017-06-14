package mail.test.cases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import mail.test.publics.LoginUser;
public class LoginTest {
	private WebDriver driver;
	private String baseUrl;
	@BeforeMethod
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	baseUrl = "http://www.126.com";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testCase() throws Exception {
	driver.get(baseUrl);
	String username = "testingwtb";
	String password = "a123456";
	//调用登录模块
	LoginUser.login(driver,username,password);
	Thread.sleep(5000);
	//验证
	String text = LoginUser.login_user_info(driver);
	Assert.assertEquals(text,username+"@126.com");
	//调用退出模块
	LoginUser.logout(driver);
	}
	@AfterMethod
	public void tearDown() throws Exception {
	driver.quit();
	}
	}
	
