package com.example.dice_rolley

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dice_rolley.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit  var diceImage:ImageView
    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val  view = binding.root
        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
            rollDice()

        } }
    private fun rollDice() {
    val randomInt  = Random().nextInt(6) + 1
val  drawableResource = when (randomInt) {
    1-> R.drawable.dice_1
    2-> R.drawable.dice_2
    3-> R.drawable.dice_3
    4-> R.drawable.dice_4
    5-> R.drawable.dice_5
    else ->
        R.drawable.dice_6
}
 val  diceImage: ImageView =  findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)

    }
}