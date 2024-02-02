package com.example.day18viewbinding

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.day18viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.button.setOnClickListener {

    if (binding.checkBox.isChecked){
        intent = Intent(this@MainActivity, Homepage::class.java)
        startActivity(intent)
    }else{
            binding.checkBox.buttonTintList= ColorStateList.valueOf(Color.RED)

        Toast.makeText(this@MainActivity, "please accept the T&C! ",Toast.LENGTH_SHORT).show()

    }


}
    }
}