package com.regata.mymovie.views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.regata.mymovie.data.Movie
import com.regata.mymovie.databinding.ListItemBinding
import com.regata.mymovie.utils.ExtensionFunction.setPicture

class AllMovieAdapter : RecyclerView.Adapter<AllMovieAdapter.AllMovieHolder>() {

    private val listItem = ArrayList<Movie>()

    fun setList(list: List<Movie>){
        if (list == null) return

        listItem.clear()
        listItem.addAll(list)
        notifyDataSetChanged()
    }

    inner class AllMovieHolder(private val binding:ListItemBinding):
        RecyclerView.ViewHolder(binding.root) {
            fun bind(movie: Movie){
                binding.testTitle.text = movie.title
                binding.imgTest.setPicture (movie.image)

            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllMovieHolder {
        val itemBinding =
            ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AllMovieHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: AllMovieHolder, position: Int) {
        val movie = listItem[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listItem.size


}