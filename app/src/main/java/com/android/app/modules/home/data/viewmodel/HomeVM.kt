package com.android.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.home.`data`.model.Home1RowModel
import com.android.app.modules.home.`data`.model.HomeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class HomeVM : ViewModel(), KoinComponent {
  public val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  public var navArguments: Bundle? = null

  public val recyclerHomeList: MutableLiveData<MutableList<Home1RowModel>> =
      MutableLiveData(mutableListOf())
}
