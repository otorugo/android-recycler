package com.example.recycler

class DataSource {
    companion object {
        fun generateData(): ArrayList<Data> {
            val aList = ArrayList<Data>()
            for (i in 0..22) {
                aList.add(Data(i, "Victor Hugo", 20 + i))
            }
            return aList

        }
    }
}