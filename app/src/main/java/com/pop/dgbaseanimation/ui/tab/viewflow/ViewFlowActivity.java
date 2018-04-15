/*
 * Copyright (C) 2011 Patrik �kerfeldt
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pop.dgbaseanimation.ui.tab.viewflow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pop.dgbaseanimation.R;

public class ViewFlowActivity extends Activity {

	ListView listView;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_viewflow_main);
		listView = (ListView) findViewById(R.id.menu);
		String[] listeStrings = { "Circle indicator...", "Title indicator...", "Different Views...", "Async Data Loading..." };
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listeStrings));
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long arg3) {
				switch (position) {
				case 0:
					startActivity(new Intent(ViewFlowActivity.this, CircleViewFlowActivity.class));
					break;
				case 1:
					startActivity(new Intent(ViewFlowActivity.this, TitleViewFlowActivity.class));
					break;
				case 2:
					startActivity(new Intent(ViewFlowActivity.this, DiffViewFlowActivity.class));
					break;
				case 3:
					startActivity(new Intent(ViewFlowActivity.this, AsyncDataFlowActivity.class));
					break;
				}
			}
		});
	}

}
