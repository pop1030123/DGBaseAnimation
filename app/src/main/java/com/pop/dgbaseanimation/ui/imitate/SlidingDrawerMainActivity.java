package com.pop.dgbaseanimation.ui.imitate;

import android.widget.SlidingDrawer;

import com.pop.dgbaseanimation.R;
import com.pop.dgbaseanimation.ui.base.BaseActivity;

public class SlidingDrawerMainActivity extends BaseActivity {
	/** Called when the activity is first created. */
	private SlidingDrawer mSlidingDrawer;

	@Override
	public void setView() {
		setContentView(R.layout.activity_imitate_slidingdrawer_main);

	}

	@Override
	public void initView() {
		mSlidingDrawer = (SlidingDrawer) findViewById(R.id.drawer);

	}

	@Override
	public void setListener() {
		// TODO Auto-generated method stub

	}
}