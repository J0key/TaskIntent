package com.example.intent

import android.content.Intent
import android.net.Uri
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

            instagram.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.linkedin.com/in/shyrath3104/")
                startActivity(intent)
            }

            linkedin.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.instagram.com/shy.ath/")
                startActivity(intent)
            }

            github.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://github.com/J0key")
                startActivity(intent)
            }


        }

    }
}