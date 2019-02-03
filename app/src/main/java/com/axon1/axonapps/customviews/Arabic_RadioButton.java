package com.axon1.axonapps.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;

import org.jetbrains.annotations.Nullable;

public final class Arabic_RadioButton extends AppCompatRadioButton {

    public Arabic_RadioButton(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/arabic/hacen_saudi.ttf"));
    }
}