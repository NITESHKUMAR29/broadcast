package com.example.brodcastreciver

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.brodcastreciver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
       val action= intent.action
        val type=intent.type
        Log.d("nk/enter",action.toString())
        Log.d("nk/enter2",type.toString())
        if (Intent.ACTION_SEND == action && type!=null){
            Log.d("nk/enter3",Intent.EXTRA_STREAM)
            binding.image.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM))
        }
    }

    override fun onResume() {
        super.onResume()
    }
}