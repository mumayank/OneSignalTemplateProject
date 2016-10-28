package mumayank.hireff;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by mumay on 28-10-16.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.DEBUG, OneSignal.LOG_LEVEL.DEBUG);

        OneSignal.startInit(this).init();

        // Sync hashed email if you have a login system or collect it.
        //   Will be used to reach the user at the most optimal time of day.
        // OneSignal.syncHashedEmail(userEmail);
    }
}
