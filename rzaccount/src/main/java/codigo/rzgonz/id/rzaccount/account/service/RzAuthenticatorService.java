package codigo.rzgonz.id.rzaccount.account.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import codigo.rzgonz.id.rzaccount.account.RzAuthenticator;

/**
 * Created by rzgonz on 8/10/17.
 */

public class RzAuthenticatorService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
     RzAuthenticator rzAuthenticator = new RzAuthenticator(this);
        return rzAuthenticator.getIBinder();
    }
}
