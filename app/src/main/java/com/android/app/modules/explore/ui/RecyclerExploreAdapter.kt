package com.android.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.app.R
import com.android.app.databinding.RowExplore1Binding
import com.android.app.modules.explore.`data`.model.Explore1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerExploreAdapter(
  public var list: List<Explore1RowModel>
) : RecyclerView.Adapter<RecyclerExploreAdapter.RowExplore1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore1,parent,false)
    return RowExplore1VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore1VH, position: Int): Unit {
    val explore1RowModel = Explore1RowModel()
    // TODO uncomment following line after integration with data source
    // val explore1RowModel = list[position]
    holder.binding.explore1RowModel = explore1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore1RowModel
    ): Unit {
    }
  }

  public inner class RowExplore1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore1Binding = RowExplore1Binding.bind(itemView)
    init {
      binding.linearGroup.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Explore1RowModel())
      }
    }
  }
}
