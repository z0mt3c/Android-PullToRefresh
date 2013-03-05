package com.handmark.pulltorefresh.library.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Orientation;

/**
 * @date   Mar 1, 2013
 * @author Nick Burton (thatsburto.com)
 */
public class RevealingLayout extends LoadingLayout {
    
    public RevealingLayout(Context context, final Mode mode, final Orientation scrollDirection, TypedArray attrs) {
        super(context, mode, scrollDirection, attrs);        
    }

    @Override
    protected void refreshingImpl() {
    }
    
    @Override
    protected void resetImpl() {
    }

    @Override
    protected int getDefaultDrawableResId() {
        return 0;
    }

    @Override
    protected void onLoadingDrawableSet(Drawable imageDrawable) {
    }

    @Override
    protected void onPullImpl(float scaleOfLayout) {
    }

    @Override
    protected void pullToRefreshImpl() {
    }

    @Override
    protected void releaseToRefreshImpl() {
    }
}