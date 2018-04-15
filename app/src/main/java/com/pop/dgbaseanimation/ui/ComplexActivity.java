package com.pop.dgbaseanimation.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.pop.dgbaseanimation.ContantValue;
import com.pop.dgbaseanimation.R;
import com.pop.dgbaseanimation.R.anim;
import com.pop.dgbaseanimation.R.id;
import com.pop.dgbaseanimation.R.layout;
import com.pop.dgbaseanimation.adapter.AnimationAdapter;
import com.pop.dgbaseanimation.ui.base.BaseActivity;

/**
 * 复杂动画页面
 * @author duguang
 * 博客地址:http://blog.csdn.net/duguang77
 */
public class ComplexActivity extends BaseActivity implements
		OnItemClickListener {

	private AnimationAdapter adapter;
	private ListView listView_anim_complex;

	@Override
	public void setView() {
		setContentView(R.layout.activity_anim_complex);

	}

	@Override
	public void initView() {
		listView_anim_complex = (ListView) findViewById(R.id.listView_anim_complex);

		adapter = new AnimationAdapter(this, ContantValue.animName);
	}

	@Override
	public void setListener() {
		listView_anim_complex.setAdapter(adapter);
		listView_anim_complex.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Animation anim = AnimationUtils.loadAnimation(ComplexActivity.this,
				ContantValue.complex[position]);
		listView_anim_complex.startAnimation(anim);
	}

}
