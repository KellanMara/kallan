package com.krayrr;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by Shaikh Aquib on 26-Apr-18.
 */

public class Global {
    public static final int CONNECTION_TIMEOUT = 10000;
    public static final int READ_TIMEOUT = 15000;
    public static String id = null;
    public static String uid = null;
    public static String ltype = null;
    public static String email = null;
    public static String mobile = null;
    public static String username = null;
    public static String carregno  = null;
    public static String fueltype = null;
    public static String carno    = null;
    public static String Sessionid = null;

    public static int notificationcount = 0;

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}
