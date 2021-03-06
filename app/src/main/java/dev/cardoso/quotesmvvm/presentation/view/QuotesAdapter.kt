package dev.cardoso.quotesmvvm.presentation.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.cardoso.quotesmvvm.data.model.QuoteModel
import dev.cardoso.quotesmvvm.databinding.QuoteItemBinding

class QuotesAdapter(val quoteList: List<QuoteModel>) : RecyclerView.Adapter<QuotesAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: QuoteItemBinding)
        : RecyclerView.ViewHolder(binding.root){
        private var currentQuote: QuoteModel? = null

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = QuoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(quoteList[position]){
                binding.tvItemQuote.setText(this.quote)
                binding.tvItemAuthor.setText(this.author)

            }
        }
    }

    override fun getItemCount(): Int {
        return quoteList.size
    }

}
