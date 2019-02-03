package com.axon1.axonapps.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import com.axon1.axonapps.AccountActivity
import com.axon1.axonapps.R

class AccountFragment : Fragment() {

    lateinit var accountActivity: AccountActivity
    lateinit var btnAccountJoinUs: Button
    lateinit var btnAccountLogin: Button

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            this.accountActivity = context as AccountActivity
        }
    }

    override fun onCreateView(layoutInflater: LayoutInflater, viewGroup: ViewGroup?, bundle: Bundle?): View {
        var view = layoutInflater.inflate(R.layout.fragment_account, viewGroup, false)
        declareControls(view)
        btnAccountLogin.setOnClickListener(OnClickListener {
            accountActivity.replaceFragment(LoginFragment(), "Login")
        })
        btnAccountJoinUs.setOnClickListener(OnClickListener {
            accountActivity.replaceFragment(JoinUsFragment(), "JoinUs")
        })
        return view
    }

    private fun declareControls(view: View) {
        btnAccountLogin = view.findViewById(R.id.btnAccountLogin)
        btnAccountJoinUs = view.findViewById(R.id.btnAccountJoinUs)
    }
}
