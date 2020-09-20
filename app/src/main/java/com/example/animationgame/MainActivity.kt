package com.example.animationgame

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img: ImageView = findViewById(R.id.pinguin)
        val btStart = findViewById<Button>(R.id.buttonStart)
        val btCatch: Button = findViewById(R.id.buttonCatch)

        btStart.setOnClickListener {
            var an: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_trans)
            an.duration = 5000
            img.startAnimation(an)
        }

//        btCatch.setOnClickListener {
//            var an: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_trans)
//            Animator.
//        }

    }
}