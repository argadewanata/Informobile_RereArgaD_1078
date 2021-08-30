package com.regata.mymovie.utils

import com.regata.mymovie.data.Movie

object DataDummy {
    fun getMovies(): List<Movie> {
        val list = ArrayList<Movie>()

        list.add(
            Movie(
                title = "Black Panther(2018)",
                image = "https://picsum.photos/200"
            )
        )

        list.add(
            Movie(
                title = "Venom(2018)",
                image = "https://picsum.photos/210"
            )
        )

        list.add(
            Movie(
                title = "Aquaman(2018)",
                image = "https://picsum.photos/220"
            )
        )

        list.add(
            Movie(
                title = "Deadpool(2018)",
                image = "https://picsum.photos/230"
            )
        )

        list.add(
            Movie(
                title = "Pengabdi Setan(2018)",
                image = "https://picsum.photos/240"
            )
        )

        list.add(
            Movie(
                title = "Danur(2018)",
                image = "https://picsum.photos/250"
            )
        )

        list.add(
            Movie(
                title = "Avenger(2018)",
                image = "https://picsum.photos/260"
            )
        )

        list.add(
            Movie(
                title = "IT(2018)",
                image = "https://picsum.photos/270"
            )
        )

        list.add(
            Movie(
                title = "Luca(2018)",
                image = "https://picsum.photos/280"
            )
        )

        list.add(
            Movie(
                title = "Finding Nemo(2018)",
                image = "https://picsum.photos/290"
            )
        )

        list.add(
            Movie(
                title = "Toy Story(2018)",
                image = "https://picsum.photos/300"
            )
        )

        list.add(
            Movie(
                title = "Soul(2018)",
                image = "https://picsum.photos/310"
            )
        )

        list.add(
            Movie(
                title = "Brave(2018)",
                image = "https://picsum.photos/320"
            )
        )

        list.add(
            Movie(
                title = "Monster Inc.(2018)",
                image = "https://picsum.photos/330"
            )
        )

        list.add(
            Movie(
                title = "Forest Gump(2018)",
                image = "https://picsum.photos/340"
            )
        )

      return list
    }
}