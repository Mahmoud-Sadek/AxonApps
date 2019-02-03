package com.axon1.axonapps.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.util.AttributeSet;

import org.jetbrains.annotations.Nullable;

public final class English_TextInputLayout extends TextInputLayout {

    public English_TextInputLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/english/PoppinsRegular.ttf"));
    }
}