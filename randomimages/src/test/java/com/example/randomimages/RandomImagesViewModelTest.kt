package com.example.randomimages

import org.junit.Assert.assertEquals
import org.junit.Test

class RandomImagesViewModelTest {

    private val viewModel = RandomImagesViewModel()

    @Test
    fun getRandomImageUrl_returnsExpectedUrl() {
        val expectedUrl = "https://picsum.photos/200"
        val result = viewModel.getRandomImageUrl()
        assertEquals(expectedUrl, result)
    }
}