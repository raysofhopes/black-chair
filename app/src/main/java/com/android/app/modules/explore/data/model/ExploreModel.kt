package com.android.app.modules.explore.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRECOMMENDEDFOR: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchValue: String? = null
)
