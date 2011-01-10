package com.example.android.libuser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by IntelliJ IDEA.
 * User: rob
 * Date: 9/01/11
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ActionActivity extends Activity {

    protected static final Class mActivityClass = ActionActivity.class;

    public static Intent createIntent(Context context) {
        Intent i = new Intent(context, mActivityClass);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return i;
    }

    protected Intent createShareIntent() {
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Shared from the ActionBar widget.");
        return Intent.createChooser(intent, "Share");
    }
}
