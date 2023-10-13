package com.example.project_2626

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import javax.net.ssl.SSLSessionBindingEvent

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        //isntenace
        val btnFairy:Button=findViewById(R.id.buttonfairy)
        val btnfFable:Button=findViewById(R.id.buttonfabel)
        val btnSciene:Button=findViewById(R.id.buttonScience)



        val rvBuku: RecyclerView = findViewById(R.id.recyclerViewBuku)

        rvBuku.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.berhitung, "mahir berhitung",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.sopan, "aku tau sopan",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.surga, "surga di telapak kaki ibu ",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.wudhu, "ayo berwudhu",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.energicahayadanlistrik, "energi, cahaya dan listik",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))
        data.add(BukuModel(R.drawable.floradunia, "flora dunia",
            "loremghshghdighdeighdishhgdhgjhhuhgdhugh;dgh;hg;hg"))


        val adapter = AdapterHome(data)

        rvBuku.adapter = adapter
        btnFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }

        btnfFable.setOnClickListener{
            replaceFragment(FableFragment())
        }

        btnSciene.setOnClickListener{
            replaceFragment(SienceFragment())
        }
    }
    private fun replaceFragment (frg: Fragment) {
        val fragmentManager= supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }


}