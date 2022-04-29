package com.android.app.modules.explore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.explore.`data`.model.Explore1RowModel
import com.android.app.modules.explore.`data`.model.ExploreModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class ExploreVM : ViewModel(), KoinComponent {
  public val exploreModel: MutableLiveData<ExploreModel> = MutableLiveData(ExploreModel())

  public var navArguments: Bundle? = null

  public val recyclerExploreList: MutableLiveData<MutableList<Explore1RowModel>> =
      MutableLiveData(mutableListOf())
}
