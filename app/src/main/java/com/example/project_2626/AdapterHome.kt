package com.example.project_2626

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterHome (private val listbuku:List<BukuModel>):
                                            RecyclerView.Adapter<AdapterHome.ViewHolder>(){

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageCover1)
        val title:TextView = itemView.findViewById(R.id.textViewJudul1)
        val desc:TextView = itemView.findViewById(R.id.textViewSinopsis1)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterHome.ViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(
          R.layout.card_layout_home,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterHome.ViewHolder, position: Int) {
       val modelBuku = listbuku[position]

        holder.image.setImageResource(modelBuku.image)
        holder.title.text = modelBuku.tittle
        holder.desc.text = modelBuku.desc
    }

    override fun getItemCount(): Int {
        return listbuku.size
    }
}