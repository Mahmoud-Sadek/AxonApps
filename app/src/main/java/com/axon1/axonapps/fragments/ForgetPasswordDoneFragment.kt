package com.axon1.axonapps.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.axon1.axonapps.AccountActivity
import com.axon1.axonapps.R

class ForgetPasswordDoneFragment : Fragment() {

    lateinit var accountActivity: AccountActivity
    lateinit var btnForgetDone: Button
    lateinit var lblForgetDoneEmail: TextView
    lateinit var lblWrongEmail: TextView

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            this.accountActivity = context as AccountActivity
        }
    }

    override fun onCreateView(layoutInflater: LayoutInflater, viewGroup: ViewGroup?, bundle: Bundle?): View {
        var view = layoutInflater.inflate(R.layout.fragment_forget_password_done, viewGroup, false)
        declareControls(view)
        lblForgetDoneEmail.text = accountActivity.intent.getStringExtra("ForgetPasswordEmail")
        btnForgetDone.setOnClickListener(View.OnClickListener {
            accountActivity.replaceFragment(LoginFragment(), "Login")
        })
        lblWrongEmail.setOnClickListener(View.OnClickListener {
            accountActivity.replaceFragment(ForgetPasswordFragment(), "ForgetPassword")
        })
        return view;
    }

    private fun declareControls(view: View) {
        lblForgetDoneEmail = view.findViewById(R.id.lblForgetDoneEmail)
        lblWrongEmail = view.findViewById(R.id.lblWrongEmail)
        btnForgetDone = view.findViewById(R.id.btnForgetDone)
    }
}
