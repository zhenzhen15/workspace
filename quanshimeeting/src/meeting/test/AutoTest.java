package meeting.test;

import meeting.tool.UiAutomatorTool;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class AutoTest extends UiAutomatorTestCase {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new UiAutomatorTool("quanshi","meeting.cases.QuanShi" ,"testCase","1");
	}

}
