package com.axon1.axonapps.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import org.jetbrains.annotations.Nullable;

public final class Arabic_Button extends Button {

    public Arabic_Button(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/arabic/hacen_saudi.ttf"));
    }
}
