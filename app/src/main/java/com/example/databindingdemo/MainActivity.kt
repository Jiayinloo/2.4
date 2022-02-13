package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val s:Student =Student("21WMD05288","Loo Jia Yin")

       binding.myData=s
        //binding.tvID.text="21WMD05288"
        binding.btnUpdate.setOnClickListener(){
            s.studentName="Jia Yin"

            binding.apply{
                invalidateAll()
            }
        }
        //val tv:TextView=findviewbyId(R.id.tvName)
    }
}