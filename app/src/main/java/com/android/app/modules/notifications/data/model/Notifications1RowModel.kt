package com.android.app.modules.notifications.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class Notifications1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBezaleelNwabia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bezaleel_nwabia)

)
