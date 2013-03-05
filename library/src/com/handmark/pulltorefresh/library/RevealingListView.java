package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.util.AttributeSet;

/**
 * ListView widget that expands to reveal a map beneath it.
 */
public class RevealingListView extends PullToRefreshListView {

   public RevealingListView(Context context) {
        super(context);
    }

    public RevealingListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RevealingListView(Context context, Mode mode) {
        super(context, mode);
    }

    public RevealingListView(Context context, Mode mode, AnimationStyle style) {
        super(context, mode, style);
    }
	    
    @Override
    public void onReset() {
    }
}
