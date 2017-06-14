package quanshipacage;
import java.io.IOException;

import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;





public class QuanShi extends UiAutomatorTestCase{
	String size;
	long starttime;
	long endtime;
	public void testDemo() throws UiObjectNotFoundException, IOException, RemoteException{
		
//			//启动app
//			getUiDevice().wakeUp();
//			getUiDevice().swipe(100, 1178, 700, 1178, 50);
//			sleep(5000);
//			Runtime.getRuntime().exec("am start -S -n com.gnet.onemeeting/.LaunchActivity");
			Runtime.getRuntime().exec("am start -S com.gnet.onemeeting/com.gnet.onemeeting.LaunchActivity");
			//com.gnet.onemeeting/.login.LoginActivity
			sleep(5000);
			//环境设置
			UiObject logoObject= new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/iv_default_logo"));
			logoObject.click();
			UiObject selectEnvObject= new UiObject(new UiSelector().className("android.widget.RadioButton").index(5));
			selectEnvObject.click();
			UiObject saveBtnObject=new UiObject(new UiSelector().className("android.widget.Button").text("确定"));
			saveBtnObject.click();
			//getUiDevice().sleep();
			//输入账号
			UiObject unameObject=new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/et_useraccount"));
			
			if(unameObject.getText()==null){
			     unameObject.click();
			     unameObject.setText("tangtestd_js02@quanshi.com");
			}else{
			     //unameObject.clearTextField();
			      getUiDevice().click(640, 579);
			     unameObject.click();
			     unameObject.setText("tangtestd_js02@quanshi.com");
			}
			
			//输入密码
			UiObject pwdObject=new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/et_password"));
			if(pwdObject.getText()==null){
				pwdObject.click();
				
				pwdObject.setText("2018311836");
			}else{
				//pwdObject.clearTextField();
				 getUiDevice().click(640, 671);
                pwdObject.click();
				pwdObject.setText("2018311836");
				
			}
			
			
			
			
			//收起键盘
			getUiDevice().click(700,1205);
			//点击登录
			UiObject loginObject=new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/btn_login"));
			loginObject.click();
		
			for(int i =1;i<=2;i++){
			//输入会议密码
			UiObject confpwdObject = new UiObject(new UiSelector().className("android.widget.EditText").text("请输入会议密码"));
			confpwdObject.click();
			confpwdObject.setText("2018311865");
			
			
			//立即入会
//			
            getUiDevice().click(500, 800);
			UiObject joinbutobject1 = new UiObject(new UiSelector().text("立即入会"));
		    joinbutobject1.click();
		    
			
			//选择语音网络
		    sleep(5000);
			getUiDevice().click(130,1050);
			
					    
//		    UiObject confvoice = new UiObject(new UiSelector().className("android.widget.ImageView").enabled(true).instance(0));
//		    confvoice.click();
		    sleep(5000);
			//滑动面板
		    
            UiScrollable scro = new UiScrollable(new UiSelector().scrollable(true));
            scro.swipeLeft(40);
            sleep(5000);

            //开启视频
            getUiDevice().click(200,600);
            UiObject openvideo = new UiObject(new UiSelector().className("android.widget.LinearLayout").clickable(true).index(1));
            openvideo.click();
            sleep(5000);
            //开启静音
            getUiDevice().click(200,600);
            UiObject  silentmode = new UiObject(new UiSelector().className("android.widget.LinearLayout").clickable(true).index(3));
            silentmode.click();
            sleep(5000);
            //关闭静音
            getUiDevice().click(200,600);
            UiObject  closesilentmode = new UiObject(new UiSelector().className("android.widget.LinearLayout").clickable(true).index(3));
            closesilentmode.click();
            sleep(5000);
            //退会
            getUiDevice().click(200,600);
            UiObject exitmeeting = new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/meeting_exit_meeting_btn"));
            exitmeeting.click();
            sleep(5000);
			//点击取消
            UiObject menu_cancel = new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/menu_cancel"));
            menu_cancel.click();
            sleep(3000);
            
            //进入参会列表
            getUiDevice().click(200,600);
            UiObject meeting_user_list_btn = new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/meeting_user_list_btn"));
            meeting_user_list_btn.click();
            sleep(3000);
            //点击箭头
            UiObject id_user_list_func_iv = new UiObject(new UiSelector().className("android.widget.ImageView").resourceId("com.gnet.onemeeting:id/id_user_list_func_iv"));
            id_user_list_func_iv.click();
            sleep(5000);
            //查看会议信息
            
//            UiObject id_item_user_list_func_iv = new UiObject(new UiSelector().className("android.widget.LinearLayout").clickable(true).instance(0));
//            id_item_user_list_func_iv.click();
//            sleep(5000);
//            
//			//点击返回按钮
//            UiObject backbutton = new UiObject(new UiSelector().className("android.widget.ImageView").index(0));
//            backbutton.click();
//            sleep(3000);
			//点击聊天进入聊天界面
            UiObject id_item_user_list_func_tv = new UiObject(new UiSelector().className("android.widget.LinearLayout").clickable(true).instance(1));
            id_item_user_list_func_tv.click();
            sleep(5000);
            
            //开始聊天
            for(int j=1;j<=3;j++){
            UiObject chat_text_tv = new UiObject(new UiSelector().className("android.widget.EditText").resourceId("com.gnet.onemeeting:id/chat_text_tv"));
            chat_text_tv.click();
            chat_text_tv.setText("testcase");
            sleep(2000);
            //点击发送按钮
            
            UiObject common_send_btn = new UiObject(new UiSelector().className("android.widget.Button").resourceId("com.gnet.onemeeting:id/common_send_btn"));
            common_send_btn .click();
            sleep(2000);
            }
            
            //点击返回箭头
            UiObject backbutton1 = new UiObject(new UiSelector().className("android.widget.ImageView").index(0));
            backbutton1.click();
            sleep(5000);
           //滑动面板
		    
            UiScrollable scro1 = new UiScrollable(new UiSelector().scrollable(true));
            scro1.swipeLeft(40);
            sleep(5000);
            //退会
            getUiDevice().click(200,600);
            UiObject exitmeeting1 = new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/meeting_exit_meeting_btn"));
            exitmeeting1.click();
            sleep(5000);
			//点击离开会议
            UiObject menu_item_2 = new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/menu_item_2"));
            menu_item_2.click();
            sleep(3000);
            }
	
	}
	public void sleep(int times){
		try {
			Thread.sleep(times);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
