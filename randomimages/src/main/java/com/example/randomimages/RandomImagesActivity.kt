package com.example.randomimages

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class RandomImagesActivity : AppCompatActivity() {

    private var viewModel = RandomImagesViewModel()
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_images)
        imageView = findViewById(R.id.imageView)
        loadImage()
    }

    private fun loadImage() {
        val imageUrl = viewModel.getRandomImageUrl()
        Glide
            .with(this)
            .load(imageUrl)
            .into(imageView)
    }
}