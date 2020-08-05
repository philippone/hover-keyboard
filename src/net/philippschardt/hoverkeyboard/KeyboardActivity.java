package net.philippschardt.hoverkeyboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class KeyboardActivity extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = new Intent();
        Button r = (Button) findViewById(R.id.button_r);
        Button s = (Button) findViewById(R.id.button_s);
        s.setOnClickListener(this);
        r.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_keyboard, menu);
        return true;
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    
    /*besser mit Handler*/
	public void onClick(View v) {
		// TODO Auto-generated method stub
		((Button) v).setWidth(90);
		
	}

}
