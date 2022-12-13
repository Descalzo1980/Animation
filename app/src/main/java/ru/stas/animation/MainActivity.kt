package ru.stas.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import ru.stas.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clkRotateButton.setOnClickListener() {
            val clkRotateButton = AnimationUtils.loadAnimation(this,R.anim.rotate_clockwise)
            binding.imageView.startAnimation(clkRotateButton)
        }

        binding.anticlkRotateButton.setOnClickListener {
            val antiRotate = AnimationUtils.loadAnimation(this,R.anim.rotate_anticlockwise)
            binding.imageView.startAnimation(antiRotate)
        }
        var temp = false
        binding.buttonInvisible.setOnClickListener {
            val textView = binding.textView
            if(!temp){
                textView.visibility = View.INVISIBLE
                Toast.makeText(applicationContext, "Invisible", Toast.LENGTH_SHORT).show()
            }else{
                textView.visibility = View.VISIBLE
                Toast.makeText(applicationContext, "Visible", Toast.LENGTH_SHORT).show()
            }
            temp = !temp
        }

    }
}