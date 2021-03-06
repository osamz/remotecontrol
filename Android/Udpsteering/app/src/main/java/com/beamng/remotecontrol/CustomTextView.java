package com.beamng.remotecontrol;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import android.util.Log;

import com.beamng.remotecontrol.R;

public class CustomTextView extends TextView {

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public CustomTextView(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        try {
            if (attrs!=null) {
                TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomTextView);
                String fontName = a.getString(R.styleable.CustomTextView_fontName);
                if (fontName!=null) {
                        Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), fontName);
                        setTypeface(myTypeface);

                }
                a.recycle();
            }
        } catch(RuntimeException e) {
            Log.e( "CustomTextView", "Unable to create font", e );
        }
    }

}
