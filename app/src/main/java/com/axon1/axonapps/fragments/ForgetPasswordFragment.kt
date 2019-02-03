package com.axon1.axonapps.fragments

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.axon1.axonapps.AccountActivity
import com.axon1.axonapps.R
//import com.axon1.axonapp.interfaces.ForgetPassword_Interface
//import com.axon1.axonapp.listeners.ForgetPassword_Listener
//import com.axon1.axonapp.models.StringOutput
import java.util.HashMap

class ForgetPasswordFragment : Fragment() {

    lateinit var accountActivity: AccountActivity
    lateinit var btnRestPassword: Button
    lateinit var txtLoginUsername: EditText

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            this.accountActivity = context as AccountActivity
        }
    }

    override fun onCreateView(layoutInflater: LayoutInflater, viewGroup: ViewGroup?, bundle: Bundle?): View {
        var view = layoutInflater.inflate(R.layout.fragment_forget_password, viewGroup, false)
        declareControls(view)
        btnRestPassword.setOnClickListener(OnClickListener {
            restPassword()
        })
        return view
    }

    private fun declareControls(view: View) {
        txtLoginUsername = view.findViewById(R.id.txtLoginUsername)
        btnRestPassword = view.findViewById(R.id.btnRestPassword)
    }

    private fun restPassword() {
        txtLoginUsername.error = null
        if (txtLoginUsername.text.isEmpty()) {
            txtLoginUsername.error = accountActivity.resources.getString(R.string.Pages_ForgetPassword_RequiredUsername)
            txtLoginUsername.requestFocus()
            return
        } else {
            forgetPasswordService()
        }
    }

    private fun forgetPasswordService() {
//        accountActivity.showLoadingBar()
//        var listener = ForgetPassword_Listener(accountActivity, this)
//        var jsonParams = HashMap<String, Any>()
//        jsonParams.put("EmailAddress", txtLoginUsername.text.toString())
//        listener.forgetPasswordService(jsonParams)
    }

//    override fun onError(str: String) {
//        accountActivity.hideLoadingBar()
//        if (str != "")
//            Global.makeLongToast(accountActivity, str, 5000);
//    }
//
//    override fun onSuccess(result: StringOutput) {
//        accountActivity.hideLoadingBar()
//        accountActivity.intent.putExtra("ForgetPasswordEmail", txtLoginUsername.text)
//        accountActivity.replaceFragment(ForgetPasswordDoneFragment(), "ForgetPasswordDone")
//    }

}
