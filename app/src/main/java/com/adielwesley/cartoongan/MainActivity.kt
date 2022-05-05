package com.adielwesley.cartoongan

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap
import com.adielwesley.cartoongan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var original: Bitmap? = null

    // To do: create model variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loadOriginalButton.setOnClickListener { onLoadOriginalImageClicked() }
        binding.cartoonizeButton.setOnClickListener { onCartoonizeClicked() }

        // To do: create model options to set GPU as hardware accelerator

        // To do: initialize model
    }

    override fun onDestroy() {
        super.onDestroy()

        // To do: release memory
    }

    private fun onCartoonizeClicked() {
        original?.let {
            // To do: prepare input

            // To do: run model

            // To do: handle output
        }
    }

    private fun onLoadOriginalImageClicked() {
        getContent.launch("image/*")
    }

    private val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) {
        binding.originalImageView.setImageURI(it)
        original = binding.originalImageView.drawable.toBitmap()
    }
}