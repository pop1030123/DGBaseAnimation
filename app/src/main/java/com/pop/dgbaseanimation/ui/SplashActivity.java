package com.pop.dgbaseanimation.ui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.res.AssetManager;
import android.view.Window;

import com.pop.dgbaseanimation.R;
import com.pop.dgbaseanimation.ui.base.BaseActivity;
import com.pop.dgbaseanimation.utils.ToastUtils;

public class SplashActivity extends BaseActivity {

	@Override
	public void setView() {
		getWindow().requestFeature(Window.FEATURE_PROGRESS); //去标题栏 
		setContentView(R.layout.activity_splash);
	}

	@Override
	public void initView() {
		
	}

	@Override
	public void setListener() {
		// TODO Auto-generated method stub
		
	}
	
}
