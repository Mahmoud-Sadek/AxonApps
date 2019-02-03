package com.axon1.axonapps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import com.axon1.axonapps.AccountActivity
import com.axon1.axonapps.R
import com.axon1.axonapps.helpers.Constants
import com.axon1.axonapps.helpers.Global
import com.cuneytayyildiz.onboarder.OnboarderActivity;
import com.cuneytayyildiz.onboarder.OnboarderPage;
import com.cuneytayyildiz.onboarder.OnboarderPage.Builder;

class IntroActivity : OnboarderActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        onLoadSuccess()
    }

    override fun onSkipButtonPressed() {
        StartMain()
    }

    override fun onFinishButtonPressed() {
        StartMain()
    }

    fun StartMain() {
        startActivity(Intent(this@IntroActivity, AccountActivity::class.java))
        finish()
    }

    /*fun getRegistrationDevice(): String {
        var defaults = Global.getDefaults(Constants.Registration_Device, this@IntroActivity);
        if (defaults == null || defaults == "") {
            var token = FirebaseInstanceId.getInstance().token
            if (token != null) {
                Global.setDefaults(Constants.Registration_Device, token, this@IntroActivity);
            }
        }
        return defaults;
    }*/

    fun onLoadSuccess() {
        var arrayList = ArrayList<OnboarderPage>()
        var build = Builder()
                .title("Book any appointment with ease...")
                .description("")
                .imageResourceId(R.drawable.intro)
                .backgroundColor(R.color.color_gray)
                .titleColor(R.color.color_blue)
                .descriptionColor(R.color.color_black)
                .multilineDescriptionCentered(true)
                .titleTextSize(24.0f)
                .descriptionTextSize(15.0f).build()

        var build2 = Builder()
                .title("Book any appointment with ease...")
                .description("")
                .imageResourceId(R.drawable.intro)
                .backgroundColor(R.color.color_gray)
                .titleColor(R.color.color_blue)
                .descriptionColor(R.color.color_black)
                .multilineDescriptionCentered(true)
                .titleTextSize(24.0f)
                .descriptionTextSize(15.0f).build()

        var build3 = Builder()
                .title("Book any appointment with ease...")
                .description("")
                .imageResourceId(R.drawable.intro)
                .backgroundColor(R.color.color_gray)
                .titleColor(R.color.color_blue)
                .descriptionColor(R.color.color_black)
                .multilineDescriptionCentered(true)
                .titleTextSize(24.0f)
                .descriptionTextSize(15.0f).build()

        arrayList.add(build)
        arrayList.add(build2)
        arrayList.add(build3)
        initOnboardingPages(arrayList)
        setActiveIndicatorColor(R.color.color_blue)
        setInactiveIndicatorColor(R.color.color_dark_gray)
        setSkipButtonTitle(this.resources.getString(R.string.Common_Skip))
        setFinishButtonTitle(this.resources.getString(R.string.Common_Finish))
    }
}
