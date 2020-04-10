package com.example.androidstudy_1

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_two.*


class two : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabs.setTabTextColors(
            Color.parseColor("#000000"),
            Color.parseColor("#287EF9")
        )
        val context = context as MainActivity
        var PromotionList = arrayListOf<promotion_info>(
            promotion_info("용인 에버랜드 입장권^^^^^","5.0/5","인기상품","22,900원"),
            promotion_info("서울 N서울타워 전망대 입장권","4.6/5","39%할인","6,035원"),
            promotion_info("인천 강화도 일일투어","5.0/5","11%할인","61,869원")
        )
        //val lv = context.findViewById(R.id.list_view) as ListView
        //val Adapter = ListAdapter(context, PromotionList)
        //lv.adapter = Adapter
    }
}