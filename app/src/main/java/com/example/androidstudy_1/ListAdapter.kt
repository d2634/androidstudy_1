package com.example.androidstudy_1

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter(val parent: Context?, val PromotionList: ArrayList<promotion_info>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(parent?.context).inflate(R.layout.info_promotion, null)
        val Name = view.findViewById<TextView>(R.id.name_pro)
        val Score = view.findViewById<TextView>(R.id.score_pro)
        val More = view.findViewById<TextView>(R.id.more_pro)
        val Price = view.findViewById<TextView>(R.id.price_pro)

        val promotion = PromotionList.get(position)
        Name.text = promotion.name
        Log.d("msg",promotion.name)
        Score.text = promotion.score
        More.text = promotion.more_info
        Price.text = promotion.price

        return view
    }

    override fun getItem(position: Int): Any {
        return PromotionList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return PromotionList.size
    }
}