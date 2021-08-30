package com.regata.mymovie.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object ExtensionFunction {
        fun ImageView.setPicture(url: String){
            Glide.with(this.context)
                .load(url)
                .apply(
                    RequestOptions()
                        .override (400,400)
                )
                .into(this)

        }

}