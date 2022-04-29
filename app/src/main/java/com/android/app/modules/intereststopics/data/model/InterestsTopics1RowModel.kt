package com.android.app.modules.intereststopics.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsTopics1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtArt: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)

)
