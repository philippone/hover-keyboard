package net.philippschardt.hoverkeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HoverView extends LinearLayout {

	private boolean mInterceptHover = false;
	
	public HoverView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public HoverView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	public boolean onInterceptHoverEvent(MotionEvent event) {
        if (mInterceptHover) {
            return true;
        }
        return super.onInterceptHoverEvent(event);
    }
	
	@Override
    public boolean onHoverEvent(MotionEvent event) {
		System.out.println("onHoverEvent");
        TextView textView = (TextView) findViewById(R.id.TextView1);
        if (mInterceptHover && event.getAction() != MotionEvent.ACTION_HOVER_EXIT) {
            textView.setText("hover-enter/motion");
            return true;
        }
        textView.setText("hover-time");
        return super.onHoverEvent(event);
    }
	
	public void setInterceptHover(boolean intercept) {
        mInterceptHover = intercept;
    }

}
