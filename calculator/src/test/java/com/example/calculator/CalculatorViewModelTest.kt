package com.example.calculator

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorViewModelTest {

    private val viewModel = CalculatorViewModel()

    @Test
    fun add_numbers() {
        val result = viewModel.add(2.0, 3.0)
        assertEquals(5.0, result, 0.001)
    }

    @Test
    fun subtract_numbers() {
        val result = viewModel.subtract(5.0, 2.0)
        assertEquals(3.0, result, 0.001)
    }

    @Test
    fun multiply_numbers() {
        val result = viewModel.multiply(3.0, 2.0)
        assertEquals(6.0, result, 0.001)
    }

    @Test
    fun divide_numbers() {
        val result = viewModel.divide(6.0, 2.0)
        assertEquals(3.0, result, 0.001)
    }

    @Test(expected = IllegalArgumentException::class)
    fun divide_by_zero() {
        viewModel.divide(6.0, 0.0)
    }
}