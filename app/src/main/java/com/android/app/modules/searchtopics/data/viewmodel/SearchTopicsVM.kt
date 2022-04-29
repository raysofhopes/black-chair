package com.android.app.modules.searchtopics.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.searchtopics.`data`.model.SearchTopicsModel
import org.koin.core.KoinComponent

public class SearchTopicsVM : ViewModel(), KoinComponent {
  public val searchTopicsModel: MutableLiveData<SearchTopicsModel> =
      MutableLiveData(SearchTopicsModel())

  public var navArguments: Bundle? = null
}
