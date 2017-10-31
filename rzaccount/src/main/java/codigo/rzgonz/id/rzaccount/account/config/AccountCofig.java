package codigo.rzgonz.id.rzaccount.account.config;

import codigo.rzgonz.id.rzaccount.account.presenter.ServerAuthenticatePresenter;
import codigo.rzgonz.id.rzaccount.account.view.ServerAuthenticateView;

/**
 * Created by rzgonz on 8/10/17.
 */

public class AccountCofig {

    /**
     * Account type id
     */
    public static final String ACCOUNT_TYPE = "com.udinic.auth_example";

    /**
     * Account name
     */
    public static final String ACCOUNT_NAME = "Udinic";

    /**
     * Auth token types
     */
    public static final String AUTHTOKEN_TYPE_READ_ONLY = "Read only";
    public static final String AUTHTOKEN_TYPE_READ_ONLY_LABEL = "Read only access to an Udinic account";

    public static final String AUTHTOKEN_TYPE_FULL_ACCESS = "Full access";
    public static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access to an Udinic account";

    public static final ServerAuthenticateView sServerAuthenticate = new ServerAuthenticatePresenter();


    public final static String ARG_ACCOUNT_TYPE = "ACCOUNT_TYPE";
    public final static String ARG_AUTH_TYPE = "AUTH_TYPE";
    public final static String ARG_ACCOUNT_NAME = "ACCOUNT_NAME";
    public final static String ARG_IS_ADDING_NEW_ACCOUNT = "IS_ADDING_ACCOUNT";

    public static final String KEY_ERROR_MESSAGE = "ERR_MSG";

    public final static String PARAM_USER_PASS = "USER_PASS";

    private final int REQ_SIGNUP = 1;



}
