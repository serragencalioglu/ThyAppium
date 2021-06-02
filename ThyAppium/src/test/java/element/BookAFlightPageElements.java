package element;

import io.appium.java_client.MobileElement;

import java.util.List;

public class BookAFlightPageElements extends Elements{

    public static MobileElement oneWayButtonBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    public static MobileElement fromToButtonBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
    public static MobileElement fromToSearchBoxButtonBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    public static MobileElement fromToSelectResultBy = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    public static MobileElement goToButtonBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_llTo");
    public static MobileElement goToSearchBoxButtonBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    public static MobileElement goToSelectResultBy = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    public static MobileElement dateButtonBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
    public static List<MobileElement> dateListBy = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"android.view.ViewGroup\"]/android.view.ViewGroup/android.widget.FrameLayout");
    public static MobileElement doneButtonBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
    public static MobileElement addingPersonButtonBy = (MobileElement)driver.findElementByXPath("//*[@class='android.widget.TextView' and @bounds='[925,1040][1079,1194]']");
    public static MobileElement searchFlightBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");
}
