package com.android.app.modules.notifications.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)

)
