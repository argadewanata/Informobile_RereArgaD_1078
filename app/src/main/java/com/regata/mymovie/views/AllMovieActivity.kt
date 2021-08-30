package com.regata.mymovie.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.regata.mymovie.R
import com.regata.mymovie.databinding.ActivityAllMovieBinding
import com.regata.mymovie.utils.DataDummy

class AllMovieActivity : AppCompatActivity() {

    private var _binding:ActivityAllMovieBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewadapter : AllMovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        _binding = ActivityAllMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewadapter = AllMovieAdapter()

        binding.rvList.apply{
            //layoutManager = LinearLayoutManager(this@AllMovieActivity, LinearLayoutManager.HORIZONTAL, false)
            layoutManager = GridLayoutManager(this@AllMovieActivity,3)
            adapter       = viewadapter
        }

        viewadapter.setList(DataDummy.getMovies())

    }

}