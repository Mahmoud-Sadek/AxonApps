package com.axon1.axonapps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.axon1.axonapps.IntroActivity
import com.axon1.axonapps.helpers.Constants
import com.axon1.axonapps.helpers.Global
import com.axon1.axonapps.helpers.Localization

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//        Fabric.with(this, Crashlytics())
        getLanguage();
        //refresh_access_token();
        var registrationDevice = Global.getDefaults(Constants.Registration_Device, this@SplashActivity);
        var accessToken = Global.getDefaults(Constants.User_AccessToken, this@SplashActivity)
        Handler().postDelayed(Runnable() {
            if (registrationDevice == null || registrationDevice == "")
                startInto();
            else if (accessToken == null || accessToken == "")
                startLogin();
            else
                startMain();
        }, Constants.SPLASH_TIME_OUT);
    }

    private fun startLogin() {
        startActivity(Intent(this, AccountActivity::class.java))
        finish()
    }

    private fun startMain() {
//        startActivity(Intent(this, MainActivity::class.java))
//        finish()
    }

    private fun startInto() {
        startActivity(Intent(this, IntroActivity::class.java))
        finish()
    }

    fun getLanguage(): String {
        var checkLocale = Localization.checkLocale(this@SplashActivity);
        if (checkLocale == null || checkLocale == "") {
            checkLocale = "en";
        }
        Localization.setLocale(this@SplashActivity, checkLocale);
        return checkLocale;

    }
}
