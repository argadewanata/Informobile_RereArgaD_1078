package com.regata.mymovie.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.regata.mymovie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnLogin.setOnClickListener{

            val intentToMovieList = Intent(this, AllMovieActivity::class.java)
            startActivity(intentToMovieList)

        }

        setContentView(binding.root)
    }
}