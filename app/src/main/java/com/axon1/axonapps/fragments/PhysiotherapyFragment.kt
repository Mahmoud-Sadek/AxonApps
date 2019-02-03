package com.axon1.axonapps.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.axon1.axonapps.Interfaces.PhysiotherapyInterface
import com.axon1.axonapps.MainActivity
import com.axon1.axonapps.R
import com.axon1.axonapps.adapters.PhysiotherapyAdapter
import com.axon1.axonapps.models.Physiotherapy
import com.axon1.axonproviderapp.listeners.PhysiotherapyPresenter
import com.arlib.floatingsearchview.FloatingSearchView


class PhysiotherapyFragment : Fragment(), PhysiotherapyInterface {


    private lateinit var mainActivity: MainActivity
    private lateinit var adapter: PhysiotherapyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var physiotherapyPresenter: PhysiotherapyPresenter
    private lateinit var mSearchView: FloatingSearchView

    private lateinit var alertDialog: AlertDialog.Builder
    private lateinit var show: AlertDialog

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            this.mainActivity = context as MainActivity
        }
    }

    override fun onCreateView(layoutInflater: LayoutInflater, viewGroup: ViewGroup?, bundle: Bundle?): View {
        var view = layoutInflater.inflate(R.layout.fragment_physiotherapy, viewGroup, false)
//        mainActivity.setTitleBar("Gallery")
//        mainActivity.setDrawerLocked(true)
//        declareControls(view)
//        checkPermission()
//        loadDataService()
        initView(view)
        physiotherapyPresenter = PhysiotherapyPresenter(mainActivity, this)
        physiotherapyPresenter.getPhysiotherapyService()
        search()
        return view
    }

    private fun initView(view: View) {
        mSearchView = view.findViewById(R.id.floating_search_view)
        recyclerView = view.findViewById(R.id.recyclerAppointments)
        recyclerView.layoutManager = GridLayoutManager(mainActivity, 1)
//        val controller = AnimationUtils.loadLayoutAnimation(recyclerView.context,
//                R.anim.layout_fall_down)
//        recyclerView.layoutAnimation = controller

        adapter = PhysiotherapyAdapter(mainActivity)
        var adapter = PhysiotherapyAdapter(mainActivity)
        recyclerView.adapter = (adapter)
    }

    fun filterClick(view: View) {
        // Do something in response to button
        alertDialog = AlertDialog.Builder(mainActivity);
//        alertDialog.setTitle("New Order !");
//        alertDialog.setMessage("Check this order :");

        var inflater = mainActivity.getLayoutInflater()
        var order_address_comment = inflater.inflate(R.layout.dialog_filter, null)

        alertDialog.setView(order_address_comment);
        show = alertDialog.show();
        show.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }
    private fun search() {
//        mSearchView.setOnMenuItemClickListener( FloatingSearchView.OnMenuItemClickListener() {
//
//            override fun onActionMenuItemSelected(item: MenuItem) {
//
//            }
//        });
        /*mSearchView.setOnMenuItemClickListener(FloatingSearchView.OnMenuItemClickListener {
            fun onActionMenuItemSelected(item: MenuItem) {
                alertDialog = AlertDialog.Builder(mainActivity);
//        alertDialog.setTitle("New Order !");
//        alertDialog.setMessage("Check this order :");

                var inflater = mainActivity.getLayoutInflater()
                var order_address_comment = inflater.inflate(R.layout.dialog_filter, null)

                alertDialog.setView(order_address_comment);
                show = alertDialog.show();
                show.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            }

        })*/
    }

    override fun onError(str: String) {
        adapter.notifyDataSetChanged()
    }

    override fun onSuccess(result: Physiotherapy) {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}