package com.android.app.modules.interestspeople.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsPeopleModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSEEALLPEOPLE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_see_all_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMOREPEOPLETO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_people_to)

)
