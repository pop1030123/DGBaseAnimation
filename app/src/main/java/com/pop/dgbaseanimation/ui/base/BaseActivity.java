package com.pop.dgbaseanimation.ui.base;

import com.pop.dgbaseanimation.R;
import com.pop.dgbaseanimation.ui.AboutActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * 所有的Activity继承的基类Activity,包含了ActionBar菜单
 * @author duguang
 * 博客地址:http://blog.csdn.net/duguang77
 */
public abstract class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setView();
		initView();
		setListener();
		initData();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
//		MobclickAgent.onResume(this);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
//		MobclickAgent.onPause(this);
	}

	/**
	 * 设置布局文件
	 */
	public abstract void setView();

	/**
	 * 初始化布局文件中的控件
	 */
	public abstract void initView();

	/**
	 * 设置控件的监听
	 */
	public abstract void setListener();
	
	private void initData() {
//		SocializeConstants.APPKEY = "52c4c16956240bce2e08eeb0";
//		// 首先在您的Activity中添加如下成员变量
//		final UMSocialService mController = UMServiceFactory.getUMSocialService("com.umeng.share",RequestType.SOCIAL);
//
//		// 设置分享内容
//		mController.setShareContent("Android开发者必备BaseAnimation应用,一些想要的效果能过快速找到,并添加到自己的应用中,作者博客地址:http://blog.csdn.net/duguang77");
//
//
//		// wx967daebe835fbeac是你在微信开发平台注册应用的AppID, 这里需要替换成你注册的AppID
//		String appID = "wx88818f8c48a95eb4";
//		// 微信图文分享必须设置一个url
//		String contentUrl = "http://www.umeng.com/social";
//		// 添加微信平台，参数1为当前Activity, 参数2为用户申请的AppID, 参数3为点击分享内容跳转到的目标url
//		UMWXHandler wxHandler = mController.getConfig().supportWXPlatform(this,appID, contentUrl);
//		//设置分享标题
//		wxHandler.setWXTitle("Android开发者必备BaseAnimation");
//		// 支持微信朋友圈
//		UMWXHandler circleHandler = mController.getConfig().supportWXCirclePlatform(this,appID, contentUrl) ;
//		circleHandler.setCircleTitle("一些想要的效果能过快速找到,并添加到自己的应用中,BaseAnimation还不错哦...");
//
//	//  参数1为当前Activity， 参数2为用户点击分享内容时跳转到的目标地址
//		mController.getConfig().supportQQPlatform(this, "http://www.umeng.com/social");
//
//		mController.getConfig().setSsoHandler(new QZoneSsoHandler(this));
//
//		//设置腾讯微博SSO handler
//		mController.getConfig().setSsoHandler(new TencentWBSsoHandler());
		
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.optionsmenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.menu_about:
			Intent intent = new Intent(BaseActivity.this,AboutActivity.class);
			startActivity(intent);
			overridePendingTransition(R.anim.small_2_big, R.anim.fade_out);
			return true;
		case R.id.menu_feedback:
//			FeedbackAgent agent = new FeedbackAgent(this);
//		    agent.startFeedbackActivity();
//		    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
		    return true;
		case R.id.menu_share:
//			final UMSocialService mController = UMServiceFactory.getUMSocialService("com.umeng.share",RequestType.SOCIAL);
//			mController.openShare(BaseActivity.this, false);
//			 overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	@Override 
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);
//	    final UMSocialService mController = UMServiceFactory.getUMSocialService("com.umeng.share",RequestType.SOCIAL);
//
//	    /**使用SSO授权必须添加如下代码 */
//	    UMSsoHandler ssoHandler = mController.getConfig().getSsoHandler(requestCode) ;
//	    if(ssoHandler != null){
//	       ssoHandler.authorizeCallBack(requestCode, resultCode, data);
//	    }
	}
	
	
	
	
	
}
