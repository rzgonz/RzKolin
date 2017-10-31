package codigo.rzgonz.id.rzaccount.account.presenter;

import android.util.Log;

import codigo.rzgonz.id.rzaccount.account.view.ServerAuthenticateView;

/**
 * Created by rzgonz on 8/10/17.
 */

public class ServerAuthenticatePresenter implements ServerAuthenticateView {
    @Override
    public String userSignUp(String name, String email, String pass, String authType) throws Exception {

        if(name.contains("rzgonz")&&pass.contains("setiyawan"))
            Log.d("AuthPresenter","userSignUp");

        return "userSignUp" ;
    }

    @Override
    public String userSignIn(String user, String pass, String authType) throws Exception {
        if(user.contains("rzgonz")&&pass.contains("setiyawan"))
            Log.d("AuthPresenter","userSignIn");
        return "userSignIn" ;
    }
}
