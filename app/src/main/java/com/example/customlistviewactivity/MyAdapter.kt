package com.example.customlistviewactivity

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mCtx:Context,var resources:
Int,var items:List<model>):ArrayAdapter<model>(mCtx,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mCtx)
        val view:View=layoutInflater.inflate(resources,null)

        val imageview:ImageView=view.findViewById(R.id.image)
        val titleTextView:TextView=view.findViewById(R.id.textmain)
        val descriptionTextView:TextView=view.findViewById(R.id.txt_sub)

        val mItem:model=items[position]
        imageview.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text=mItem.title
        descriptionTextView.text=mItem.description
        return view

    }
}