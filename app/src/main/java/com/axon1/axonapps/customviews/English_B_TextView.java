package com.axon1.axonapps.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import org.jetbrains.annotations.Nullable;

public final class English_B_TextView extends AppCompatTextView {

    public English_B_TextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/english/BCN_Bold.otf"));
    }
}