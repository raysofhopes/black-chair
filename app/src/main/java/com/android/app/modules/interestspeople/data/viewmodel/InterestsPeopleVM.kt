package com.android.app.modules.interestspeople.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.interestspeople.`data`.model.InterestsPeople1RowModel
import com.android.app.modules.interestspeople.`data`.model.InterestsPeopleModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class InterestsPeopleVM : ViewModel(), KoinComponent {
  public val interestsPeopleModel: MutableLiveData<InterestsPeopleModel> =
      MutableLiveData(InterestsPeopleModel())

  public var navArguments: Bundle? = null

  public val recyclerInterestsPeopleList: MutableLiveData<MutableList<InterestsPeople1RowModel>> =
      MutableLiveData(mutableListOf())
}
