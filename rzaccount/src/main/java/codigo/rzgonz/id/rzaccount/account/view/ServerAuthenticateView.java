package codigo.rzgonz.id.rzaccount.account.view;

/**
 * Created by rzgonz on 8/10/17.
 */

public interface ServerAuthenticateView {
    public String userSignUp(final String name, final String email, final String pass, String authType) throws Exception;
    public String userSignIn(final String user, final String pass, String authType) throws Exception;

}
