package com.pop.dgbaseanimation.ui.customview.foldablelayout.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class FoldableBaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getActionBar() != null) getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
