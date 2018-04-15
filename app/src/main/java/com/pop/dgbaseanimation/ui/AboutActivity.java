package com.pop.dgbaseanimation.ui;

import com.pop.dgbaseanimation.R;
import com.pop.dgbaseanimation.ui.base.BaseActivity;
import com.pop.dgbaseanimation.utils.ApkInfoTool;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * 关于页面
 * @author duguang
 * 博客地址:http://blog.csdn.net/duguang77
 */
public class AboutActivity extends BaseActivity implements OnClickListener {
	
	private TextView textView_VersionName;
	private TextView tv_address;
	@Override
	public void setView() {
		setContentView(R.layout.activity_about);
		
	}

	@Override
	public void initView() {
		textView_VersionName = (TextView) findViewById(R.id.textView_VersionName);
		tv_address = (TextView) findViewById(R.id.tv_address);
		
		textView_VersionName.setText("版本号:"+ApkInfoTool.getVersionName(this));
	
	}

	@Override
	public void setListener() {
		tv_address.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv_address:
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setData(Uri.parse("http://blog.csdn.net/duguang77"));
			startActivity(intent);
			break;

		default:
			break;
		}
		
	}
}
