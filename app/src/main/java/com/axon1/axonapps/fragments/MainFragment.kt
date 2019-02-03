package com.axon1.axonapps.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.axon1.axonapps.AccountActivity
import com.axon1.axonapps.MainActivity
import com.axon1.axonapps.R

class MainFragment : Fragment() {

    lateinit var mainActivity: MainActivity
    lateinit var btnAccountJoinUs: Button
    lateinit var btnAccountLogin: Button

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            this.mainActivity = context as MainActivity
        }
    }

    override fun onCreateView(layoutInflater: LayoutInflater, viewGroup: ViewGroup?, bundle: Bundle?): View {
        var view = layoutInflater.inflate(R.layout.fragment_main, viewGroup, false)
        declareControls(view)
//        btnAccountLogin.setOnClickListener(OnClickListener {
//            accountActivity.replaceFragment(LoginFragment(), "Login")
//        })
//        btnAccountJoinUs.setOnClickListener(OnClickListener {
//            accountActivity.replaceFragment(JoinUsFragment(), "JoinUs")
//        })
        val transaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.layoutAccountContent, PhysiotherapyFragment())
        transaction.commit()
        return view
    }

    private fun declareControls(view: View) {
//        btnAccountLogin = view.findViewById(R.id.btnAccountLogin)
//        btnAccountJoinUs = view.findViewById(R.id.btnAccountJoinUs)
    }
}