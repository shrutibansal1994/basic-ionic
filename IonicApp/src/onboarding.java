import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class onboarding extends basisOfHybrid {

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("TSRSETS");
        // System.out.println(driver.findElementByAndroidUIAutomator("text(\"ENTER URL\")"));
        // driver.findElementByAndroidUIAutomator("text(\"ENTER URL\")").sendKeys("https://www.facebook.com");
        // System.out.println(driver.getContextHandles());
        Set<String> contexts = driver.getContextHandles();
        for (String context : contexts) {
           System.out.println(contexts);
          if (context.contains("WEBVIEW")) {
              driver.context(context);
              break;
          }
      }
      System.out.println("execute context switch successfully!!!  "
             + driver.getContext());
     
     //driver.quit();

      // driver.findElementByClassName("example.example").click();
        //System.out.println(driver.getContext());
        //driver.context("WEBVIEW_sworkitapp.sworkit.com");
    }

}