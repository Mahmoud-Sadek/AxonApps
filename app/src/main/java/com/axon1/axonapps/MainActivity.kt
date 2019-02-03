package com.axon1.axonapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.axon1.axonapps.fragments.PhysiotherapyFragment
import android.annotation.SuppressLint
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AlertDialog
import android.view.MenuItem
import android.view.View
import com.axon1.axonapps.fragments.MainFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction = getTransaction()
        transaction.replace(R.id.head_container, MainFragment())
        transaction.commit()
    }

    @SuppressLint("ResourceType")
    fun getTransaction(): FragmentTransaction {
        val transaction = supportFragmentManager.beginTransaction()
//        transaction.setCustomAnimations(R.anim.abc_fade_in,
//                R.anim.abc_fade_out)
        return transaction
    }

    private lateinit var alertDialog: AlertDialog.Builder
    private lateinit var show: AlertDialog
    fun filterClick() {
        // Do something in response to button
        alertDialog = AlertDialog.Builder(this);
//        alertDialog.setTitle("New Order !");
//        alertDialog.setMessage("Check this order :");

        var inflater = this.getLayoutInflater()
        var order_address_comment = inflater.inflate(R.layout.dialog_filter, null)

        alertDialog.setView(order_address_comment);
        show = alertDialog.show();
        show.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.action_filter){
            filterClick()
        }
        return super.onOptionsItemSelected(item)
    }
}
