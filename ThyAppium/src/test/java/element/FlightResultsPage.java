package element;

import io.appium.java_client.MobileElement;

import java.util.List;

public class FlightResultsPage extends Elements{
    public static MobileElement flightAreaBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_rvFlight");
    public static List<MobileElement> flightListBy = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"androidx.recyclerview.widget.RecyclerView\"]/android.view.ViewGroup/android.widget.FrameLayout");
    public static List<MobileElement> selectEcoFlightBy = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"android.widget.LinearLayout\"]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    public static MobileElement continueButtonBy = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");

}
