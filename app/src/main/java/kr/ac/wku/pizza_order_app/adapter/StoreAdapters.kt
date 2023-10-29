package kr.ac.wku.pizza_order_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kr.ac.wku.pizza_order_app.R
import kr.ac.wku.pizza_order_app.datas.StoreData

class StoreAdapters (
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {

            tempRow = inf.inflate(R.layout.pizza_store_list_item, null)

        }

        val row = tempRow!!


        val data = mList[position]

        val imgLogo = row.findViewById<ImageView>( R.id.imgLogo )
        val txtStoreName = row.findViewById<TextView>(R.id.txtStoreName)

        txtStoreName.text = data.name

        Glide.with(mContext).load(data.logoURL).into(imgLogo)


        return row

    }
}