package com.axon1.axonapps.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.design.widget.TextInputEditText;
import android.util.AttributeSet;

import org.jetbrains.annotations.Nullable;

public final class Arabic_EditText extends TextInputEditText {

    public Arabic_EditText(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/arabic/hacen_saudi.ttf"));
    }
}