package com.pop.dgbaseanimation.ui.tab.viewflow;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pop.dgbaseanimation.R;
import com.pop.dgbaseanimation.ui.tab.viewflow.library.TitleFlowIndicator;
import com.pop.dgbaseanimation.ui.tab.viewflow.library.ViewFlow;

public class DiffViewFlowActivity extends Activity {

	private ViewFlow viewFlow;
	private ListView listView;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.diff_title);
        setContentView(R.layout.activity_tab_viewflow_title_layout);
        
		viewFlow = (ViewFlow) findViewById(R.id.viewflow);
        DiffAdapter adapter = new DiffAdapter(this);
        viewFlow.setAdapter(adapter);
		TitleFlowIndicator indicator = (TitleFlowIndicator) findViewById(R.id.viewflowindic);
		indicator.setTitleProvider(adapter);
		viewFlow.setFlowIndicator(indicator);
		
		/** To populate ListView in diff_view1.xml */
		listView = (ListView) findViewById(R.id.listView1);
		String[] names = new String[] { "Cupcake", "Donut", "Eclair", "Froyo",
				"Gingerbread", "Honeycomb", "IceCream Sandwich"};
		// Create an ArrayAdapter, that will actually make the Strings above
		// appear in the ListView
		listView.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, names));
		
    }
}
