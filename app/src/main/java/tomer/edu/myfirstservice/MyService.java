package tomer.edu.myfirstservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by azubakov on 7/15/16.
 */
public class MyService extends Service{

    @Override
    public void onCreate() {
       // super.onCreate();
        Log.i("MY_SERVICE", "Your service began creation");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
