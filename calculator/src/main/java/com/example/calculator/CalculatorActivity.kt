package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding
    private lateinit var viewModel: CalculatorViewModel

    private var firstNumber = 0.0
    private var secondNumber = 0.0
    private var operation = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.apply {
            button1.setOnClickListener { appendNumber("1") }
            button2.setOnClickListener { appendNumber("2") }
            button3.setOnClickListener { appendNumber("3") }
            button4.setOnClickListener { appendNumber("4") }
            button5.setOnClickListener { appendNumber("5") }
            button6.setOnClickListener { appendNumber("6") }
            button7.setOnClickListener { appendNumber("7") }
            button8.setOnClickListener { appendNumber("8") }
            button9.setOnClickListener { appendNumber("9") }
            button0.setOnClickListener { appendNumber("0") }
            buttonAdd.setOnClickListener { performOperation("+") }
            buttonSubtract.setOnClickListener { performOperation("-") }
            buttonMultiply.setOnClickListener { performOperation("*") }
            buttonDivide.setOnClickListener { performOperation("/") }
            buttonEquals.setOnClickListener { calculateResult() }
        }
    }

    private fun appendNumber(number: String) {
        with(binding.result) {
            text = if (text == "0") {
                number
            } else {
                text.toString() + number
            }

            if (operation.isNotEmpty()) {
                secondNumber = number.toDouble()
            }
        }

    }

    private fun performOperation(operation: String) {
        with(binding.result) {
            firstNumber = text.toString().toDouble()
            text.toString() + operation
        }
        this.operation = operation
    }

    private fun calculateResult() {
        val result = when (operation) {
            "+" -> viewModel.add(firstNumber, secondNumber)
            "-" -> viewModel.subtract(firstNumber, secondNumber)
            "*" -> viewModel.multiply(firstNumber, secondNumber)
            "/" -> viewModel.divide(firstNumber, secondNumber)
            else -> 0
        }

        binding.result.text = result.toString()
    }
}