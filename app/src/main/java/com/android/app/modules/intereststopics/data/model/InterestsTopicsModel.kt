package com.android.app.modules.intereststopics.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsTopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtARTSENTERTAI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arts_entertai)

)
