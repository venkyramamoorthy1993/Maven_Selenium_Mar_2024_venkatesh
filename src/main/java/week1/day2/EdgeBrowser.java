package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser edgeObject = new Browser();
		String browserName = "edge";
		int appCount = 5;
		edgeObject.launchBrowser(browserName);
		edgeObject.loadUrl(appCount);
	}

}
