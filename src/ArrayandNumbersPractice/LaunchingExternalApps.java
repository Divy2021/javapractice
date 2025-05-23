package ArrayandNumbersPractice;

import java.io.IOException;

public class LaunchingExternalApps {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime(); // getting Runtime object
		
		try {
			runtime.exec("PowerPoint C:\\\\One page profile 81.pptx"); // opens new notepad instance
			// OR runtime.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
