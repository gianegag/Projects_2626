package com.example.project_2626

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val btnFairy: Button = findViewById(R.id.buttonkid)

        btnFairy.setOnClickListener{
            val intent  =  Intent (this,BookKidActivity :: class.java)
            startActivity(intent)

        }

        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)

        rvBuku.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1, "hdihfihnsgfh",
        "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.book2, "hdihfihnsgfh",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.book1, "hdihfihnsgfh",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.book2, "hdihfihnsgfh",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.book1, "hdihfihnsgfh",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.book2, "hdihfihnsgfh",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))


       val adapter = AdapterHome(data)

       rvBuku.adapter = adapter
    }

}