package com.android.app.modules.notifications.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.notifications.`data`.model.Notifications1RowModel
import com.android.app.modules.notifications.`data`.model.NotificationsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class NotificationsVM : ViewModel(), KoinComponent {
  public val notificationsModel: MutableLiveData<NotificationsModel> =
      MutableLiveData(NotificationsModel())

  public var navArguments: Bundle? = null

  public val recyclerNotificationsList: MutableLiveData<MutableList<Notifications1RowModel>> =
      MutableLiveData(mutableListOf())
}
