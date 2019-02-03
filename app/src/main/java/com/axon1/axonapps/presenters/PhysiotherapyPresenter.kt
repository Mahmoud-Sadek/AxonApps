package com.axon1.axonproviderapp.listeners

import android.content.Context
import com.axon1.axonapps.Interfaces.PhysiotherapyInterface
import com.axon1.axonapps.models.Physiotherapy
import okhttp3.MultipartBody
import java.util.HashMap
import org.androidannotations.api.rest.MediaType
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PhysiotherapyPresenter {

    lateinit var sinterface: PhysiotherapyInterface
    lateinit var context: Context
    lateinit var physiotherapy: Physiotherapy
//    lateinit var appServices: AppServices

    constructor(_context: Context?, _sinterface: PhysiotherapyInterface?) {
        this.sinterface = _sinterface!!
        this.context = _context!!
//        this.appServices = AppServices()
    }

    fun getPhysiotherapyService(){
//        sinterface.onSuccess(physiotherapy)
    }
    fun getProfileGalleryService(jsonParams: HashMap<String, Any>) {


        /*appServices.getAPI().getProfileGallery(
            jsonParams,
            Localization.checkLocale(this.context),
            Global.getUserAccessToken(this.context),
            MediaType.APPLICATION_JSON
        ).enqueue(object : Callback<GalleryOutput> {
            override fun onResponse(
                call: Call<GalleryOutput>?,
                response: Response<GalleryOutput>?
            ) {
                if (response!!.isSuccessful) {
                    var result = response.body() as GalleryOutput
                    if (result.Error == null || result.Error == "" || result.Error == "success")
                        sinterface.onSuccess(result)
                    else
                        sinterface.onError(result.Error)
                } else {
                    sinterface.onError(context.resources.getString(R.string.common_Error));
                }
            }

            override fun onFailure(call: Call<GalleryOutput>?, t: Throwable?) {
                sinterface.onError(context.resources.getString(R.string.common_Error));
            }
        })*/
    }

}
