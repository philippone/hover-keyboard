package net.philippschardt.hoverkeyboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnHoverListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HoverActivity extends Activity implements OnHoverListener, OnTouchListener, OnClickListener  {

	private Button button;
	private TextView tview;
	private EditText etext;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hover);
        button = (Button) findViewById(R.id.button1);
        tview = (TextView) findViewById(R.id.TextView1);
        etext = (EditText) findViewById(R.id.editText1);
        button.setOnHoverListener(this);
        tview.setOnHoverListener(this);
        etext.setOnHoverListener(this);
        tview.setOnTouchListener(this);
        etext.setOnTouchListener(this);
        button.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_hover, menu);
        return true;
    }

	public boolean onHover(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("onHover");
		switch (event.getAction()) {
        case MotionEvent.ACTION_HOVER_ENTER:
        	if (v instanceof Button) {
				button.setText("Test");
			}
			if (v instanceof TextView) {
				((TextView) v).setText("test");
			} else if (v instanceof EditText) {
				((EditText) v).setText("test-edittext");
			}
            break;
        case MotionEvent.ACTION_HOVER_MOVE:
            break;
        case MotionEvent.ACTION_HOVER_EXIT:
            break;
		}
    return false;
	}

	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("onTouch");
		return false;
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, net.philippschardt.hoverkeyboard.KeyboardActivity.class); 
		startActivity(intent);
		
	}
}
