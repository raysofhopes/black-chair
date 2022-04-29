package com.android.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.app.R
import com.android.app.databinding.RowHome1Binding
import com.android.app.modules.home.`data`.model.Home1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerHomeAdapter(
  public var list: List<Home1RowModel>
) : RecyclerView.Adapter<RecyclerHomeAdapter.RowHome1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHome1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home1,parent,false)
    return RowHome1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHome1VH, position: Int): Unit {
    val home1RowModel = Home1RowModel()
    // TODO uncomment following line after integration with data source
    // val home1RowModel = list[position]
    holder.binding.home1RowModel = home1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Home1RowModel>): Unit {
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
      item: Home1RowModel
    ): Unit {
    }
  }

  public inner class RowHome1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHome1Binding = RowHome1Binding.bind(itemView)
    init {
      binding.linearGroup.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Home1RowModel())
      }
    }
  }
}
