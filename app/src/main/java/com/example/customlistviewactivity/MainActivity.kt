package com.example.customlistviewactivity

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<model>()

        //adding images
       list.add(model("Red","Red color are always attractive",R.drawable.r1))
        list.add(model("Pink","Pink color have the best smell",R.drawable.r2))
        list.add(model("Red","Red are always used for surprises",R.drawable.r3))
        list.add(model("flower red","always beautiful",R.drawable.r4))
        list.add(model("flower red","always colourful",R.drawable.r5))
        list.add(model("purple","flower purple",R.drawable.r6))

        listView.adapter=MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{ parent:AdapterView<*>, view:View, position:Int, id:Long->
          if (position==0){
              Toast.makeText(this@MainActivity,"You have clicked red flower!",Toast.LENGTH_LONG).show()
          }
            if (position==1){
                Toast.makeText(this@MainActivity,"You have clicked pink flower!",Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity,"You have clicked red flower!",Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity,"You have clicked red flower!",Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity,"You have clicked red flower!",Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@MainActivity,"You have clicked purple flower!",Toast.LENGTH_LONG).show()
            }
        }

    }
}