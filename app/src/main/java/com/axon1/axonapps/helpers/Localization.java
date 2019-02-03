package com.axon1.axonapps.helpers;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;

import java.util.Locale;

public final class Localization {
    Locale myLocale;

    public static void setLocale(Context context, String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = context.getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, context.getResources().getDisplayMetrics());
        saveLocale(context, lang);
    }

    public static void saveLocale(Context context, String lang) {
        Global.setDefaults(Constants.app_lang, lang, context);
    }

    public static String checkLocale(Context context) {
        String Locale_str = Global.getDefaults(Constants.app_lang, context);
        return Locale_str;
    }


    @SuppressWarnings("deprecation")
    public void setSystemLocaleLegacy(Configuration config, Locale locale) {
        config.locale = locale;
    }

    @TargetApi(Build.VERSION_CODES.N)
    public Locale getSystemLocale(Configuration config) {
        return config.getLocales().get(0);
    }

    @TargetApi(Build.VERSION_CODES.N)
    public void setSystemLocale(Configuration config, Locale locale) {
        config.setLocale(locale);
    }

}
