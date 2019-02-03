package com.axon1.axonapps.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.design.widget.TextInputEditText;
import android.util.AttributeSet;

import org.jetbrains.annotations.Nullable;

public final class English_EditText extends TextInputEditText {

    public English_EditText(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/english/BCN_Medium.otf"));
    }
}