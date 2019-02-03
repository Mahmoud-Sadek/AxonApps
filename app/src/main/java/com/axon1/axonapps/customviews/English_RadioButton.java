package com.axon1.axonapps.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;

import org.jetbrains.annotations.Nullable;

public final class English_RadioButton extends AppCompatRadioButton {

    public English_RadioButton(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/english/BCN_Light.otf"));
    }
}