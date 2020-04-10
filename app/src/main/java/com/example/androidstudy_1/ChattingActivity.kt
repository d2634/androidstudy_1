package com.example.androidstudy_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_chatting.*
import kotlinx.android.synthetic.main.service_costomer.*
import kotlinx.android.synthetic.main.service_costomer.toolbar_n

class ChattingActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting)
        setSupportActionBar(toolbar_n)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        val list = ArrayList<chattingItem>()
        list.add(chattingItem("와아아ㅏ아"))
        list.add(chattingItem("돼라돼라돼라"))
        list.add(chattingItem( getString(R.string.title03)))
        list.add(chattingItem( getString(R.string.title04)))
        list.add(chattingItem( getString(R.string.title05)))
        list.add(chattingItem( getString(R.string.title06)))
        list.add(chattingItem( getString(R.string.title07)))
        list.add(chattingItem( getString(R.string.title08)))

        val adapter = RecyclerAdapter(list)
        recyclerView.adapter = adapter
    }
}