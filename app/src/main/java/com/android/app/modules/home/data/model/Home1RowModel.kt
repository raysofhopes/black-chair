package com.android.app.modules.home.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class Home1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLOGO: String? = MyApp.getInstance().resources.getString(R.string.lbl_logo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt16DaysAgo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_16_days_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3MinRead: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_min_read)

)
