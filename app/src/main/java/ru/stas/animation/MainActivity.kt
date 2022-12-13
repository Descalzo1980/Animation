package ru.stas.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
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

    }
}