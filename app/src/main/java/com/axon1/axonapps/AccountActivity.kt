package com.axon1.axonapps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v4.view.ViewCompat
import android.view.View
import com.axon1.axonapps.fragments.AccountFragment
import com.axon1.axonapps.fragments.ForgetPasswordFragment
import com.axon1.axonapps.fragments.JoinUsFragment
import com.axon1.axonapps.fragments.LoginFragment
import com.axon1.axonapps.helpers.Constants
import com.axon1.axonapps.helpers.Global
import com.axon1.axonapps.helpers.Localization
import kotlinx.android.synthetic.main.activity_account.*
import java.lang.Exception

class AccountActivity : AppCompatActivity() {
    var doubleBackToExitPressedOnce: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        getLanguage()
//        getRegistrationDevice()
        imgAccountBack.setOnClickListener(View.OnClickListener {
            onBackPressed()
        })
        replaceFragment(AccountFragment(), "Account")
    }

    fun replaceFragment(fragment: Fragment?, str: String) {
        try {
            var bundle = Bundle()
            bundle.putString("CurrentFragment", str);
            intent.putExtras(bundle);
            var beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.replace(R.id.layoutAccountContent, fragment!!, str);
            beginTransaction.addToBackStack(str);
            beginTransaction.commitAllowingStateLoss();
        } catch (ex: Exception) {

        }
    }

    override fun onBackPressed() {
        var obj = intent.extras.get("CurrentFragment")
        if (obj != null && obj != "") {
            if (obj == "Roles") {
                replaceFragment(JoinUsFragment(), "JoinUs")
            } else if (obj == "ForgetPassword") {
                replaceFragment(LoginFragment(), "Login");
            } else if (obj == "ForgetPasswordDone") {
                replaceFragment(ForgetPasswordFragment(), "ForgetPassword");
            } else if (obj == "Account") {
                if (this.doubleBackToExitPressedOnce) {
                    finish()
                    finishAffinity()
                    System.exit(0)
                }
                this.doubleBackToExitPressedOnce = true
                Global.makeLongToast(
                        this@AccountActivity,
                        this.resources.getString(R.string.common_Exit_Message),
                        5000
                );
                Handler().postDelayed(Runnable { onBackPressed() }, 5000)
            } else {
                replaceFragment(AccountFragment(), "Account")
            }
        }
    }

    fun showLoadingBar() {
        loadingPanelAccount.visibility = View.VISIBLE
        loadingPanelAccount.setBackgroundColor(Global.getColorWithAlpha(ViewCompat.MEASURED_STATE_MASK, 0.5f))
        window.setFlags(16, 16);
    }

    fun hideLoadingBar() {
        loadingPanelAccount.visibility = View.GONE
        window.clearFlags(16);
    }

    private fun getLanguage(): String {
        return Localization.checkLocale(this@AccountActivity)
    }

    /*private fun getRegistrationDevice(): String {
        var defaults = Global.getDefaults(Constants.Registration_Device, this@AccountActivity)
        if (defaults == null || defaults == "") {
            try {
                var instance = FirebaseInstanceId.getInstance()
                defaults = instance.token
                if (defaults != null) {
                    Global.setDefaults(Constants.Registration_Device, defaults, this@AccountActivity)
                }
            }
            catch (ex: Exception){
                Global.setDefaults(Constants.Registration_Device, "test", this@AccountActivity)
            }
        }
        return defaults;
    }*/

    fun startMain() {
//        startActivity(Intent(this@AccountActivity, MainActivity::class.java))
//        finish();
    }

}
