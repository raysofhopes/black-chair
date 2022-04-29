package com.android.app.modules.interests.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.interests.`data`.model.InterestsModel
import org.koin.core.KoinComponent

public class InterestsVM : ViewModel(), KoinComponent {
  public val interestsModel: MutableLiveData<InterestsModel> = MutableLiveData(InterestsModel())

  public var navArguments: Bundle? = null
}
