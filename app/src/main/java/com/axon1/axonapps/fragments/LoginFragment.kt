package com.axon1.axonapps.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.axon1.axonapps.AccountActivity
import com.axon1.axonapps.R
//import com.axon1.axonapp.interfaces.Login_Interface;
//import com.axon1.axonapp.listeners.Login_Listener;
//import com.axon1.axonapp.models.LoginOutput
import java.util.HashMap

class LoginFragment : Fragment() {

    lateinit var accountActivity: AccountActivity
    lateinit var btnForgetPassword: TextView
    lateinit var btnLogin: Button
    lateinit var txtLoginPassword: EditText
    lateinit var txtLoginUsername: EditText

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            this.accountActivity = context as AccountActivity
        }
    }

    override fun onCreateView(layoutInflater: LayoutInflater, viewGroup: ViewGroup?, bundle: Bundle?): View {
        var view = layoutInflater.inflate(R.layout.fragment_login, viewGroup, false)
        declareControls(view)
        btnForgetPassword.setOnClickListener(OnClickListener {
            accountActivity.replaceFragment(ForgetPasswordFragment(), "ForgetPassword")
        })
        btnLogin.setOnClickListener(OnClickListener {
            if (validate()) {
                loginService()
            }
        })
        return view;
    }

    private fun declareControls(view: View) {
        btnLogin = view.findViewById(R.id.btnLogin)
        btnForgetPassword = view.findViewById(R.id.btnForgetPassword)
        txtLoginUsername = view.findViewById(R.id.txtLoginUsername)
        txtLoginPassword = view.findViewById(R.id.txtLoginPassword)
    }

    private fun validate(): Boolean {
        txtLoginUsername.error = null
        txtLoginPassword.error = null
        if (txtLoginUsername.text.isEmpty()) {
            txtLoginUsername.error = (getString(R.string.Pages_Login_RequiredUsername))
            txtLoginUsername.requestFocus()
            return false
        } else if (txtLoginPassword.text.isEmpty()) {
            txtLoginPassword.error = (getString(R.string.Pages_Login_RequiredPassword))
            txtLoginPassword.requestFocus()
            return false
        }
        return true
    }

    private fun loginService() {
        /*accountActivity.showLoadingBar()
        var login_Listener = Login_Listener(accountActivity, this)
        var jsonParams = HashMap<String, Any>()
        jsonParams.put("userNameOrEmailAddress", txtLoginUsername.text.toString());
        jsonParams.put("password", txtLoginPassword.text.toString())
        login_Listener.loginService(jsonParams);*/
    }

   /* override fun onError(str: String) {
        accountActivity.hideLoadingBar()
        if (str != "")
            Global.makeLongToast(accountActivity, str, 5000);
    }

    override fun onSuccess(result: LoginOutput) {
        accountActivity.hideLoadingBar()
        Global.makeLongToast(accountActivity, accountActivity.resources.getString (R.string.Pages_login_loginSuccessfully), 5000)
        Global.setDefaults(Constants.User_AccessToken, result.AccessToken, accountActivity)
        Global.setDefaults(Constants.User_RoleName, result.RoleName, accountActivity)
        accountActivity.startMain()
    }*/

}