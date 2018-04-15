package com.pop.dgbaseanimation.ui.customview;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.pop.dgbaseanimation.ContantValue;
import com.pop.dgbaseanimation.R;
import com.pop.dgbaseanimation.adapter.AnimationAdapter;
import com.pop.dgbaseanimation.ui.base.BaseActivity;
import com.pop.dgbaseanimation.ui.customview.badger.BadgerMainActivity;
import com.pop.dgbaseanimation.ui.customview.circlemenu.CircleMenuMainActivity;
import com.pop.dgbaseanimation.ui.customview.clickdeflect.ClickDeflectActivity;
import com.pop.dgbaseanimation.ui.customview.foldablelayout.activity.FoldableListMainActivity;
import com.pop.dgbaseanimation.ui.customview.foldablelayout.activity.UnfoldableDetailsMainActivity;
import com.pop.dgbaseanimation.ui.customview.gallerylistview.GalleryListViewMain;
import com.pop.dgbaseanimation.ui.customview.hscrollview.ScrollviewMainActivity;
import com.pop.dgbaseanimation.ui.customview.lodingdialog.LoadingDialogMainActivity;
import com.pop.dgbaseanimation.ui.customview.milaucher.MiLaucherMainActivity;
import com.pop.dgbaseanimation.ui.customview.morecustom.MoreCustomMainActivity;
import com.pop.dgbaseanimation.ui.customview.popwindow.PoupWindowMainActivity;
import com.pop.dgbaseanimation.ui.customview.progressbar.ProgressBarMain;
import com.pop.dgbaseanimation.ui.customview.ribbomenu.RibbonMainActivity;
import com.pop.dgbaseanimation.ui.customview.secrettextview.SecretTextViewActivity;
import com.pop.dgbaseanimation.ui.customview.serchfly.SearchFlyActivity;
import com.pop.dgbaseanimation.ui.customview.switchs.SwitchMainActivity;
import com.pop.dgbaseanimation.ui.customview.titlelistview.TitleListViewMainActivity;
import com.pop.dgbaseanimation.ui.customview.yzhou.TwoSidedViewActivity;

/**
 * 自定义控件集合的主页面
 * @author duguang
 *
 */
public class CustomViewMainActivity extends BaseActivity implements OnItemClickListener{

	private AnimationAdapter adapter;
	private ListView listView_anim_complex;
	@Override
	public void setView() {
		setContentView(R.layout.activity_anim_complex);
		
	}

	@Override
	public void initView() {
		listView_anim_complex = (ListView) findViewById(R.id.listView_anim_complex);
		adapter = new AnimationAdapter(this, ContantValue.customName);
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
			startIntent(SearchFlyActivity.class);
			break;
		case 1:
			startIntent(BadgerMainActivity.class);
			break;
		case 2:
			startIntent(CircleMenuMainActivity.class);
			break;
		case 3:
			startIntent(TitleListViewMainActivity.class);
			break;
		case 4:
			startIntent(GalleryListViewMain.class);
			break;
		case 5:
			startIntent(RibbonMainActivity.class);
			break;
		case 6:
			startIntent(ScrollviewMainActivity.class);
			break;
		case 7:
			startIntent(ProgressBarMain.class);
			break;
		case 8:
			startIntent(LoadingDialogMainActivity.class);
			break;
		case 9:
			startIntent(PoupWindowMainActivity.class);
			break;
		case 10:
			startIntent(DialogsMainActivity.class);
			break;
		case 11:
			startIntent(TwoSidedViewActivity.class);
			break;
		case 12:
			startIntent(TransparentPopWindowMenu.class);
			break;
		case 13:
			startIntent(ClickDeflectActivity.class);
			break;
		case 14:
			startIntent(MoreCustomMainActivity.class);
			break;
		case 15:
			startIntent(SwitchMainActivity.class);
			break;
		case 16:
			startIntent(MiLaucherMainActivity.class);
			break;
		case 17:
			startIntent(SecretTextViewActivity.class);
			break;
		case 18:
			startIntent(UnfoldableDetailsMainActivity.class);
			break;
		case 19:
			startIntent(FoldableListMainActivity.class);
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
		Intent intent = new Intent(CustomViewMainActivity.this,class1);
		startActivity(intent);
	}

}
