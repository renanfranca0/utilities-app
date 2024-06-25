package com.example.randomimages

import androidx.lifecycle.ViewModel

class RandomImagesViewModel : ViewModel() {

    fun getRandomImageUrl(): String {
        return "https://picsum.photos/200"
    }
}