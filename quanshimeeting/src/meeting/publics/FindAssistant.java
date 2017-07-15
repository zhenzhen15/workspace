package meeting.publics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import android.bluetooth.BluetoothClass.Device;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class FindAssistant  extends UiAutomatorTestCase{

	/**
	 * @param args
	 */
	private FindAssistant(){}
	private static FindAssistant findAssistant = null;
	
	public  static FindAssistant getInstance(){
		if (findAssistant ==null){
			findAssistant = new FindAssistant();
		}
		return findAssistant;
	}
	
//	UiDevice device;
//	FindAssistant(UiDevice device){
//		this.device =device;
//	}
	
	/* 定义log 存放地址*/
	private static String logpath = "/sdcard/log/performancellog.txt";
	
	/*定义通过哪种方式获得uiselector的int标识*/
	static final int  CLICK_ID = 10;
	static final int  CLICK_TEXT = 20;
	static final int  CLICK_CLASS = 30;
	public boolean ClickById(String id){
		return ClickInfo(CLICK_ID,id) ;
	}
	
	public static boolean ClickByText(String text){
		return ClickInfo(CLICK_TEXT, text);
	}
	public static boolean ClickByClassName(String classname,int i) {
		return ClickInfo(CLICK_CLASS, classname,i);		
	}
	
	
	public  static boolean ClickInfo( int CLICK ,String str,int ...args){
		UiSelector uislector = null;
		switch(CLICK){
		case CLICK_ID : uislector = new UiSelector().resourceId(str);break;
		case CLICK_TEXT: uislector = new UiSelector().text(str); break;
		case CLICK_CLASS: uislector = new UiSelector().className(str).index(args[0]);break;
		default : return false;
		
		}
		
		UiObject uiobject = new UiObject(uislector);
		int i =0;
		while(!uiobject.exists()&& i<5){
			sleep(500);
			if(i==4){
				TakeScreen(getDevice(), str+"-not-find");
				return false;
			}
			i++;
			
			
		}
		try {
			UiAutomationLog(" click type:"+CLICK+" content:"+str);
			uiobject.click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
		
		
	}
	public static void TakeScreen(UiDevice device,String descrip){
		//获取当前时间
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		String dateStr = calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(calendar.SECOND);
		
		//保存文件
		File screens = new File("/sdcard/screens");
		if(!screens.exists()&&!screens.isDirectory()){
			System.out.println("create new folder :/sdcard/screens");
			screens.mkdir();
		}else {
			System.out.println("Already have Folder：/sdcard/screens");
		}
		File files = new File("/sdcard/screens/"+dateStr+"_"+descrip+".png");
		UiAutomationLog("TakeScreen:"+dateStr+"_"+descrip+".jpg");
		device.takeScreenshot(files);
		
	}
	
	public static void  UiAutomationLog(String str) {
		//获取当前时间
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		String dateStr = calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(calendar.MINUTE)+":"+calendar.get(calendar.SECOND);
		FileWriter fwlog = null;
		
		try {
			fwlog = new FileWriter(logpath,true);
			fwlog.write(dateStr+str+"\r\n");
			System.out.println(dateStr+str);
			fwlog.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fwlog.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void sleep(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static  UiDevice getDevice() {
		
		return UiDevice.getInstance();
		
	}

}
