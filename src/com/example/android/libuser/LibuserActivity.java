package com.example.android.libuser;

import android.app.Activity;
import android.os.Bundle;
import com.markupartist.android.widget.ActionBar;

public class LibuserActivity extends ActionActivity
{

    protected static final Class mActivityClass = LibuserActivity.class;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ActionBar actionBar = (ActionBar) findViewById(R.id.actionbar);
        actionBar.setTitle("Libuser");
        actionBar.addAction(new ActionBar.IntentAction(this, createShareIntent(), R.drawable.ic_title_share_default));
    }
}
