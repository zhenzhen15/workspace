package testpackage;

import android.os.RemoteException;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestClass extends UiAutomatorTestCase {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public void testDemo() throws Exception {
		getUiDevice().wakeUp();
		getUiDevice().pressHome();
	}
}
