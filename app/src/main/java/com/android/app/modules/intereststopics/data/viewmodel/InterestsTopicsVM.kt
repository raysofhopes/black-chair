package com.android.app.modules.intereststopics.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.intereststopics.`data`.model.InterestsTopics1RowModel
import com.android.app.modules.intereststopics.`data`.model.InterestsTopicsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class InterestsTopicsVM : ViewModel(), KoinComponent {
  public val interestsTopicsModel: MutableLiveData<InterestsTopicsModel> =
      MutableLiveData(InterestsTopicsModel())

  public var navArguments: Bundle? = null

  public val recyclerInterestsTopicsList: MutableLiveData<MutableList<InterestsTopics1RowModel>> =
      MutableLiveData(mutableListOf())
}
