package com.example.calculator

import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        if (b != 0.0) {
            return a / b
        } else {
            throw IllegalArgumentException("Divisão por zero não é permitida")
        }
    }
}