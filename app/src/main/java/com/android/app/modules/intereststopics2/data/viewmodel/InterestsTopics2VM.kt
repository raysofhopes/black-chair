package com.android.app.modules.intereststopics2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.intereststopics2.`data`.model.InterestsTopics2Model
import org.koin.core.KoinComponent

public class InterestsTopics2VM : ViewModel(), KoinComponent {
  public val interestsTopics2Model: MutableLiveData<InterestsTopics2Model> =
      MutableLiveData(InterestsTopics2Model())

  public var navArguments: Bundle? = null
}
