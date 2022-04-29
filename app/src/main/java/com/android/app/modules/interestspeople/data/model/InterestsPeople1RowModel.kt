package com.android.app.modules.interestspeople.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsPeople1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumIs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)

)
