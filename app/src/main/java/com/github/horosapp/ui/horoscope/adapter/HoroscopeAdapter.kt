package com.github.horosapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.horosapp.R
import com.github.horosapp.domain.HoroscopeInfo

class HoroscopeAdapter(private var horoscopeList:List<HoroscopeInfo> = emptyList()): RecyclerView.Adapter<HoroscopeViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HoroscopeViewHolder {
        return HoroscopeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent,false))
    }

    override fun onBindViewHolder(
        holder: HoroscopeViewHolder,
        position: Int
    ) {
//holder.render(horoscopeList[position])

        }

    override fun getItemCount()=horoscopeList.size

}