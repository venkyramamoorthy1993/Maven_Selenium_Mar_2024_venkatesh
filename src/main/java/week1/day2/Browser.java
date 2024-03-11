package week1.day2;

public class Browser {

	public void launchBrowser(String UserName) {
		System.out.println(UserName+" Browser Launched successfully");
//		return UserName;
	}

	public void loadUrl(int values) {
		System.out.println(values+" Application URL's Loaded successfully");
//		return values;
	}
	public static void main(String[] args) {
		Browser object = new Browser();
		String browserName = "chrome";
		int appCount = 10;
		object.launchBrowser(browserName);
		object.loadUrl(appCount);
	}
}
