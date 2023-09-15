package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent.databinding.ActivityThirdBinding

class activity_third : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    private val TAG = "MainActivityLifecycle"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            loginBtn.setOnClickListener{
                val intentfirst = Intent(this@activity_third, activity_second::class.java)
                startActivity(intentfirst)
            }

            register2.setOnClickListener{
                val intentsec = Intent(this@activity_third, MainActivity::class.java)
                startActivity(intentsec)
            }
        }

    }
}