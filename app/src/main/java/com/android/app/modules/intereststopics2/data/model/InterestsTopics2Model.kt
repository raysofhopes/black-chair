package com.android.app.modules.intereststopics2.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsTopics2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterests: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)

)
