package testpackage;

import java.io.File;

import javax.xml.soap.SAAJResult;

import android.os.RemoteException;
import android.widget.ScrollView;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestPlayMusic extends UiAutomatorTestCase {
	public void testPlayMusic() throws Exception{
		System.out.println("=====演示1：判断手机是否处于唤醒状态");
		UiDevice device = getUiDevice();
		getUiDevice().wakeUp();
		assertTrue("手机处于唤醒状态",device.isScreenOn());
		
		System.out.println("===演示2：初始化手机和应用");
		
		//execCommand("adb shell pm clearcom.tencent.qqmusic");
		
		device.pressHome();
		
		System.out.println("===演示3：启动应用，排除一切干扰进入首页");
		Runtime.getRuntime().exec("am start com.tencent.qqmusic/.activity.AppStarterActivity");
		sleep(3000);
		
		System.out.println("===演示4：获取一些关键信息");
		System.out.println(">>package name:"+ device.getCurrentPackageName());
		System.out.println(">> width:"+ device.getDisplayWidth());
		System.out.println(">>hight:"+ device.getDisplayHeight());
		System.out.println(device.getProductName());
		
		System.out.println(">>打开快速设置");
		device.openQuickSettings();
		
		File f = new File("data/local/tmp/screenshot.png");
		device.takeScreenshot(f);
		
		
		//execCommand("adb pull data/local/tmp/screenshot.png D:/jenny/persion/study/selenium/workspace/TestAnroid");
		
		System.out.println(">>收起快速设置");
		device.drag(223, 721,223, 42, 1);
		sleep(3000);
		
		System.out.println("===演示6：通过resouceId 和text查找控件");
		
		System.out.println(">>点击 音乐馆");
		
		UiObject myMusic = new UiObject(new UiSelector().resourceId("com.tencent.qqmusic:id/a5s"));
		myMusic.clickAndWaitForNewWindow();
		//device.removeWatcher("进入首页异常");
		
		System.out.println(">>点击分类歌单");
		UiObject radio = new UiObject(new UiSelector().text("音乐馆"));
		radio.click();
		
		int count = 0;
		while (!new UiObject(new UiSelector().text("睡前")).exists()& count<20){
			sleep(1000);
			count ++;
			System.out.println("sleep 1 seconds");
		}
		System.out.println("===演示7：如何滑动界面");
		System.out.println(">> 滑动到 显示出来");
		UiScrollable scrollradio = new UiScrollable(new UiSelector().resourceId("com.tencent.qqmusic:id/bme"));
		
		System.out.println("===演示8：如何使用控件集合UiCollection");
		
		UiSelector listView = new UiSelector().resourceId("");
		System.out.println(">>listView 下的子控件数量："+ new UiCollection(listView).getChildCount());
		System.out.println();
		
		
	
		
		
	}

	
}
