package com.axon1.axonapps.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup;
import android.widget.ImageView
import android.widget.Toast
import com.axon1.axonapps.R

class PhysiotherapyAdapter(var context: Context) :
        RecyclerView.Adapter<PhysiotherapyAdapter.ViewHolder>() {

    lateinit var inflater: LayoutInflater

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //        var imgProfileGallery: ImageView
        var imgProfileGalleryDelete: ImageView

        init {
//            imgProfileGallery = view.findViewById(R.id.ro)
            imgProfileGalleryDelete = view.findViewById(R.id.imgAppointmentMemberAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row = inflater.inflate(R.layout.row_physiotherapy, parent, false)
        return ViewHolder(row)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        Toast.makeText(context, position, Toast.LENGTH_LONG).show()
//        if (arrayList[position].Name == "add") {
//            holder.imgProfileGalleryDelete.visibility = View.GONE
//            holder.imgProfileGallery.setImageDrawable(this.context.resources.getDrawable(R.drawable.icon_plus))
//            holder.imgProfileGallery.setOnClickListener(View.OnClickListener {
//                sinterface.onItemClicked(arrayList[position].Name)
//            })
//            return;
//        } else {
        /*var link = Constants.Domain_Url + arrayList[position]
        //DownloadImageTask(holder.imgProfileGallery).execute(link)
        DownloadImageTask(this.context, holder.imgProfileGallery, link, 120, 120).execute(link)
        holder.imgProfileGalleryDelete.visibility = View.VISIBLE
        holder.imgProfileGalleryDelete.setOnClickListener(View.OnClickListener {
            sinterface.onDeleteClicked(arrayList[position].Id)
        })*/
//        }
    }

    override fun getItemCount(): Int {
        return 20
    }

    /*fun updateAdapter(_arrayList: ArrayList<ApiDefinitionDto>) {
        this.arrayList = _arrayList;
        notifyDataSetChanged();
    }*/

}