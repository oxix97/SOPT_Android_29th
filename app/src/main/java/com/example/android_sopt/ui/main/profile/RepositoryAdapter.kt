package com.example.android_sopt.ui.main.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_sopt.data.main.RepositoryData
import com.example.android_sopt.databinding.ItemRepositoryBinding

class RepositoryAdapter : RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {
    val repositoryList = mutableListOf<RepositoryData>()

    inner class RepositoryViewHolder(private val binding: ItemRepositoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: RepositoryData) {
            with(binding) {
                tvRepositoryName.text = data.name
                tvRepositoryTitle.text = data.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val binding =
            ItemRepositoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RepositoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.onBind(repositoryList[position])
    }

    override fun getItemCount(): Int = repositoryList.size

}