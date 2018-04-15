package com.pop.dgbaseanimation.ui.imitate;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.pop.dgbaseanimation.ContantValue;
import com.pop.dgbaseanimation.R;
import com.pop.dgbaseanimation.adapter.AnimationAdapter;
import com.pop.dgbaseanimation.ui.base.BaseActivity;
import com.pop.dgbaseanimation.ui.imitate.TaobaoPathbutton.TaobaoActivity;
import com.pop.dgbaseanimation.ui.imitate.addshopcartanim.AddShopCartMainActivity;
import com.pop.dgbaseanimation.ui.imitate.biaopan.BiaoPanMainActivity;
import com.pop.dgbaseanimation.ui.imitate.fang360.RootblockMainActivity;
import com.pop.dgbaseanimation.ui.imitate.gallery.GalleryMainActivity;
import com.pop.dgbaseanimation.ui.imitate.taobaoPath2.PathMenuMainActivity;
import com.pop.dgbaseanimation.ui.imitate.titanic.TitanicMainActivity;
import com.pop.dgbaseanimation.ui.imitate.viberation.ViberationMain;
import com.pop.dgbaseanimation.ui.imitate.waterfall.WaterfallMainActivity;
import com.pop.dgbaseanimation.ui.imitate.wave.WaveMainActivity;
import com.pop.dgbaseanimation.ui.imitate.weixin.WeixinChatDemoActivity;
import com.pop.dgbaseanimation.ui.imitate.wheel.WheelMainActivity;
import com.pop.dgbaseanimation.ui.imitate.widget.WidgetMainActivity;
import com.pop.dgbaseanimation.ui.splash.LensFocusActivity;
import com.pop.dgbaseanimation.ui.splash.Rotate3DActivity;
import com.pop.dgbaseanimation.ui.splash.RotateActivity;
import com.pop.dgbaseanimation.ui.splash.ViewPagerActivity;
import com.pop.dgbaseanimation.ui.splash.ZakerActivity;
import com.pop.dgbaseanimation.ui.splash.splitActivity.Activity1;

public class ImitateMainActivity extends BaseActivity implements OnItemClickListener {

	private AnimationAdapter adapter;
	private ListView listView_anim_complex;
	@Override
	public void setView() {
		setContentView(R.layout.activity_anim_complex);
		
	}

	@Override
	public void initView() {
		listView_anim_complex = (ListView) findViewById(R.id.listView_anim_complex);

		adapter = new AnimationAdapter(this, ContantValue.imitateName);
		
	}

	@Override
	public void setListener() {
		listView_anim_complex.setAdapter(adapter);
		listView_anim_complex.setOnItemClickListener(this);
		
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		switch (position) {
		case 0:
			startIntent(OutTicketActivity.class);
			break;
		case 1:
			startIntent(AddShopCartMainActivity.class);
			break;
		case 2:
			startIntent(YouKuActivity.class);
			break;
		case 3:
			startIntent(GalleryMainActivity.class);
			break;
		case 4:
			startIntent(SpinnerMainActivity.class);
			break;
		case 5:
			startIntent(RadarMainActivity.class);
			break;
		case 6:
			break;
		case 7:
			startIntent(BiaoPanMainActivity.class);
			break;
		case 8:
			startIntent(WaterfallMainActivity.class);
			break;
		case 9:
			startIntent(RootblockMainActivity.class);
			break;
		case 10:
			startIntent(WheelMainActivity.class);
			break;
		case 11:
			startIntent(WidgetMainActivity.class);
			break;
		case 12:
			startIntent(WeixinChatDemoActivity.class);
			break;
		case 13:
			startIntent(ViberationMain.class);
			break;
		case 14:
			startIntent(SlidingDrawerMainActivity.class);
			break;
		case 15:
			startIntent(PathMenuMainActivity.class);
			break;
		case 16:
			startIntent(TaobaoActivity.class);
			break;
		case 17:
			startIntent(WaveMainActivity.class);
			break;
		case 18:
			startIntent(TitanicMainActivity.class);
			break;

		default:
			break;
		}
		
	}
	
	/**
	 * 切换Activity
	 * @param class1
	 */
	public void startIntent(Class class1){
		Intent intent = new Intent(ImitateMainActivity.this,class1);
		startActivity(intent);
	}

}
