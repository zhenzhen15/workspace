package testpackage;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class MessageTestCase extends UiAutomatorTestCase {  
    public void testDemo() throws UiObjectNotFoundException{  
        //获取UiDevice对象  
        UiDevice device = getUiDevice();  
          
        //点击home键操作  
        device.pressHome();  
          
        //如截图中提到的，我们使用content-desc属性Apps选择所有应用列表  
        UiObject appsTab = new UiObject(new UiSelector().description("Apps"));  
        appsTab.click();  
          
        //因为短信界面在第二个列表页面，所以我们可以先滑动一下  
        //通过scrollable属性来选定滑动view  
        UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));  
        appViews.setAsHorizontalList();  
        appViews.scrollForward();  
          
        //通过类名和Text找到短信应用图标，Text获取通过uiautomatorviewer  
        UiObject messageApp = appViews.getChildByText(new UiSelector().className(android.widget.TextView.class.getName()), "Messaging");  
        //点击并等待打开短信应用  
        messageApp.clickAndWaitForNewWindow();  
          
        //选择新建短信  
        UiObject newMessage = new UiObject(new UiSelector().description("New message"));  
        newMessage.click();  
          
        //选择编辑信息  
        UiObject editMessage = new UiObject(new UiSelector().text("Type text message"));  
        editMessage.click();  
        editMessage.setText("hello world!");  
    }  
}  