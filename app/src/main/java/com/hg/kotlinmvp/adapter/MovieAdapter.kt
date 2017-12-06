package com.hg.kotlinmvp.adapter

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.hg.kotlinmvp.R
import com.hg.kotlinmvp.data.Movie

/**
 * Created by HStan on 2017/12/1.
 *
 */
class MovieAdapter(var context: Context, var list: List<Movie>) : RecyclerView.Adapter<MovieAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemViewHolder {
        val view: View = LayoutInflater.from(parent?.getContext()).inflate(R.layout.movie_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder?, position: Int) {
        val movie = list[position]
        val mType = StringBuilder("")
        for (i in 0 until movie.genres.size) {
            if (i < movie.genres.size - 1) {
                val str = StringBuilder(movie.genres[i] + "、")
                mType.append(str)
            } else {
                mType.append(movie.genres[i])
            }
        }

        if (holder != null) {
            Glide.with(context).load(movie.images.small).into(holder.images)
            holder.title.text = movie.title
            val watched: Int = movie.collect_count
            holder.collect.text = "${watched}人看过"
            holder.orig_title.text = movie.original_title
            holder.rating.text = movie.rating.average.toString()
            holder.type.text = mType
        }
        if (movie.directors.isNotEmpty()) {
            val d = StringBuilder("导演：")
            d.append(movie.directors[0].name)
            holder?.director?.text = d
        }
        if (movie.casts.isNotEmpty()) {
            val cast = StringBuilder("主演：")
            val count = if (movie.casts.size > 2) 2 else movie.casts.size
            for (i in 0 until count) {
                if (i < count - 1) {
                    cast.append(movie.casts[i].name + "/")
                } else {
                    cast.append(movie.casts[i].name)
                }
            }
            holder?.starring?.text = cast
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title: TextView = itemView.findViewById(R.id.title)
        var orig_title: TextView = itemView.findViewById(R.id.original_title)
        var rating: TextView = itemView.findViewById(R.id.rating)
        var type: TextView = itemView.findViewById(R.id.movie_type)
        var collect: TextView = itemView.findViewById(R.id.collect_number)
        var director: TextView = itemView.findViewById(R.id.director_name)
        var starring: TextView = itemView.findViewById(R.id.starring)
        var images: ImageView = itemView.findViewById(R.id.image)

    }
}