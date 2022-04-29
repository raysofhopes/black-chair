package com.android.app.modules.notifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.app.R
import com.android.app.databinding.RowNotifications1Binding
import com.android.app.modules.notifications.`data`.model.Notifications1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerNotificationsAdapter(
  public var list: List<Notifications1RowModel>
) : RecyclerView.Adapter<RecyclerNotificationsAdapter.RowNotifications1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotifications1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notifications1,parent,false)
    return RowNotifications1VH(view)
  }

  public override fun onBindViewHolder(holder: RowNotifications1VH, position: Int): Unit {
    val notifications1RowModel = Notifications1RowModel()
    // TODO uncomment following line after integration with data source
    // val notifications1RowModel = list[position]
    holder.binding.notifications1RowModel = notifications1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Notifications1RowModel>): Unit {
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
      item: Notifications1RowModel
    ): Unit {
    }
  }

  public inner class RowNotifications1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotifications1Binding = RowNotifications1Binding.bind(itemView)
  }
}
