package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    private var items = ArrayList<Data>()

    class DataViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val dataIDView: TextView by lazy { view.findViewById(R.id.person_id) }
        private val dataNameView: TextView by lazy { view.findViewById(R.id.person_name) }
        private val dataAgeView: TextView by lazy { view.findViewById(R.id.person_age) }

        fun bindData(data: Data) {
            dataIDView.text = data.id.toString()
            dataNameView.text = data.name
            dataAgeView.text = data.age.toString()
        }
    }

    fun setData(data: ArrayList<Data>) {
        items.clear()
        items.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.generic_data, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    override fun getItemCount() = items.size
}