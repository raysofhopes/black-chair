package com.android.app.modules.notifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseActivity
import com.android.app.databinding.ActivityNotificationsBinding
import com.android.app.modules.notifications.`data`.model.Notifications1RowModel
import com.android.app.modules.notifications.`data`.viewmodel.NotificationsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationsActivity :
    BaseActivity<ActivityNotificationsBinding>(R.layout.activity_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerNotificationsAdapter =
    RecyclerNotificationsAdapter(viewModel.recyclerNotificationsList.value?:mutableListOf())
    binding.recyclerNotifications.adapter = recyclerNotificationsAdapter
    recyclerNotificationsAdapter.setOnItemClickListener(
    object : RecyclerNotificationsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Notifications1RowModel) {
        onClickRecyclerNotifications(view, position, item)
      }
    }
    )
    viewModel.recyclerNotificationsList.observe(this) {
      recyclerNotificationsAdapter.updateData(it)
    }
    binding.notificationsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerNotifications(
    view: View,
    position: Int,
    item: Notifications1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "NOTIFICATIONS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
