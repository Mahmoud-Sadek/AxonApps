package com.axon1.axonapps.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.widget.Button;

import org.jetbrains.annotations.Nullable;

public final class English_Button extends AppCompatButton {

    public English_Button(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/english/BCN_Medium.otf"));
    }
}